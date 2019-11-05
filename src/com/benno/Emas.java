package com.benno;

public class Emas {
    private String nama;
    private double beratEmas;
    private int hargaEmas;

    public Emas(int hargaEmas) {
        this.hargaEmas = hargaEmas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getBeratEmas() {
        return beratEmas;
    }

    public void setBeratEmas(double beratEmas) {
        this.beratEmas = beratEmas;
    }

    public int getHargaEmas() {
        return hargaEmas;
    }

    public double totalHarga(double beratEmas, int hargaEmas){
        return beratEmas * hargaEmas;
    }
}
