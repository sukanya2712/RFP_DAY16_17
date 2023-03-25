package OrderedList;

import com.unorderedlist.LinkedList;

import java.util.Arrays;
import java.util.Scanner;

public class LinkedListNoMain {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList=new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int[] arrayNo = {50,60,70,80,90,10,20,40,100,30};
        for(int i=0;i<arrayNo.length;i++) {
            linkedList.addData(arrayNo[i]);
        }

        System.out.println(Arrays.toString(arrayNo));
        while(true){
            System.out.println();
            System.out.print("Enter a Number to check weather it is present or not:-");
            Integer Number = sc.nextInt();
            linkedList.search(Number);
            linkedList.display();
        }
    }
}
