package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {
        int sayi = 99;
        //verilen sayinin 3 veya daha cok basamakli olup olmadigini kontrol eden
        // ve sonucu yazdiran bir ternary yaziniz
        String sonuc = sayi >= 100 ? "sayi 3 basamakli veya daha buyuk" :
                "sayi negatif veya 3 basamaktan kucuk";
        //Ternary bize sonuc dondurdugu icin
        //ya bu sonucu direkt yazdirmaliyiz
        //ya da sonucun data turune uygun
        System.out.println("Girdiginiz sayi analizi : " + sonuc);
    }
}
