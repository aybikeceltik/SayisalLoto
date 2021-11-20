package com.bilgeadam.sayisalloto;

public class WhileOrnek {
    // for döngüsünden farkı,
    // sayıdan cok duruma baglı olmasıdır.

    // while dögüsü ile 1 den 10 a kadar merhaba yazdıralım.

    public static void main(String[] args) {
        int sayac = 1;
        while(sayac <= 10 )
        {
            System.out.println(sayac+" Merhaba ");

            // Genelde bu unutulur
            // program sonsuz döngüye giriyor.
        }

    }



}
