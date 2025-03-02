package com.spring.SpringBoot_to_Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    //@Autowired
    private SortAlgorithm sortAlgorithm;

    @Autowired

    //  Question - 6 Injecting the Constructor
    public BinarySearch(@Qualifier("SelectionSortBean") SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public String binarySearch(int[] nums, int key) {

        //Question - 1
        //BubbleSort bubbleSort = new BubbleSort();
        //int[] numsSorted = bubbleSort.sort(nums);

        //Question - 2
        int[] numsSorted = sortAlgorithm.sort(nums);

        int left=0, right=numsSorted.length-1;
        while(left<=right) {
            int mid=(left+right)/2;
            if(nums[mid]==key) return "YES";
            else if(nums[mid]>key) right=mid-1;
            else left=mid+1;
        }
        return "NO";
    }

    //Question - 4
    public void getBeanDetails() {
        System.out.println("Bean Properties are : ");
        System.out.println("Sorting Algo used : " + sortAlgorithm.getClass().getSimpleName());
        System.out.println("Hash Code : " + sortAlgorithm.hashCode());
    }
}

