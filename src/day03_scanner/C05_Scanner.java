package day03_scanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //kullanicidan yaricap isteyip
        //cemberin cevresini ve dairenin alanini hesaplayin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini girin");
        double yaricap = scan.nextDouble();

        System.out.println("girdiginiz yaricap:" + yaricap);
        System.out.println("cemberin cevresi:" + 2 * 3.14 * yaricap);
        System.out.println("dairenin alani:" + 3.14 * yaricap * yaricap);
    }
}
