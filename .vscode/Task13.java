import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        int test_array[] = {0,1,2,2,3,0,4,2};
        /*
            Arrays.toString:
            см. https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
         */
        System.out.println(Arrays.toString(removeElement(test_array, 3)));
    }

    public static int[] removeElement(int[] nums, int val) {
        int offset = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] == val){
                offset++;
            } else{
                nums[i - offset] = nums[i];
            }
        }

        // Arrays.copyOf копирует значение из массива nums в новый массив
        // с длинной nums.length - offset
        return Arrays.copyOf(nums, nums.length - offset);
    }
}
