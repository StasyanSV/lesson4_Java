package org.example.cw5;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String path = "/../";
        System.out.println(simplifyPath(path));
    }

    private static String simplifyPath(String path) {
        Deque<String> list = new LinkedList<>();
        String [] myArray = path.split("/");

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].equals("") || myArray[i].equals(".")) continue;
            else if (myArray[i].equals("..")){
                if (!list.isEmpty()) list.pollLast();
            }else list.add(myArray[i]);
        }

        return "/" + String.join("/", list);
    }
}
