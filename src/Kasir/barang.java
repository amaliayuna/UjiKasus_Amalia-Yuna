/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasir;

/**
 *
 * @author Amalia Yuna
 */
public class barang {
    public int id_barang, harga_brg;
    public String nama_brg, merk_brg;
    
    public barang(int id_barang, String nama_brg, String merk_brg, int harga_brg)
    {
        this.id_barang = id_barang;
        this.nama_brg = nama_brg;
        this.harga_brg = harga_brg;
        this.merk_brg = merk_brg;
    }
    public void tampilkan()
    {
        System.out.println("id barang    :"+id_barang);
        System.out.println("nama barang  :"+nama_brg);
        System.out.println("harga barang :"+harga_brg);
        System.out.println("merk barang  :"+merk_brg);
    }
    
}
