public class Oneto100PrimeNumber {
    public static void main(String[] args) {
        System.out.print("2 ");
        for (int i=3;i<1000;i++){
             int count =0;
             for (int div =2;div*div<=i;div++){
                 if (i%div == 0){
                     count++;
                     break;
                 }
             }
             if (count == 0){
                 System.out.print(i + " ");
             }
        }
    }
}
