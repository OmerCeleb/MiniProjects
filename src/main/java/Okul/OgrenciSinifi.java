package Okul;

public class OgrenciSinifi {
    private String ad;
    private String soyad;
    private int yas;


    public OgrenciSinifi(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;


    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}

