package com.spring.SpringBoot_to_Spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
@Component("BubbleSortBean")
//@Primary
public class BubbleSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(nums[j]>nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
}
