package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		
		Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		
		 List<Integer> listcol = new ArrayList<Integer>();
		 listcol.addAll(Arrays.asList(arr));
		 
		   Collections.sort(listcol);
		   System.out.println("sorted array:"+ listcol);
		    
		   int size = listcol.size();
		   Integer sec = listcol.get(size-2);
		   System.out.println(sec);
		   
		   Set<Integer> setcol =new HashSet<Integer>();
		   for (Integer dub : listcol) {
			   if(setcol.add(dub))
				   System.out.println("dublicate element in array:"+ dub);
			   
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
