package com.quiz.biggest_value_first_encounter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class BiggestValueFirstEncounterApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int[] arr2 = new int[a];
				
		for (int j = 0; j < a; j++) {
			arr2[j] = scan.nextInt();
		}
				
		int maxArr = arr2[0];
		int numCount = 0;
				
		for (int i = 0; i < a; i++) {
			if (maxArr < arr2 [i]) {
				maxArr = arr2 [i];
				numCount = i;
			} 	
		} 

		System.out.println(numCount);	 
	}
}
