package ebruMeryemFikriyeDilekSoruCozumu;

public class Soru12 {
    public static void main(String[] args) {
        //Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin. Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
        //60 – 80.000 arasinda ise “Konusabiliriz”,
        //60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
        double maas = 50.000;
        if (maas > 80.000) {
            System.out.println("kabul ediyorum");
        } else if (maas < 80.000 && maas > 60.000) {
            System.out.println("konusabiliriz");

        }else if (maas < 60.000){
            System.out.println("kabul edemem");
        }else {
            System.out.println("gecerli bir meblag giriniz");
        }
    }
}