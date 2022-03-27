package TVGame;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Questions> testOne = LibraryOfQuestions.getQuestionsForGame();
       boolean boo = testOne.get(0).getQuestion();
       System.out.println(boo);
    }
}
