import java.awt.*;
import java.util.Scanner;

public class odev3 {
    public static void main (String[] args) {
        int a,b ;
        double c;

        Scanner girilen = new Scanner(System.in);
        System.out.print("1.dik kenar uzunluğunu yazınız:");
        a = girilen.nextInt();
        System.out.print("2.dik kenar uzunluğunu yazınız:");
        b = girilen.nextInt();
        c = Math.sqrt(a*a + b*b);
        System.out.println("hipotenüs uzunluğu:" +c);

    }
}
