package TVGame;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Questions> testOne = LibraryOfQuestions.getQuestionsForGame();
        Player user = new Player();
        user.getPlayerInfo();
        System.out.println("Hello " + user.setName());
        for (int i = 0; i < 15; i++){
            System.out.println(i+1 + ":");
            boolean boo = testOne.get(i).getQuestion();
            if(!boo){
                System.out.println("Sorry " + user.setName() + "  it is false. \n" +
                        "The correct answer is: " + testOne.get(i).getTrueAnswers());
                System.exit(0);
            }
        }
        System.out.println("Game is and");

    }
}
