package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDublicates2 {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";	
		String[] split = text.split(" ");
		
		
		List<String> telist = new ArrayList<String>();
		telist.addAll(Arrays.asList(split));
		
		System.out.println("list in string:"+ telist);
		Set<String> strset = new LinkedHashSet<String>(telist);
		
		System.out.println("the set after remove dublicates:" + strset);
	
	}

}
