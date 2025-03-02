package com.spring.SpringBoot_to_Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Stack;

@SpringBootApplication
public class SpringBootToSpringApplication {
	public static void main(String[] args) {

		//Question - 1
		//BinarySearch search = new BinarySearch();

		//Question - 2
		/*SortAlgorithm sortAlgorithm = new SelectionSort();
		BinarySearch search = new BinarySearch(sortAlgorithm);
		String result = search.binarySearch(new int[] {2,5,4}, 5);
		System.out.println(result);*/

		//Question - 3
		ApplicationContext applicationContext = SpringApplication.run(SpringBootToSpringApplication.class, args);
		BinarySearch search = applicationContext.getBean(BinarySearch.class);

		String result = search.binarySearch(new int[] {1,4,2,5}, 4);
		System.out.println(result);

		//Question - 4
		search.getBeanDetails();
	}
}
