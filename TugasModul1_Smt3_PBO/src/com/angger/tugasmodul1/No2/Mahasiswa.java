package com.angger.tugasmodul1.No2;
// Anggeralmasih Wiradika Rusmana || 19104073 || S1SE-03-B

public class Mahasiswa {

    //Deklarasi
    private String nama, asal, ttl, sekolah, pil;

    //Constructor pertama
    public Mahasiswa(){}

    //Constructor kedua
    public Mahasiswa(String nama, String asal, String ttl, String sekolah, String pil) {
        this.nama = nama;
        this.asal = asal;
        this.ttl = ttl;
        this.sekolah = sekolah;
        this.pil = pil;
    }

    //Definisi Method
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsal() {
        return this.asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getTtl() {
        return this.ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getSekolah() {
        return sekolah;
    }

    public void setSekolah(String sekolah) {
        this.sekolah = sekolah;
    }

    public String getPil() {
        return this.pil;
    }

    public void setPil(String pil) {
        this.pil = pil;
    }
}
