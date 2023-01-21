package okulYonetimi;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OgretmenIslemler implements IIslemler{
    Scanner scan=new Scanner(System.in);
   static int sicilNO=1000;
   static  ArrayList<Ogretmen> ogretmenArrayList=new ArrayList<>();
    void ogrtmnMenu(){

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

            }else {
                System.out.println("hatali giris");
                ogrtmnMenu();
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

        Ogretmen ogretmen=new Ogretmen(ad,Sad,tcno,yas,bolum,sicilNO++);
        ogretmenArrayList.add(ogretmen);
        ogrtmnMenu();

    }

    @Override
    public void arama() {
        System.out.println("tcno giriniz");
        String tcNi= scan.next();
        boolean kontrol=true;
        for (Ogretmen each: ogretmenArrayList){
            if (each.getTcNo().equals(tcNi)){
                System.out.println(each);
                kontrol=false;
            }
        }
        if (kontrol){
            System.out.println("tcno yok");
        }
        ogrtmnMenu();

    }

    @Override
    public void listeleme() {
        for (Ogretmen each: ogretmenArrayList){

                System.out.println(each);

        }
        ogrtmnMenu();

    }

    @Override
    public void silme() {
        System.out.println("tcno giriniz");
        String tcNi= scan.next();
        boolean kontrol=false;
        for (int i = 0; i < ogretmenArrayList.size(); i++) {
            if (ogretmenArrayList.get(i).getTcNo().equals(tcNi)){
                System.out.println("silinen ksii"+ogretmenArrayList.get(i));
                ogretmenArrayList.remove(i);
                kontrol=true;
                ogrtmnMenu();
            }
        }
        if (!kontrol){
            System.out.println("tcno yok");
        }
        ogrtmnMenu();
    }
}
