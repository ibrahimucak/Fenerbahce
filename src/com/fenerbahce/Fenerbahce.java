package com.fenerbahce;

public class Fenerbahce {
    public static void main(String[] args) {
        Sporcu[] sporcular = {
                new Kaleci("Kadir ", "Kayikci", 22),
                new Futbolcu("Cihan", "Karpinar", 23, "Orta Saha"),
                new Futbolcu("İbrahim", "Ucak", 21, "Slk"),//Sol kanat,
                new Hoca("Emrah", "Kiziltan", 35, 10) //
        };

        for (Sporcu sporcu : sporcular) {
            System.out.println(sporcu.bilgiVer());
            System.out.println(sporcu.perform());
            // BURASI ZATEN GÖRDÜĞÜNÜZ ÜZERE PZT GÜNÜNÜN NEREDEYSE AYNISI BAKA BAKA KOPYALADIM.
            if (sporcu instanceof Kaleci) {
                System.out.println(((Kaleci) sporcu).sutCek());
            }
            if (sporcu instanceof Futbolcu) {
                System.out.println(((Futbolcu) sporcu).topTut());
            }
            if (sporcu instanceof Hoca) {
                System.out.println(((Hoca) sporcu).egit());
            }

            System.out.println(); // çıktılar burdan cıkıcak.
            // 25 ekim cuma saat 03.25
            // hic kullanmadığım ve ismini dahi görünce bu ne dediğim /İNSTANCE OF,PROTECTED,
            // classlarını kullanarak öğrendiğim ve az da olsa chatgptnin yardım ettiği bir proje oldu

        }
    }
}
