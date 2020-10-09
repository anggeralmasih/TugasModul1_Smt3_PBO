package com.angger.tugasmodul1.No2;
import java.util.Scanner;
// Anggeralmasih Wiradika Rusmana || 19104073 || S1SE-03-B

public class DaftarMahasiswa {
    public static void main(String[] args) {

        //Deklarasi
        String nama, asal, ttl, sekolah, pil;

        Mahasiswa regis = new Mahasiswa();
        Scanner scanner = new Scanner(System.in);

        //Input data
        System.out.println("-----Input Data Calon Mahasiswa Baru-----");
        System.out.print("Masukkan Nama\t : ");
        nama = scanner.nextLine();
        regis.setNama(nama);
        System.out.print("Masukkan TTL\t : ");
        ttl = scanner.nextLine();
        regis.setTtl(ttl);
        System.out.print("Masukkan Asal\t : ");
        asal = scanner.nextLine();
        regis.setAsal(asal);
        System.out.print("Masukkan Sekolah : ");
        sekolah = scanner.nextLine();
        regis.setSekolah(sekolah);
        System.out.print("Masukkan Jurusan : ");
        pil = scanner.nextLine();
        regis.setPil(pil);

        //Output data
        System.out.println();
        System.out.println("------Data Calon Mahasiswa Baru------");
        System.out.println("Nama\t\t\t: " + regis.getNama());
        System.out.println("TTL\t\t\t\t: " + regis.getTtl());
        System.out.println("Asal\t\t\t: " + regis.getAsal());
        System.out.println("Sekolah\t\t\t: " + regis.getSekolah());
        System.out.println("Pilihan Jurusan : " + regis.getPil());
    }
}
