package Okul;

import java.util.ArrayList;
import java.util.List;

public class Okul {

    private String okulAdi;
    private int maxOgrenci;


    List<OgrenciSinifi> ogrenciSinifiList = new ArrayList<>();

    public String getOkulAdi() {
        return okulAdi;
    }

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }

    public int getMaxOgrenci() {
        return maxOgrenci;
    }

    public void setMaxOgrenci(int maxOgrenci) {
        this.maxOgrenci = maxOgrenci;
    }

    public List<OgrenciSinifi> getOgrenciSinifiList() {
        return ogrenciSinifiList;
    }

    public void setOgrenciSinifiList(List<OgrenciSinifi> ogrenciSinifiList) {
        this.ogrenciSinifiList = ogrenciSinifiList;
    }
}


