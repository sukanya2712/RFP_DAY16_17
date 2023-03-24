import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

    static void detection(String[] a , String[] b){
        int count =0;
        boolean[] matched = new boolean[b.length];
        for (int i=0;i<a.length;i++){
            for (int j=0;j< b.length;j++){
                if (a[i].equals(b[j]) && !matched[j]){
                    count++;
//                    System.out.println(a[i]);
//                    System.out.println(b[j]);
//                    System.out.println(count);
                    matched[j] = true;
                    break;
                }
            }
        }
        if (count == a.length){
            System.out.println("words are anagram of each other");
        }else{
            System.out.println("no anagram");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String n = sc.nextLine();
        String[] words1 = s.split("");
        String[] words2 =n.split("");
        //System.out.println(Arrays.toString(words1));
        detection(words1,words2);
    }
}
