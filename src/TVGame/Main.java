package TVGame;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Questions> testOne = LibraryOfQuestions.getQuestionsForGame();
        for (int i = 0; i < 15; i++){
            System.out.println(i+1 + ":");
            boolean boo = testOne.get(i).getQuestion();
            System.out.println(boo);
        }
        System.out.println("Game is and");

    }
}
