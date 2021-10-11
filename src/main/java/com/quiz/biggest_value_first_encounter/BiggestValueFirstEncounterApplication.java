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
		int num = scan.nextInt();
		int[] arr2 = new int[num];
		int maxArr = arr2[0];
		int len = 0;
		scan.close();
		for (int i = len; i < a; i++) {
			if (maxArr < arr2 [i]) {
				maxArr = arr2 [i];
			} 
			System.out.println(i);
		} 
				 
	}

}
