package com.fenerbahce;
// FENERBAHCEMMM SEN COK YASAAAA CANIM FEDAAA OLSUN SANAAAA
public class Kaleci implements Sporcu {
    protected String ad;
    protected String soyad;
    protected int yas;
// GENEL OLARAK SPORCU İNTERFACESİNDEN İMPLEMENT ETTİM BU İMPLEMENT İŞİ KONUSUNDA CHATGPT YARDIMCIM OLDU
    public Kaleci(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    @Override
    public String bilgiVer() {
        return "İsim: " + ad + ", Soyisim: " + soyad + ", Yaş: " + yas;
    }

    public String sutCek() {
        return ad + " şut çekemez zaten cekemediği icin kaleci.";
    }

    @Override
    public String perform() {
        return ad + " kalecilik yapıyor cok iyi ucusları var valla harcanan yetenek.";
    }
}
