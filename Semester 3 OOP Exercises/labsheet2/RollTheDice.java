package labsheet2;

import javax.swing.JOptionPane;

public class RollTheDice {

    public static void main(String args[])
    {
        String startProgram;
        int choice=0, randomNumber1=0, randomNumber2=0, gamesPlayed=0, playerWin=0, computerWin=0, draw=0;
        boolean valid=false;

        while(!valid) {

            startProgram = JOptionPane.showInputDialog(null, "Would you like to play a game of roll the dice? (Yes or No)",
                    "Input", JOptionPane.QUESTION_MESSAGE);

            if (startProgram.equals("no") || startProgram.equals("No")) {
                choice = 1;
            }

            else if (startProgram.equals("yes") || startProgram.equals("Yes")) {
                choice = 2;
            }

            else
                choice = 3;


            switch (choice) {

                case 1: {
                    JOptionPane.showMessageDialog(null, "Thanks for playing the game",
                            "Farewell", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                    break;
                }

                case 2: {
                    randomNumber1 = (int)(Math.random()*11)+2;
                    JOptionPane.showMessageDialog(null, "The computer roll generated the value " +  randomNumber1 +
                            "\nNow hit return to see the player roll","Computer Roll", JOptionPane.INFORMATION_MESSAGE);

                    randomNumber2 = (int)(Math.random()*11)+2;
                    JOptionPane.showMessageDialog(null, "The player roll generated the value " +  randomNumber2,
                            "Player Roll", JOptionPane.INFORMATION_MESSAGE);
                    gamesPlayed++;

                        if(randomNumber1>randomNumber2)
                        {
                            computerWin++;
                        }
                        else if(randomNumber1<randomNumber2)
                        {
                            playerWin++;
                        }
                        else
                        {
                            draw++;
                        }

                    JOptionPane.showMessageDialog(null, "Games played: " + gamesPlayed + "\nComputer wins: " + computerWin +
                            "\nPlayer wins: " + playerWin + "\nDraws : " + draw,"Game Info", JOptionPane.INFORMATION_MESSAGE);

                    break;
                }

                case 3: {
                    JOptionPane.showMessageDialog(null, "Invalid input",
                            "Warning", JOptionPane.WARNING_MESSAGE);

                    break;
                }
            }
        }
    }
}
