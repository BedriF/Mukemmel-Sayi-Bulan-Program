import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0,b=0,k=0,c=0,m=2,j=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz: ");
        a = input.nextInt();
        c=a-1;
        b=a;
       for(int n=1;n<=a;n++) {
           for (int i = 1; i <(2*b); i++) {
               System.out.print("*");
           }
           b--;
           System.out.print("\n");

           for( k=c;k<a;k++){
               System.out.print(" ");
           }
           c=k-m;
           m++;

       }

    }
}