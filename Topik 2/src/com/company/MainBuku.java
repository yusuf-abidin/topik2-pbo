package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBuku {

    private static final Scanner scanner =new Scanner(System.in);
    private static final ArrayList<Buku> dataBuku = new ArrayList<>();

    public static void main(String[] args) {

        int pilihan;
        do {
            System.out.println("1. Input Buku Baru");
            System.out.println("2. Edit Data Buku");
            System.out.println("3. Tampilkan Semua Buku");
            System.out.println("4. Tambilkan Buku Berdasarkan ISBN");
            System.out.println("5. Hapus Buku");
            System.out.println("0. Keluar\n");

            System.out.print("Pilih Menu : ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (pilihan){
                case 0:
                    System.out.println("Aplikasi Berhenti");
                    break;
                case 1:
                    inputBuku();
                    break;
                case 2:
                    editBuku();
                    break;
                case 3:
                    displayBuku();
                    break;
                case 4:
                    displayFromISBN();
                    break;
                case 5:
                    hapusBuku();
                    break;
                default:
                    System.out.println("Pilih menu yang sesuai!\n");
                    break;
            }

        }while (pilihan != 0);

    }

    private static void hapusBuku() {
        System.out.println("HAPUS BUKU");
        System.out.print("Masukkan ISBN : ");
        String isbn = scanner.nextLine();

        if (dataBuku.size()==0){
            System.out.println("Data tidak ditemukan\n");
        }else {

            Buku i = searchByISBN(isbn);

            if (i!= null){
                dataBuku.removeIf(x -> x.getIsbn().equalsIgnoreCase(isbn));
                System.out.println("Data berhasil dihapus!\n");
            }else {
                System.out.println("Data tidak ditemukan!\n");
            }
        }
    }

    private static void displayFromISBN() {
        System.out.println("TAMPILKAN BUKU BERDASARKAN ISBN\n");
        System.out.print("Masukkan ISBN : ");
        String isbn = scanner.next();
        if (dataBuku.size()==0){
            System.out.println("Data tidak ditemukan!\n");
        }else {
            Buku i =searchByISBN(isbn);
            if (i != null){
                display(i);
            }else {
                System.out.println("Data tidak ditemukan!\n");
            }
        }
    }

    private static void displayBuku() {
        System.out.println("TAMPILKAN SEMUA BUKU\n");
        if (dataBuku.size() == 0){
            System.out.println("Tidak Ada Data!\n");
        }else {
            for (Buku i:dataBuku) {
                display(i);
            }
        }
    }

    private static void editBuku() {
        System.out.println("EDIT DATA BUKU");
        System.out.print("Masukkan ISBN : ");
        String isbn = scanner.nextLine();

        if (dataBuku.size()==0){
            System.out.println("Data tidak ditemukan!\n");
        }else {
            Buku i = searchByISBN(isbn);
            if (i != null){
                display(i);

                System.out.println("MASUKKAN DATA BARU");

                System.out.println("ISBN : " + i.getIsbn());

                System.out.print("Judul Buku : ");
                String judul = scanner.nextLine();

                System.out.print("Pengarang : ");
                String pengarang = scanner.nextLine();

                System.out.print("Tahun Terbit : ");
                String tahunTerbit = scanner.nextLine();

                System.out.print("Harga : ");
                float harga = scanner.nextFloat();

                System.out.print("Rating : ");
                float rating = scanner.nextFloat();

                i.setJudulBuku(judul);
                i.setPengarang(pengarang);
                i.setTahunTerbit(tahunTerbit);
                i.setHarga(harga);
                i.setRating(rating);

                System.out.println("Data berhasil diupdate");
            }else {
                System.out.println("\nData tidak ditemukan!");
            }
        }
    }

    private static void inputBuku() {
        System.out.println("INPUT BUKU BARU");

        System.out.print("Judul Buku : ");
        String judul = scanner.nextLine();

        System.out.print("Pengarang : ");
        String pengarang = scanner.nextLine();

        System.out.print("Tahun Terbit : ");
        String tahunTerbit = scanner.nextLine();

        System.out.print("ISBN : ");
        String isbn = scanner.nextLine();

        System.out.print("Harga : ");
        float harga = scanner.nextFloat();

        System.out.print("Rating : ");
        float rating = scanner.nextFloat();

        Buku i = searchByISBN(isbn);

        if (i == null){
            Buku buku  = new Buku(isbn, judul, pengarang, tahunTerbit, harga, rating);
            dataBuku.add(buku);
            System.out.println("Data Berhasil Disimpan!\n");
        }else {
            System.out.println("Data dengan ISBN " + isbn + " sudah ada\n");
        }

    }

    private static Buku searchByISBN (String isbn){
        Buku buku = null;
        for (Buku b : dataBuku){
            if (b.getIsbn().equalsIgnoreCase(isbn)){
                buku = b;
            }
        }
        return buku;
    }

    private static void display (Buku i){
        System.out.println("ISBN : " + i.getIsbn());
        System.out.println("Judul Buku : " + i.getJudulBuku());
        System.out.println("Pengarang : " + i.getPengarang());
        System.out.println("Tahun Terbit : " + i.getTahunTerbit());
        System.out.println("Harga : " + i.getHarga());
        System.out.println("Rating : " + i.getRating() + "\n");
    }
}
