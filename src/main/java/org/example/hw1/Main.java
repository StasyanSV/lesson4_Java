package org.example.hw1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/*
Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int items = 0;
        for (int i = 0; i < list.size()/2; i++) {
            Collections.swap(list, i, list.size() - i - 1);;
        }
        System.out.println(list);
    }
}
