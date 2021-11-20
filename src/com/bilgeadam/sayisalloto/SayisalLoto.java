package com.bilgeadam.sayisalloto;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class SayisalLoto {

    public int sayiGetir(int maxSayi)
    {
        Random rnd = new Random();
        return rnd.nextInt(maxSayi)+1;
    }

    public static void main(String[] args) {
        SayisalLoto loto = new SayisalLoto();

        int sayilar[] = new int[6];

        int temp_sayi = 0;
        int sonuc = 0;



        //6 lı bir arrey oluşturduk.
        //Döngüyle arrayi dolduralım.
        for (int i = 0; i < 6 ; i++) {



            while(sonuc >= 0)
            {
                temp_sayi = loto.sayiGetir(49);

                //arrayi sıralayın
                Arrays.sort(sayilar);
                //binarysearch kullnamanın sartı arrayin sıralı olmasıdır.

                sonuc = Arrays.binarySearch(sayilar,temp_sayi);

            }

            sayilar[i] = temp_sayi;
            sonuc = 0;



        }
        //arrayi yazdir

        for (int i = 0; i < 6 ; i++) {
            System.out.println(sayilar[i]);

        }


    }

}
