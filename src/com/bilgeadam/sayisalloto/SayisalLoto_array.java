package com.bilgeadam.sayisalloto;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class SayisalLoto_array {
    // static degişkene obbje oluşturmadan class_adı.degişken diye erişebiliyoruz.

    private static final int MAX_SAYI = 90;
    private static final int KAC_SAYI =6;
    Random rnd = new Random();



    public int sayiGetir()
    {
        // nextInt (90) metodu 0-89 arası üretilir.
        // 1 den başlasın diye 1 ekliyoruz.
        return rnd.nextInt(MAX_SAYI)+1;

    }
    public boolean arraydeVarmı(int[] sayilar, int sayi)
    {
        // bınarySearch ile arayacagız.
        //binarySearch kullanmanın şartı arrayin sıralı olması

        //gelen arrayi sıralıyoruz
        Arrays.sort(sayilar);

        int sonuc = Arrays.binarySearch(sayilar, sayi);
        if(sonuc>=0)
            return true;
        else
            return false;


    }
//    public void testArraydeVarmı()
//    {
//        int sayilar[] = {13, 45, 67, -4, 41, 70};
//        int sayi = 0;
//        boolean sonuc = arraydeVarmı(sayilar,sayi);
//        if (sonuc==true)
//            System.out.println("Arrayde var!");
//        else
//            System.out.println("Arrayde yok!");
//    }

    public static void main(String[] args) {
         //yeni çılgın sayısal lotoya uygun
        // 90 sayıdan 6 tane sececegiz

        SayisalLoto_array loto = new SayisalLoto_array();
         //sayıları tutacagımız bir array tanımlıyoruz.
        int sayilar [] = new int[KAC_SAYI];

       // Döngüyle arraya rastgele sayıılar atalım
        for (int i = 0; i < sayilar.length ; i++) {
            int rastgeleSayi = loto.sayiGetir();

            // rastgele sayı arrayde varmı döngüyle tekrar sayı alınacak
            // arrayde olmayan sayı bulanda kadar döngüden çıkamaz
            boolean sonuc = loto.arraydeVarmı(sayilar,rastgeleSayi);
            while (sonuc == true)
            {
                rastgeleSayi = loto.sayiGetir();
                sonuc = loto.arraydeVarmı(sayilar, rastgeleSayi);
            }

            //her arrayin ilk elamanına yazalım rastgele sayıyı
            // çünkü sıralnaınca sayı sonlara gidiyor.

            sayilar[0] = rastgeleSayi;

            //&.sayıyı sıfır indekse yazınca tekrar sıralaması için bunu ekledik
            Arrays.sort(sayilar);

        }
        //arrayi yazdır.
        for (int i = 0; i <sayilar.length ; i++) {


            if (i == sayilar.length-1)
                System.out.print(sayilar[i]);
            else
                System.out.print(sayilar[i]+"-");

        }


        //loto.testArraydeVarmı();
    }
}
