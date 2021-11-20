package com.bilgeadam.sayisalloto;

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

        //6 lı bir arrey oluşturduk.
        //Döngüyle arrayi dolduralım.
        for (int i = 0; i < 6 ; i++) {
            sayilar[i] = loto.sayiGetir(49);

        }
        //arrayi yazdir

        for (int i = 0; i < 6 ; i++) {
            System.out.println(sayilar[i]);

        }


    }

}
