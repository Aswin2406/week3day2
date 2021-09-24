package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		Integer[] data = {3,2,11,4,6,7};
		
		List<Integer> listcol = new ArrayList<Integer>();
		
		listcol.addAll(Arrays.asList(data));
		Collections.sort(listcol);
		System.out.println("sorted Array:" + listcol);
		
		
	}

}
