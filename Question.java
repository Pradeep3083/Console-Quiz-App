
public class Question{
    private String questionText;
    private String[] options;
    private char correctOption;

    public Question(String questionText, String[] options, char correctOption){
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public void displayQuestion(){
        System.out.println(questionText);
        char optionLetter = 'A';
        for(String option : options){
            System.out.println(optionLetter+". "+option);
            optionLetter++;
        }
    }

    public boolean checkAnswer(char userAnswer){
        return Character.toUpperCase(userAnswer) == correctOption;
    }

}