
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class JavaQuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> quizQuestions = new ArrayList<>();

        quizQuestions.add(new Question(
            "Which keyword is used to create a subclass in Java",
            new String[]{"this", "extends", "super", "implements"},'B'));

        quizQuestions.add(new Question(
                "Which of the following is not a primitive data type in Java?",
                new String[]{"int", "boolean", "String", "char"}, 'C'));

        quizQuestions.add(new Question(
                "What is the default value of a boolean variable in Java?",
                new String[]{"true", "false", "null", "0"}, 'B'));

        quizQuestions.add(new Question(
                "Which method is the entry point of any Java program?",
                new String[]{"start()", "main()", "run()", "execute()"}, 'B'));

        quizQuestions.add(new Question(
                "Which of the following is not an OOP principle?",
                new String[]{"Encapsulation", "Polymorphism", "Inheritance", "Compilation"}, 'D'));

        quizQuestions.add(new Question(
                "Which of these is used to handle exceptions in Java?",
                new String[]{"try-catch", "final", "throw-catch", "error handling"}, 'A'));

        quizQuestions.add(new Question(
                "Which collection class stores elements in key-value pairs?",
                new String[]{"ArrayList", "HashMap", "HashSet", "TreeSet"}, 'B'));

        quizQuestions.add(new Question(
                "Which operator is used for object reference comparison?",
                new String[]{"==", "equals()", "compareTo()", "instanceof"}, 'A'));

        quizQuestions.add(new Question(
                "Which Java feature allows a class to have multiple methods with the same name?",
                new String[]{"Overloading", "Overriding", "Encapsulation", "Abstraction"}, 'A'));

        quizQuestions.add(new Question(
                "Which keyword is used to stop inheritance in Java?",
                new String[]{"stop", "final", "static", "break"}, 'B'));

        int score = 0;
        System.out.println("==== Welcome to the Java Quiz App ====");
        for(int i = 0; i<quizQuestions.size(); i++){
            Question q = quizQuestions.get(i);
            System.out.println("\nQuestion "+ (i+1)+ ":");
            q.displayQuestion();
            System.out.println("Your answer (A/B/C/D): ");
            char answer = sc.next().charAt(0);

            if(q.checkAnswer(answer)){
                System.out.println("Correct!");
                score++;
            }else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("\n==== Quiz Over! ====");
        System.out.println("your score: "+score+"/"+quizQuestions.size());
        double percentage = ((double) score/quizQuestions.size() * 100);
        System.out.printf("Percentage: %.2f%%\n",percentage);

        if(percentage >= 80){
            System.out.println("Excellent knowledge of Java!");
        } else if(percentage >= 50){
            System.out.println("Good job! keep learning Java.");
        } else{
            System.out.println("Keep practicing Java concepts.");
        }

    }
}