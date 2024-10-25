package com.fenerbahce;
// HOCA KISMI İSE KALECİ VE FUTBOLCULARLA AYNI CLASSA SAHİP FAKAT TABİKİ FARKLI BİR ÖZELLİĞİ VAR
// PRİVATE OLMASI GEREKEN O DA DENEYİMDİR
public class Hoca implements Sporcu {
    protected String ad;
    protected String soyad;
    protected int yas;
    private int deneyim;

    public Hoca(String ad, String soyad, int yas, int deneyim) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.deneyim = deneyim;
    }

    @Override
    public String bilgiVer() {
        return "İsim: " + ad + ", Soyisim: " + soyad + ", Yaş: " + yas + ", Deneyim: " + deneyim + " yıl";
    }

    public String egit() {
        return ad + " " + soyad + " oyuncuları eğitiyor.";
    } // HOCANIN DİĞER KALECİ FUTBOLCU VE SPORCU CLASSINDAN FARKI EĞİT OLARAK VERDİM FUTBOLCU VE KALECİ SPORCULARDA TABİKİ YOK
    // VE HOCALAR DA ESKİ SPORCU OLDUĞU İÇİN TABİİ Kİ İMPLEMENT YAPTIM TERCİH MESELESİ AYRI BİR İF BLOĞU YAZABİLİRİZ
    // AMA BUNU YAPARKEN FENERBAHCE MAİN CLASSINDA DA 2 AYRI METHOT YAZMAMIZ GEREKİR BU DA BENİM İÇİN KARIŞIK GELDİ

    @Override
    public String perform() {
        return ad + " eğitim veriyor.";
    } // JOSE MOURİNHOYA GÜVENİMİZ TAM.
}
