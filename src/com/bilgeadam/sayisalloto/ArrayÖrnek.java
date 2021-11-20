package com.bilgeadam.sayisalloto;

public class ArrayÖrnek {

    public static void main(String[] args) {

        // arraylerin tipi olmak zorunda.
        int sayilar[] = new int[6];

        // 6 lı oluşturulduysa array indeksleri 0 dan 5 e kadardır.

        sayilar[0] = 23;
        sayilar[1] = 11;
        sayilar[2] = 35;
        sayilar[3] = 46;
        sayilar[4] = 0;
        sayilar[5] = 29;

        // Bu hata verir, 6 diye bir indeks yok.
        //sayılar[6] 500;

        //arrayi yazdıralım
        for (int i=0; i<6; i++)
        {
            System.out.println(sayilar[i]);
        }








    }



}
