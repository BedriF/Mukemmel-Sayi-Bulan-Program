import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0,toplam=0,toplam2=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        a = input.nextInt();
        for(int i=2;i<=a;i++){
            if(0==a%i){
                //System.out.println(a/i);
                toplam=a/i;
                toplam2=toplam+toplam2;
            }
        }

        if(toplam2==a){
            System.out.println(+toplam2+ " Mükemmel sayıdır. ");
        }
        else{
            System.out.println(+a+ " Mükemmel sayı değildir. ");
        }
    }
}