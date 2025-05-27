import java.util.HashMap;
import java.util.Map;

public class Maps {
    
   

    public static void main(String[] args) {

         Map<String, Integer> students = new HashMap<>();
    
        students.put("Alice", 85);
        students.put("Bob", 92);
        students.put("Charlie", 78);
        students.put("Diana", 88);
        students.put("Ethan", 95);
        students.put("Fiona", 82);
        students.put("George", 90);
        students.put("Hannah", 76);
        students.put("Ian", 89);
        students.put("Jasmine", 91);

        students.forEach((k, v)-> {
            System.out.println("Student: " + k + ", Score: " + v);
        });
    
}
}
