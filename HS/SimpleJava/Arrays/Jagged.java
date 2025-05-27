package HS.SimpleJava.Arrays;
public class Jagged {
    //Matriz jagged o dentada. Una matriz que no es cuadrada
    public static void main(String[] args) {
        
        int nums[][] = new int[3][]; //jagged o dentada

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for (int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                nums[i][j] = (int) (Math.random() * 10);
            }
        }


        for(int n[]: nums){
            for(int m: n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}

