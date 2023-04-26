import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        int[] ints = {1, 1, 2, 2, 2, 3};
        int i = removeElement(ints, 3);
        System.out.println(i);
    }


    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int i = 0,j = nums.length;
        while (i<j){



            if (nums[i] == val) {
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    i++;
                    j--;

                    count++;
                } else {
                    j--;
                    continue;
                }
            } else {
                i++;
                continue;
            }


        }
        return j;
    }
}
