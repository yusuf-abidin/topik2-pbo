package com.company;

public class Buku {

    private final String isbn;
    private String judulBuku;
    private String pengarang;
    private String tahunTerbit;
    private float harga, rating;

    public Buku(String isbn, String judulBuku, String pengarang, String tahunTerbit, float harga, float rating) {
        this.isbn = isbn;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.rating = rating;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }
    public void setHarga(float harga) {
        this.harga = harga;
    }
    public float getHarga() {
        return harga;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public float getRating() {
        return rating;
    }






}
