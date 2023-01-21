package okulYonetimi;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class OgrenciIslemler implements IIslemler{
static String sinif;
    static int numara=1000;
    Scanner scan=new Scanner(System.in);
static ArrayList<Ogrenci> ogrenciArrayList=new ArrayList<>();
    void ogrenciMenu(){
        System.out.println("\n" +
                "\t============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ:");
        try {
            int secim= scan.nextInt();
            switch (secim){
                case 1:{
                    ekleme();
                }
                case 2:{
                    arama();
                }
                case 3:{
                    listeleme();
                }
                case 4:{
                    silme();
                }
            }
        }catch (InputMismatchException e){
            String secim= scan.next();
            if (secim.equalsIgnoreCase("q")){
                AnaMenu anaMenu=new AnaMenu();
                anaMenu.menu();

            }
        }
    }



    @Override
    public void ekleme() {
        System.out.println("adi");
        String ad= scan.next();
        System.out.println("Sadi");
        String Sad= scan.next();
        System.out.println("TCNO");
        String tcno= scan.next();
        System.out.println("yasi");
        int yas= scan.nextInt();
        System.out.println("bolum");
        String bolum= scan.next();

        Ogrenci ogrenci=new Ogrenci(ad,Sad,tcno,yas,numara++,sinif);
        ogrenciArrayList.add(ogrenci);
        ogrenciMenu();

    }

    @Override
    public void arama() {

    }

    @Override
    public void listeleme() {

    }

    @Override
    public void silme() {

    }
}
