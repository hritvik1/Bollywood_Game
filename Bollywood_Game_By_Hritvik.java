//Game Coded By ~Hritvik~
import java.util.Scanner;
class Bollywood_Game_By_Hritvik
{
    static String player_1,player_2;
    static Scanner scan = new Scanner(System.in);
    static StringBuffer sb1 = new StringBuffer("");
    static StringBuffer sb2 = new StringBuffer("");
    public static void instructions()                                        //Printing Instructions On Screen
    {
        System.out.println ("\n\n");
        System.out.println ("     --------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println ("\t\t\t\t\t\t\t\tWelcome To BollyWood Game");
        System.out.println ("\t\t\t\t\t\t\t\t     ~By Hritvik Maini\n\n");
        System.out.println ("\t\t\t\t\t\t\t\t\tInstructions:");
        System.out.println ("\t\t\t\t\t\t\t      Rules Of BOLLYWOOD Game Are Same.");
        System.out.println ("\t\t\t\t\t\t Player 1 Gives A Movie Name & Player 2 Guesses That Movie Name.");
        System.out.println ("\t\t\t    According To Rules, As There Are 9 Characters In Word 'BOLLYWOOD' So Player 2 have 9 Chances To Guess That Movie.");
        System.out.println ("\t\t\t\t\t     Initially Vowels Of Given Movie Name & Blank Spaces Are Shown For Hint.");
        System.out.println ("\t\t\t\t\t\t  Note: Spaces Can Be Given In Movie Name And Are Also Counted.");
        System.out.println ("\t\t\t\t     If Player 2 Guesses Movie Name Before The Chances Are Zero, He/She Will Win Otherwise Loses.");
        System.out.println ("\t\t\t\t\t\t\t\t      So, Let's PLAY!!!\n\n");
    }
    public static void getMovieName()                                         //Gets Movie Name From Player 1
    {
        System.out.println("\tGive Any Movie Name To Player 2\n");
        System.out.print("\tEnter Any Movie Name: ");
        sb1.append(scan.nextLine());
        sb2.setLength(sb1.length());
    }
    public static void cls()                                                     //Used To Clear The Screen After Player 1 Has Entered Movie Name
    {   
	    try
        {	
		    new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }
        catch(Exception E)
		{
			System.out.println(E);
		}
    }
    public static void getName()                                                //Used To get Both Player Names
    {
        System.out.print("\tEnter Player 1 Name: ");
        player_1 = scan.nextLine();
        System.out.print("\tEnter Player 2 Name: ");
        player_2 = scan.nextLine();
        System.out.println("\n\t\t\t\t\t\t\t\t    " + player_1 + " v/s " + player_2);
        System.out.println("\n");
    }
    public static void main(String args[])                                  //Main Game Logic
    {
        instructions();
        getName();
        getMovieName();
        cls();
        System.out.println("\n\t Player 2's Turn To Guess Movie Given By Player 1\n");
        int i,score,flag_1=0,flag_2=0;
        char guess;
        score=9;
        for(i=0;i<sb1.length();i++)
        {
            if(sb1.charAt(i)=='a' || sb1.charAt(i)=='e' || sb1.charAt(i)=='i' || sb1.charAt(i)=='o' || sb1.charAt(i)=='u')
            {
                sb2.setCharAt(i,sb1.charAt(i));
            }
            else
            {
                sb2.setCharAt(i,'_');
            }
        }
        while(score>0)
        {
            System.out.println ("     --------------------------------------------------------------------------------------------------------------------------------------------------\n");
            System.out.println("\t\t\t\t\t\t\t\t      Chances Left: "+score);
            System.out.print("\t");
            for(i=0;i<sb2.length();i++)
            {
                System.out.print(" " + sb2.charAt(i));
            }
            System.out.println("\n");
            flag_2 = 0;
            System.out.print("\tEnter Choise: ");
            guess = scan.nextLine().charAt(0);
            for(i=0;i<sb1.length();i++)
            {
                if(sb1.toString().equals(sb2.toString()))
                {
                    flag_1 = 1;
                    break;
                }
                if(sb1.charAt(i)==guess)
                {
                    flag_2 = 1;
                    sb2.setCharAt(i,guess);
                }
            }
            System.out.println ("     --------------------------------------------------------------------------------------------------------------------------------------------------\n");
            if(flag_1==1)
            {
                System.out.println ("     **************************************************************************************************************************************************\n");
                System.out.println("\t\t\t\t\t\t\t   " + player_2 + " (Player 2) WINS With " + score + "/9 Chances Left.\n");
                System.out.println("\t\t\t\t\t\t\t\t       Movie Name: " + sb1 + "\n");
                System.out.println ("     **************************************************************************************************************************************************\n");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tBOLLYWOOD Game v1.2");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCoded By: ~Hritvik Maini");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSubmitted To: Manik Sir (CU-HP)");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tLanguage Used: JAVA (JDK v13.0.1)");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEditor Used: VS Code v1.42");
                break;
            }
            if(flag_2==0)
            {
                score = score-1;
            }
        }
        if(score==0)
        {
            System.out.println ("     **************************************************************************************************************************************************\n");
            System.out.println("\t\t\t\t\t\t\t   " + player_2 + " (Player 2) LOSES With " + score + "/9 Chances Left.\n");
            System.out.println("\t\t\t\t\t\t\t\t       Movie Name: " + sb1 + "\n");
            System.out.println ("     **************************************************************************************************************************************************\n");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tBOLLYWOOD Game v1.2");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCoded By: ~Hritvik Maini");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSubmitted To: Manik Sir (CU-HP)");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tLanguage Used: JAVA (JDK v13.0.1)");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEditor Used: VS Code v1.42");
        }
        scan.close();
    }
}