package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MissingElement {
   public static void main(String[] args) {
	   
		Integer[] arr = {0,1,2,3,4,7,6,8};
		
		 List<Integer> listcol = new ArrayList<Integer>();
		 listcol.addAll(Arrays.asList(arr));
		 Collections.sort(listcol);
		 System.out.println("array sort list:"+ listcol);
		 
		 for (int i = 0; i < arr.length; i++) {
			 
			 
		   if(i!=arr[i]) {
			   System.out.println("find missing element:"+ i);
			   break;
		   }
		}
		
		     
}
}
