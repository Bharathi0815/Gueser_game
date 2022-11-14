import java.util.*;

public class Guessergame {
    public static void main(String[] args) {
    Referee refObj=new Referee();
  refObj.collectNumFromGuesser();
   refObj.collectNumFromPlayer1();
   refObj.collectNumFromPlayer2();
   refObj.collectNumFromPlayer3();
        refObj.compare();



    }
}

    class Guesser {


        int guessernum;
        boolean gnum = false;
        int getGuessernum()

        {
            Scanner scan = new Scanner(System.in);

            while (gnum == false) {
                System.out.println("Guesser kindly guess the number between 1 and 10 :");
                guessernum = scan.nextInt();
                if (guessernum >= 1 && guessernum <= 10 ) {
                    gnum = true;

                } else {
                    System.out.println("Sorry,number should be between 1 and 10 ");

                    gnum = false;
                }
            }
            return guessernum;
        }
    }


class Player1
{
    int player1num;
    boolean gnum = false;
    int getPlayer1Num()

    {
        Scanner scan = new Scanner(System.in);
        while (gnum == false) {
            System.out.println("Player1 guess the number between 1 and 10 : ");
            player1num = scan.nextInt();
            if (player1num >= 1 && player1num<= 10 ) {
                gnum = true;

            } else {
                gnum = false;
            }
        }
        return player1num;
    }
}

class Player2
{
    int player2num;
    boolean gnum = false;
    int getPlayer2Num()

    {
        Scanner scan = new Scanner(System.in);
        while (gnum == false) {
            System.out.println("Player2 guess the number between 1 and 10 : ");
            player2num = scan.nextInt();
            if (player2num >= 1 && player2num<= 10 ) {
                gnum = true;

            } else {
                gnum = false;
            }
        }
        return player2num;
    }
}

class Player3
{
    int player3num;
    boolean gnum = false;
    int getPlayer3Num()

    {
        Scanner scan = new Scanner(System.in);
        while (gnum == false) {
            System.out.println("Player3 guess the number between 1 and 10 : ");
            player3num = scan.nextInt();
            if (player3num >= 1 && player3num<= 10 ) {
                gnum = true;

            } else {
                gnum = false;
            }
        }
        return player3num;
    }
}

class Referee {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser guessobj = new Guesser();
        numFromGuesser = guessobj.getGuessernum();

    }

    void collectNumFromPlayer1() {
        Player1 player1Obj = new Player1();
        numFromPlayer1 = player1Obj.getPlayer1Num();

    }

    void collectNumFromPlayer2() {
        Player2 player2Obj = new Player2();
        numFromPlayer2 = player2Obj.getPlayer2Num();

    }

    void collectNumFromPlayer3() {
        Player3 player3Obj = new Player3();
        numFromPlayer3 = player3Obj.getPlayer3Num();

    }

    void compare() {
        if (numFromGuesser == numFromPlayer1 && numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
            System.out.println("Game is Tie:");

        else if (numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer2)

            System.out.println("Players 1 and Player 2 won ");
        else if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3)
            System.out.println("Player 2 and Player 3 won");

        else if (numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer3)
            System.out.println("Player 1 and Player 3 won ");
        else if(numFromGuesser==numFromPlayer1)
            System.out.println("The Winner is Player 1");
        else if (numFromGuesser == numFromPlayer2)
            System.out.println("The Winner is Player 2");
         else if (numFromGuesser == numFromPlayer3)
            System.out.println("The Winner is Player 3");
            else
                System.out.println("No one is the Winner");
        }

    }


