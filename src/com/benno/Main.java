package com.benno;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Menghitung biaya emas kawin
     */

public class Main {

    public static void main(String[] args) {
	    Emas emas = new Emas(570000);
        emas.setNama("Hendi");
        emas.setBeratEmas(15.7);

        System.out.println("Nama Pembeli : " + emas.getNama());
        System.out.println("Berat Emas : " + emas.getBeratEmas() + " gram");
        System.out.println("Harga per gram : Rp " + emas.getHargaEmas());
        System.out.println("Total Harga : Rp " + emas.totalHarga(emas.getBeratEmas(), emas.getHargaEmas()));
    }
}
