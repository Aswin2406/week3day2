package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindIntersection {
	public static void main(String[] args) {
		
		
		  int [] num1 = { 3, 2, 11, 4, 6, 7 };
		  int [] num2 = { 1, 2, 8, 4, 9 ,7 };
		  List<Integer> list1 = new ArrayList<Integer>();
		  List<Integer> list2 = new ArrayList<Integer>();   
		  
		  for (int i = 0; i < num1.length; i++) {
			  list1.add(num1[i]);
			 
		}
		  System.out.println("the list1 value:"+ list1);
		  for (int j = 0; j < num2.length; j++) {
			  list2.add(num2[j]);
		
			  
		}
		  
		  System.out.println("list2 value:"+ list2);
		  list1.retainAll(list2);
		  System.out.println("final list is:"+ list1);
	}
		
}