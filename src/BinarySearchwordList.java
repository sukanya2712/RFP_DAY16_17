import java.util.*;

public class BinarySearchwordList {

    public static int binarySearch(String[] words, String word) {
        int left = 0;
        int right = words.length-1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = word.compareTo(words[mid]);

            if (cmp == 0) {
                return mid;  // found the word
            } else if (cmp < 0) {
                right = mid - 1;  // search left half
            } else {
                left = mid + 1;  // search right half
            }
        }

        return -1;  // word not found
    }
    public static void main(String[] args) {

        //using string and arrays
        Scanner sc = new Scanner(System.in);
        String s = "I AM SUKANYA NAIK ";
        // String[] words = s.split(" ");
        String[] words = s.trim().split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("Enter the key-word you want to search in list");
        String key = sc.next();
        int indexvalue = binarySearch(words,key);
        if (indexvalue != -1){
            System.out.println("The word is found at index" + indexvalue );
        }else{
            System.out.println("word is not found");
        }

        //using list and collection
//        Scanner sc = new Scanner(System.in);
//        String list = sc.nextLine();
//        List<String> list2 = new ArrayList<>();
//
//        list2.add("BELAPUR");
//        list2.add("KHARGHAR");
//        list2.add("PANVEL");
//        list2.add("VIRAR");
//        list2.add("DOMBIVALI");
//        list2.add("KALYAN");
//        list2.add("THANE");
//        list2.add("BORIVALI");
//        list2.add("MALAD");
//        list2.add("ANDHERI");
//
//        System.out.println(list2);
//        Collections.sort(list2);
//        System.out.println(list2);
//        System.out.println(list2.);
//        System.out.println("Enter the word ypu want serach from above list");


    }
}
