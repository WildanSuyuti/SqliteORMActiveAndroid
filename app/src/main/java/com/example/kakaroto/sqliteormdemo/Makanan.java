package com.example.kakaroto.sqliteormdemo;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;
import com.activeandroid.query.Update;

import java.util.List;

/**
 * Created by kakaroto on 27/07/17.
 */


@Table(name = "Makanan")
public class Makanan extends Model {


    @Column(name = "Menu")
    private String menu;

    @Column(name = "Harga")
    private int harga;

    @Column(name = "Stok")
    private int stok;

    public Makanan() {
        super();
    }

    public Makanan(String menu, int harga, int stok) {
        super();
        this.menu = menu;
        this.harga = harga;
        this.stok = stok;

    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "Makanan{" +
                "menu='" + menu + '\'' +
                ", harga=" + harga +
                ", stok=" + stok +
                '}';
    }

    public static List<Makanan> getAll() {
        return new Select().from(Makanan.class)
                .orderBy("Id Desc").execute();
    }

    public static void update(long id, Makanan makanan) {
        new Update(Makanan.class).set("Menu = ?, Harga = ?, Stok= ?", makanan.getMenu(),
                makanan.getHarga(), makanan.getStok())
                .where("Id = ?", id).execute();
    }
}
