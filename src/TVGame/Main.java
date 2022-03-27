package TVGame;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Questions> testOne = LibraryOfQuestions.getQuestionsForGame();
        Player user = new Player();
        user.getPlayerInfo();
        System.out.println("Hello " + user.setName());
        for (int i = 0; i < 15; i++){
            System.out.println("---------------------------------------\n" +
                    (i+1) + ":" + " You are going to win " + testOne.get(i).setWinCash(i) +"\n" +
                    "---------------------------------------");
            int boo = testOne.get(i).getQuestion();

            if(boo == 1 && (i == 4 || i == 9 || i == 14)){
                user.plusWinCash(testOne.get(i).setWinCash(i));
                continue;
            }

            // if the answer is false
            if(boo == 0){
                System.out.println("Sorry " + user.setName() + "  it is false. \n" +
                        "The correct answer is: " + testOne.get(i).getTrueAnswers() +
                        " You win $ " + user.setCash());

                System.exit(0);

                // if user wants  cash out
            }else if(boo == 2 && i != 0){
                user.plusWinCash(testOne.get(i).setWinCash(i-1));
                System.out.println("Congratulations " + user.setName() + ". You win " + user.setCash() + " $");
                System.exit(0);
            }else if(boo == 2){
                System.out.println("You leave us so soon and  win nothing  " + user.setCash() + " $");
                System.exit(0);
            }
        }
        System.out.println("Congratulations you win " + user.setCash() + " $");
        System.exit(0);
    }
}
