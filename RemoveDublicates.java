package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDublicates {

	public static void main(String[] args) {
		
		String str= "paypal payments";
		String str1=str.replaceAll("\\S ","");    //-------- to remover space
		System.out.println(str1);
		
		char[] strarray = str1.toCharArray();
		Set<Character> charset = new HashSet<Character>();
		Set<Character> dubset = new HashSet<Character>();
		
		for (int i = 0; i < strarray.length; i++) {
			charset.add(strarray[i]);
			
		}
		System.out.println(charset);
		
		for (Character charlist : strarray) {
			if(!dubset.add(charlist))
				System.out.println("dublicate: "+ charlist);
			
		}
		
			
		}

	}


