import java.util.Scanner;

public class my {
    public static void main(String[] args) {
        /*
        kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
         */
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println( "Lütfen  1.dik kenarı girin");
        a= sc.nextInt();

        System.out.println( "Lütfen  2.dik kenarı girin");
        b=sc.nextInt();

        double hipotenus = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: " + hipotenus);


    }
}
