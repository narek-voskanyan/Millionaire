package TVGame;

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

    }

    private final int status;
    private final String question;
    private final String answerTwo;
    private final String answerThree;
    private final String trueAnswers;
    private final String answerFour;

}
