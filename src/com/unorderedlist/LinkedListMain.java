package com.unorderedlist;

import java.util.Arrays;
import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String a1 = "HI I SUKANYA NAIK";

        String[] words = a1.split(" ");
        System.out.println(Arrays.toString(words));

        for(int i=0;i<words.length;i++) {
            linkedList.addData(words[i]);
        }

        while(true){
            System.out.println();
            System.out.print("Enter a word to check weather it is present or not:-");
            String word = sc.next();
            linkedList.search(word);
            linkedList.display();
        }
    }
}
