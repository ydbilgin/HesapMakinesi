import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int select;
        double n1, n2;
        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı giriniz : ");
        n1 = input.nextDouble();
        System.out.println("İkinci Sayıyı giriniz : ");
        n2 = input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Yapmak istediğiniz işlemi seçiniz:");
        select = input.nextInt();
        switch (select) {
            case 1:
                System.out.println("Sonuç : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonuç : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Sonuç : " + (n1 * n2));
                break;
            case 4:
                System.out.println("Sonuç : " + (n1 / n2));
                break;
            default:
                System.out.println("Hatalı giriş yaptınız : ");

        }

    }
}