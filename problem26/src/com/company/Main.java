package com.company;

import java.util.*;

public class Main {



    public int removeDuplicates(int[] nums) {


        Set<Integer> n = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            n.add(nums[i]);
        }
        int i = 0;
        for (Integer integer : n) {
            nums[i] = integer;
            i++;
        }
        return n.size();
    }

}
