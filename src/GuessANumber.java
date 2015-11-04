import java.util.Scanner; 

public class GuessANumber // Lab 4 of Week 10
{
    public static void main(String [] args)
    
    {
       RandomNumber myRandomNumber = new RandomNumber();
       Scanner input = new Scanner(System.in);
       
       int i = 0;
       int size = 10;
       int[] evenGuess = new int[size];
       int[] oddGuess = new int[size];
       int[] won = new int[size];
       int[] lost = new int[size];
       int[] compNum = new int[size];
       int[] round = new int[size];
       String a1 = "Guess if the two sided dice is odd or even. ";
       String a2 = "Enter 1 for odd or 2 for even";
       
       System.out.println("Input a low number for your low bound: ");
           int lowGuess = input.nextInt();
           myRandomNumber.setLowNumber(lowGuess);
           System.out.println();
           
           System.out.println("Input a high number for your high bound: ");
           int highGuess = input.nextInt();
           myRandomNumber.setHighNumber(highGuess);
           System.out.println();
       while (i < 10)
       {
           
           
           compNum[i] = myRandomNumber.GetANumber();
           System.out.print(a1 + a2 + compNum[i]);
           int ans = input.nextInt();

           if ((ans < 1) || (ans > 2))
           {
               System.out.println("Please use either 1 or 2.");
           }
            
           else 
            {
                if ((ans == 2 && compNum[i] % 2 == 0))
                {
                    evenGuess[i] = 1;
                    won[i] = 1;
                    System.out.println("You guessed correct");
                }
                else if ((ans == 1 && compNum[i] == 1) || (ans == 1 && compNum[i] == 3) || (ans == 1 && compNum[i] == 5) || (ans == 1 && compNum[i] == 7) || (ans == 1 && compNum[i] == 9))
                {
                    oddGuess[i] = 1;
                    won[i] = 1;
                    System.out.println("You guessed correct");
                }
                else if ((ans == 2 && compNum[i] == 1) || (ans == 2 && compNum[i] == 3) || (ans == 2 && compNum[i] == 5) || (ans == 2 && compNum[i] == 7) || (ans == 2 && compNum[i] == 9))
                {
                    evenGuess[i] = 1;
                    lost[i] = 1;
                    System.out.println("You guessed wrong");
                }
                else
                {
                    oddGuess[i] = 1;
                    lost[i] = 1;
                    System.out.println("You guessed wrong");
                }
                round[i] = i + 1;
                i++;
            }
        }
            i = 0;
            while (i < 10)
            {
            System.out.printf("Your record. Round:%d Odd Guess:%d Even Guess:%d Wins:%d%n", round[i], oddGuess[i], evenGuess[i], won[i]);
            i++;
            } 

}
}