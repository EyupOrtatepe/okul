package okulYonetimi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnaMenu {
    void menu() {
        Scanner scan=new Scanner(System.in);
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ\n"+
                "\t Seciminiz :");

        try {
            int secim= scan.nextInt();
            switch (secim){
                case 1:{
                    OgrenciIslemler ogrenciMenu=new OgrenciIslemler();
                    ogrenciMenu.ogrenciMenu();

                }
                case 2:{
                    OgretmenIslemler ogretmenMenu=new OgretmenIslemler();
                    ogretmenMenu.ogrtmnMenu();

                }
            }
        }catch (InputMismatchException e){
            String secim= scan.next();
            if (secim.equalsIgnoreCase("q")){
                System.out.println("sistemden cikiiliyor");
                System.exit(0);
            }else {
                System.out.println("hatali giris");
                menu();
            }
        }
    }
}
