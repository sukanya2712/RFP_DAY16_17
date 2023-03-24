import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //BUBBLE SORT FOR ARRAY
        int arr[] = {5,1,4,2,8};

        System.out.println("-------UNSORTED ARRAY-------");
        System.out.println(Arrays.toString(arr));
        int length = arr.length;

        for (int i=0;i<length;i++){
            for (int j=1;j<length-i;j++){
                if (arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        System.out.println("-------SORTED ARRAY------");
        System.out.println(Arrays.toString(arr));


        //BUBBLESORT FOR STRINGS
        String[] words = {"SUKANYA","NAIK","REEMA","POOJA","PRIYA"};

        System.out.println("------UNSORTED STRING-----");
        System.out.println(Arrays.toString(words));
        for (int i=0;i< words.length;i++){
            for (int j=0;j< words.length-i-1;j++){
                if (words[j].compareTo(words[j+1]) > 0){
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }

        System.out.println("------SORTED STRING-------");
        System.out.println(Arrays.toString(words));

    }
}
