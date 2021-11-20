package com.bilgeadam.sayisalloto;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class SayisalLoto_array {
    // static degişkene obbje oluşturmadan class_adı.degişken diye erişebiliyoruz.

    private static final int MAX_SAYI = 90;
    private static final int KAC_SAYI =6;
    Random rnd = new Random();



    public int sayiGetir(int maxSayi)
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
    public void testArraydeVarmı()
    {
        int sayilar[] = {13, 45, 67, -4, 41, 70};
        int sayi = 0;
        boolean sonuc = arraydeVarmı(sayilar,sayi);
        if (sonuc==true)
            System.out.println("Arrayde var!");
        else
            System.out.println("Arrayde yok!");
    }

    public static void main(String[] args) {
        // yeni çılgın sayısal lotoya uygun
        // 90 sayıdan 6 tane sececegiz

        // sayıları tutacagımız bir array tanımlıyoruz.
        //int sayilar [] = new int[KAC_SAYI];

        //Döngüyle arraya rastgele sayıılar atalım
        //for (int i = 0; i < sayilar.length ; i++) {

        //}

        SayisalLoto_array loto = new SayisalLoto_array();
        loto.testArraydeVarmı();
    }
}
