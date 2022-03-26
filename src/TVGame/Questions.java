package TVGame;

import java.util.ArrayList;
import java.util.Collections;

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

    public boolean getQuestion(String fromUser){
        ArrayList<String> forAnswer = getAnswer();
        System.out.println(question);
        System.out.println("A " + "( " + forAnswer.get(0) + " )" + "B " + "( " + forAnswer.get(1) + " )" + "\n" +
                "C " + "( " + forAnswer.get(2) + " )" + "D " + "( " + forAnswer.get(3) + " )");
        while (true) {
            switch (fromUser) {
                case "a":
                    if (forAnswer.get(0).equals(trueAnswers)) {
                        return true;
                    } else {
                        return false;
                    }
                case "b":
                    if (forAnswer.get(1).equals(trueAnswers)) {
                        return true;
                    } else {
                        return false;
                    }
                case "c":
                    if (forAnswer.get(2).equals(trueAnswers)) {
                        return true;
                    } else {
                        return false;
                    }
                case "d":
                    if (forAnswer.get(3).equals(trueAnswers)) {
                        return true;
                    } else {
                        return false;
                    }
                default:
                    System.out.println("There is not that variant in proposed like this" );
                    continue;
            }
        }

    }

    private final String question;
    private final String trueAnswers;
    private final String answerTwo;
    private final String answerThree;
    private final String answerFour;

}
