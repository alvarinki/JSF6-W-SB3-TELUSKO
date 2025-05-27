import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] selections = new String[5];

    //Rellenar el array de preguntas
    Question q1 = new Question(1, "¿Cuál es la capital de Francia?", "París", "Londres", "Berlín", "Madrid", "París");
    Question q2 = new Question(2, "¿Cuál es la capital de España?", "París", "Londres", "Berlín", "Madrid", "Madrid");
    Question q3 = new Question(3, "¿Cuál es la capital de Alemania?", "París", "Londres", "Berlín", "Madrid", "Berlín");
    Question q4 = new Question(4, "¿Cuál es la capital de Italia?", "Roma", "Londres", "Berlín", "Madrid", "Roma");
    Question q5 = new Question(5, "¿Cuál es la capital de Reino Unido?", "París", "Londres", "Berlín", "Madrid", "Londres");

    public QuestionService(){
        questions[0] = q1;
        questions[1] = q2;
        questions[2] = q3;
        questions[3] = q4;
        questions[4] = q5;
    }
    
    public void playQuiz(){
        int cont=0;
        for(Question q: questions){
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1. " + q.getOp1());
            System.out.println("2. " + q.getOp2());
            System.out.println("3. " + q.getOp3());
            System.out.println("4. " + q.getOp4());
            System.out.print("Please enter your answer (1-4): ");
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();
            selections[cont] = answer;
            cont++;
        }

        for(String s: selections){
            System.out.println("Your selection: " + s);
        }
    }

    public int getScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            if (selections[i].equals(String.valueOf(questions[i].getCorrectAnswer()))) {
                score++;
            }
        }
        return score;
    }

}
