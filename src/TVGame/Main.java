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

            // if the answer is false
            if(boo == 0){
                System.out.println("Sorry " + user.setName() + "  it is false. \n" +
                        "The correct answer is: " + testOne.get(i).getTrueAnswers());
                System.exit(0);
            }
        }
        System.out.println("Game is and");
    }
}
