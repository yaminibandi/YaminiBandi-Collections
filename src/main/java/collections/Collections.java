package collections;

import java.util.*;

public class Collections {
	public static void main(String[] args){
		CustomList1 l=new CustomList1();
		System.out.println("Enter the size of list");
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the elements to insert");
		for(int i=0;i<size;i++) {
			int num=sc.nextInt();
			l.add(num);
		}
		System.out.println("The Elements in the list are:");
        System.out.println(l);
        System.out.println("Enter index of an element to delete");
        int num=sc.nextInt();
        l.remove(num+1);
        System.out.println("List after deleting the given element:");
        System.out.println(l);
        System.out.println("Enter index to search element");
        num=sc.nextInt();
        System.out.println( l.get(num+1) );
        System.out.println("The size of the list");
        System.out.println(l.size());
	}

}
