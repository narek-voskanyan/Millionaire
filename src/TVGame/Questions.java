package TVGame;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;

public class Questions {
    Questions(int status, String question, String trueAnswers, String answerTwo, String answerThree, String answerFour ){
        this.status = status;
        this.question = question;
        this.trueAnswers = trueAnswers;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
        this.answerFour = answerFour;
    }
    public void getQuestion(){
        ArrayList<String> answers = new ArrayList<>(4);
        answers.add(trueAnswers);
        answers.add(answerTwo);
        answers.add(answerThree);
        answers.add(answerFour);
        Collections.shuffle(answers);
        System.out.println("A" + "( " + answers.get(0) + " )" + "B" + "( " + answers.get(1) + " )" + "\n" +
                "C" + "( " + answers.get(2) + " )" + "D" + "( " + answers.get(3) + " )");


    }

    public int getStatus(){
        return status;
    }

    private final int status;
    private final String question;
    private final String trueAnswers;
    private final String answerTwo;
    private final String answerThree;
    private final String answerFour;

}
