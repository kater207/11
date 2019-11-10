package com.company;

import java.util.*;

public class NoDublicat<E> {
    private static <E>List<E> removeDublicate(List<E> list){
        Set<E> array = new LinkedHashSet<>();
        array.addAll(list);
        return new ArrayList<>(array);

    }

    public static void main(String[] args) {
        System.out.println(removeDublicate(Arrays.asList(2,4,2,5,6,7,7)));
        System.out.println(removeDublicate(Arrays.asList("aa", "bb", "aa", "cc")));
    }

}
