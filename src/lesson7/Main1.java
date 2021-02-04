package lesson7;

public class Main1 {
    public static void main(String[] args) {
        int [] [] nums = {{2,6,4,6},
                           {5,3,6,8},
                           {4,3,1,2,4}};
        for (int i =0; i < nums.length; i++){
       //     System.out.println(nums[i]);
            for (int j =0; j<nums[i].length; j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }


    }
}
