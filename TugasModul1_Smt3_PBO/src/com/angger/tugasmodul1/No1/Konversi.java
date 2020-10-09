package com.angger.tugasmodul1.No1;
// Anggeralmasih Wiradika Rusmana || 19104073 || S1SE-03-B

public class Konversi {
    //Deklarasi
    double no1,no2, no3, no4;

    public Konversi(double no1, double no2, double no3, double no4) {
        this.no1 = no1;
        this.no2 = no2;
        this.no3 = no3;
        this.no4 = no4;
    }

    //Pass by reference
    void calculate(Konversi konversi){
        konversi.no1 = (konversi.no1 * 0.8);
        konversi.no2 = (konversi.no2 + 459.67) / 1.8;
        konversi.no3 = (konversi.no3 - 273.15);
        konversi.no4 = (konversi.no4 * 2.25) + 32;
    }
}
