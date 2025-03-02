package com.spring.SpringBoot_to_Spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
@Component("SelectionSortBean")
public class SelectionSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n-1; i++) {
            int minIndex = i;
            for(int j=i+1; j<n; j++) {
                if(nums[j]<nums[minIndex]) minIndex=j;
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
