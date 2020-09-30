package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListPractice {

	public static void main(String[] args) {
		
		
	 List<Integer> list = new ArrayList<>();
	list.add(10);
	list.add(30);
	list.add(20);
	
//	System.out.println(list);
//	Collections.reverse(list);
//	System.out.println(list);
	
	Collections.sort(list);
//	System.out.println(list);
//	
	System.out.println("Insertions order");
	list.forEach(i -> System.out.println(i));
	Collections.reverse(list);
	
	System.out.println("Reverse order");
	list.forEach(x-> System.out.println(x));

	}

}
