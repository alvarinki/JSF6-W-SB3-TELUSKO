import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    int age;
    String name;

    //Constructor y getters y setters
    public Student (int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Student o) {
        if(this.age>o.age){
            return 1;
        } else if(this.age<o.age){
            return -1;
        } else {
            return 0;
        }
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}

public class ComparatorComparable {
    public static void main(String[] args) {

        Comparator<Integer> com= new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                if(i%10 > j%10)
                    return 1;
                else 
                    return -1;
            }
        };
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(62);
        nums.add(31);
        nums.add(26);
        nums.add(19);
        
        Collections.sort(nums, com);

        System.out.println(nums);
    }
}
