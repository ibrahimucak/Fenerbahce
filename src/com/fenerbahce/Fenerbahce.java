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
            // İNSTANCE OF = HANGİ SİNİFA AİT? anlamına getirmek icin kullanılan bir methottur.
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
            // methodlarını kullanarak öğrendiğim ve az da olsa chatgptnin yardım ettiği bir proje oldu
            // ayrıca parent child iliskisini derinlemesine anlamış oldum




// EKSTRA EKLENEBİLENLER
// Performans(nasıl?),daha fazla futbolcu(basit),
// Calısma kadrosu adında bir class acıp hoca yı instanceof edip yanına ekstra olarak doktor ekleyebiliriz.
// yardımcı antrenör ekleyebiliriz hocanın childi olur
// bir yönetim kadrosu ekleyip en üste koyabiliriz ama parentler arası ve childlar arası o zinciri nasıl?
// futbolcuyla hoca arasındaki iliskiyi kurdum ama mesela DOKTOR YÖNETİM KADROSUNDA OLUCAK FUTBOLCUYLA NASIL İLETİSİM ?
// kondisyon,bazıları uzun süre kosabilirken bazıları hemen tıkanabilir(DZEKO?)
// Oyuncu  değeri, ( kondisyon yas ve performansın toplamı sonucu bir ortalama değer? ama cok ütopik oldu)
//


        }
    }
}
