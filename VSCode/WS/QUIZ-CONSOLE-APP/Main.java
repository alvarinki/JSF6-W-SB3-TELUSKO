import java.util.Scanner;

public class Main{
    public static Scanner scan = new Scanner(System.in);

    
    public static void main(String[] args) {
        QuestionService service= new QuestionService();
        service.playQuiz();
        System.out.println("The score obtained is: "+service.getScore());     
        scan.close();
    }
    
}