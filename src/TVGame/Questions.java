package TVGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Questions {

    Questions(String question, String trueAnswers, String answerTwo, String answerThree, String answerFour ){
        this.question = question;
        this.trueAnswers = trueAnswers;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
        this.answerFour = answerFour;
    }

    //return answer shuffle
    private ArrayList<String> getAnswer(){
        ArrayList<String> answers = new ArrayList<>(4);
        answers.add(trueAnswers);
        answers.add(answerTwo);
        answers.add(answerThree);
        answers.add(answerFour);
        Collections.shuffle(answers);

        return answers;
    }
private String getAnswerFromUser(){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your answer please");
    return in.next();
}

    public int getQuestion(){
        ArrayList<String> forAnswer = getAnswer();
        System.out.println(question);
        System.out.println( "A " + "\" " + forAnswer.get(0) + " \"" + " B " + "\" " + forAnswer.get(1) + " \"" + "\n" +
                            "C " + "\" " + forAnswer.get(2) + " \"" + " D " + "\" " + forAnswer.get(3) + " \"");
        while (true) {
            String fromUser = getAnswerFromUser();
            fromUser = fromUser.toLowerCase();
            switch (fromUser) {
                case "a":
                    if (forAnswer.get(0).equals(trueAnswers)) {
                        return 1;
                    } else {
                        return 0;
                    }
                case "b":
                    if (forAnswer.get(1).equals(trueAnswers)) {
                        return 1;
                    } else {
                        return 0;
                    }
                case "c":
                    if (forAnswer.get(2).equals(trueAnswers)) {
                        return 1;
                    } else {
                        return 0;
                    }
                case "d":
                    if (forAnswer.get(3).equals(trueAnswers)) {
                        return 1;
                    } else {
                        return 0;
                    }
                default:
                    System.out.println("There is not that variant in proposed like this" );
            }
        }

    }

    public String getTrueAnswers(){
        return this.trueAnswers;
    }

    public int setWinCash(int a){
        return winCash[a];
    }

    private final String question;
    private final String trueAnswers;
    private final String answerTwo;
    private final String answerThree;
    private final String answerFour;
    private int[] winCash = {100, 200, 300, 500, 1000, 2000, 4000, 8000, 16000, 32000, 64000, 125000, 250000};

}
