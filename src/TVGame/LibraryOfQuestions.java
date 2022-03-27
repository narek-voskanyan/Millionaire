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

        easyQuestions.add(new Questions("Who presented black square  as a work of art?",
                "\n" +
                        "K. Malevich", "S. Dalli", "Picasso", "Van Gogh"));

        //collection for medium questions
        ArrayList<Questions> mediumQuestions = new ArrayList<>();

        mediumQuestions.add(new Questions("The name of most far from land the place in ocean?",
                "Point Nemo", "Alaska", "Point Dolly", "Tiki Ocean"));

        mediumQuestions.add(new Questions("How much high of Aragats north peak ?",
                "4090 Nemo", "4075", "5165", "6542"));

        mediumQuestions.add(new Questions("Ancient Greek city who has been destroyed by volcano ?",
                "Pompeii", "Athens", "Sparta", "Rhodes"));

        mediumQuestions.add(new Questions("The most higher mountain in Sibir ?",
                "Belukha", "Athens", "Sparta", "Rhodes"));

        //collection for hard questions
        ArrayList<Questions> hardQuestions = new ArrayList<>();

        hardQuestions.add(new Questions("Who painted Jesus Christ on the lap of his mother at the adult age?",
                "Michelangelo", "Da Vinci", "Raphael", "Donatello"));

        hardQuestions.add(new Questions("Date of death Govard Lovecraft",
                "1937", "1955", "1880", "1943"));


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
