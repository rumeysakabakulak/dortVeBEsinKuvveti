import java.util.Scanner;
public class dortVeBesinKuvveti {
    public static void main(String[] args) {

        int n;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        n = inp.nextInt();

        System.out.println("4'ün Kuvvetleri : ");
        for ( int i = 1 ; i <= n ; i *= 4) {
            System.out.println(i);
        }
        System.out.println("5'in Kuvvetleri : ");
        for (int k = 1 ; k <= n ; k*=5) {
            System.out.println(k);
        }

    }
}
