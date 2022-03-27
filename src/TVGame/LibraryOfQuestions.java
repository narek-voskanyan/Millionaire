package TVGame;

import java.util.ArrayList;
import java.util.Collections;

public class LibraryOfQuestions {
    public static ArrayList<Questions> getQuestionsForGame(){
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

        mediumQuestions.add(new Questions("What is the biggest planet in solar system?",
                "Jupiter", "Venus", "Saturn", "Pluto"));

        mediumQuestions.add(new Questions("How much high of Aragats north peak ?",
                "4090 Nemo", "4075", "5165", "6542"));

        mediumQuestions.add(new Questions("Ancient Greek city who has been destroyed by volcano ?",
                "Pompeii", "Athens", "Sparta", "Rhodes"));

        mediumQuestions.add(new Questions("The most higher mountain in Sibir ?",
                "Belukha", "Athens", "Sparta", "Rhodes"));

        mediumQuestions.add(new Questions("Real name of freddie mercury ?",
                "Farrokh Bulsara", "Mohamed Salah", "Ibrahim Tattles", "Rhodes Al Nodes"));

        //collection for hard questions
        ArrayList<Questions> hardQuestions = new ArrayList<>();

        hardQuestions.add(new Questions("Who painted Jesus Christ on the lap of his mother at the adult age?",
                "Michelangelo", "Da Vinci", "Raphael", "Donatello"));

        hardQuestions.add(new Questions("Date of death Govard Lovecraft",
                "1937", "1955", "1880", "1943"));

        hardQuestions.add(new Questions("What is the name of the strait during the passage of which sailors were\n" +
                " allowed to wear a golden earring",
                "Strait of Drake", "Strait of Gibraltar", "Strait of Dover", "Strait of Juan de Fuca"));

        hardQuestions.add(new Questions("What is country was born Jo Nesbo ?",
                "Norway", "Sweden", "Germany", "Ukrainian"));

        hardQuestions.add(new Questions("What is country was born Frida Kahlo ?",
                "Mexico", "Argentina", "Chili", "Brazil"));

        //shuffle and collect questions for game
        Collections.shuffle(easyQuestions);
        Collections.shuffle(mediumQuestions);
        Collections.shuffle(hardQuestions);
        allQuestions.addAll(easyQuestions.subList(0,5));
        allQuestions.addAll(mediumQuestions.subList(0,5));
        allQuestions.addAll(hardQuestions.subList(0,5));

        return allQuestions;
    }

}
