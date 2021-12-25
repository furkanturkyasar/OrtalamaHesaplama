import java.util.Scanner;
public class FinalCommit {

    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen mat notunuzu giriniz: ");
        mat =input.nextInt();
        System.out.println("Lutfen fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.println("Lutfen kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.println("Lutfen turkce notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.println("Lutfen tarih notunuzu giriniz: ");
        tarih = input.nextInt();
        System.out.println("Lutfen muzik notunuzu giriniz: ");
        muzik = input.nextInt();

        int sonuc = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = sonuc/6;
        System.out.println("Ortalamaniz: "+ ortalama);
        System.out.print(ortalama >=60 ? "Gectiniz" : "Gecemediniz");

    }
}
