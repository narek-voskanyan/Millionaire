package TVGame;

import java.util.ArrayList;
import java.util.Collections;

public class LibraryOfQuestions {
    public ArrayList<Questions> getQuestionsForGame(){
        ArrayList<Questions> allQuestions = new ArrayList<>(15);

        // collection for easy question
        ArrayList<Questions> easyQuestions = new ArrayList<>();

        easyQuestions.add(new Questions("From this four variant what is the Armenian capital?",
                "Yerevan", "Moscow", "Berlin", "Barnaul"));

        easyQuestions.add(new Questions("Who was written \"Gayane\" ballet?",
                "Aram Khachaturian", "Paganini", "Martin Vardazaryan", "Modest Mussorgsky"));

        easyQuestions.add(new Questions("Who has been USSR last president?",
                "M. S. Gorbachev", "I. V. Stalin", "L. I. Brezhnev", "N. S. Khrushchev"));

        easyQuestions.add(new Questions("Date of end second world war?",
                "1945", "2014", "1921", "1968"));

        easyQuestions.add(new Questions("Name of  Homer  son from \"Simpsons\" cartoon? ",
                "Bart", "Moe", "Lisa", "Nelson"));

        easyQuestions.add(new Questions("What from this enumeration is not Vegetable?",
                "Apple", "Carrot", "Potato", "Corn"));

        //collection for medium questions
        ArrayList<Questions> mediumQuestions = new ArrayList<>();


        //collection for hard questions
        ArrayList<Questions> hardQuestions = new ArrayList<>();


        //shuffle and collect questions for game
        Collections.shuffle(easyQuestions);
        Collections.shuffle(mediumQuestions);
        Collections.shuffle(hardQuestions);
        getQuestionsForGame().addAll(easyQuestions.subList(0,5));
        getQuestionsForGame().addAll(mediumQuestions.subList(0,5));
        getQuestionsForGame().addAll(hardQuestions.subList(0,5));

        return getQuestionsForGame();
    }

}
