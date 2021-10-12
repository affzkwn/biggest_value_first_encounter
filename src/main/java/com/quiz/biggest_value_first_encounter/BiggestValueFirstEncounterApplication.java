package com.quiz.biggest_value_first_encounter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class BiggestValueFirstEncounterApplication {

	public static void main(String[] args) {
				// put your code here
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int numCount = 0;
		int[] arr2 = new int[a];
		int maxArr = arr2[0];
		int len = 0;
		for (int i = len; i < a; i++) {
			arr2[i]=scan.nextInt();
			if (maxArr < arr2 [i]) {
				maxArr = arr2 [i];
				numCount = i;
			} 
			
		} System.out.println(numCount);
				 
	}

}
