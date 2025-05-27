import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
