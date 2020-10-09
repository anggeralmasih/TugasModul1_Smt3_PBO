package com.angger.tugasmodul1.No1;
// Anggeralmasih Wiradika Rusmana || 19104073 || S1SE-03-B

public class MainKonversi {
    public static void main(String[] args) {

    //Deklarasi
    double C = 50;
    double F = 50;
    double K = 50;
    double R = 50;

    Konversi konversi = new Konversi(C, F, K, R);
    konversi.calculate(konversi);

    //Output
    System.out.println("----Hasil Konversi Suhu----");
    System.out.println("C ke R : "+ konversi.no1);
    System.out.println("F ke K : "+ konversi.no2);
    System.out.println("K ke C : "+ konversi.no3);
    System.out.println("R ke F : "+ konversi.no4);
    }
}
