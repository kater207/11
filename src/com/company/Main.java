package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Sqrt sqrt = new Sqrt();
        sqrt.koren(4, 5, 1);

        ArrayList<String> string = new ArrayList<String>(10);
        string.add("Kiev");
        string.add("Odessa");
        string.add("Lviv");

        Iterator<String> iterator = string.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        iterator.remove();








    }

}
