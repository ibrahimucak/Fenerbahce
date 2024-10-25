package com.fenerbahce;

public class Futbolcu implements Sporcu {
    protected String ad;
    protected String soyad;
    protected int yas;
    private String pozisyon; // burası private cünkü pozisyon kısmını kaleci görmemeli,

    public Futbolcu(String ad, String soyad, int yas, String pozisyon) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.pozisyon = pozisyon;
    } // klasik this kullanımı

    @Override
    public String bilgiVer() {
        return "İsim: " + ad + ", Soyisim: " + soyad + ", Yaş: " + yas + ", Pozisyon: " + pozisyon;
    } // override ederek parentten childe akış sağladım böylece main classında atadığım değerleri buradan yazdırabilicem

    public String topTut() {
        return ad + " KALECİLİK SIFIR.";
    } // futbolcu burada top tutamaz aslında bi  main classta
    //  bir  İF ELSE YAPISI DA KULLANABİLİRDİM AMA BÖYLE DAHA KOLAY OLDU BENİM İCİN

    @Override
    public String perform() {
        return ad + " futbol oynuyor her hafta mutlaka halısahaya gidiyor .";
    } // PERFORM, PERFORMANSIN KISALTILMASI, LEVEL VERMEYİ
    // BECEREMEDİĞİM İCİN ÖYLE KALDI MEVKİ OALRAK DA DEGİSTİREBİLİRİZ.
}
