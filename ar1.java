import java.util.Scanner;
class ar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] a=new int [5];
        System.out.println("enter the numbers");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();


        }
  System.out.println("the numbers  are:");
    for(int i=0;i<5;i++){
        System.out.println(a[i]);
   }
}
}