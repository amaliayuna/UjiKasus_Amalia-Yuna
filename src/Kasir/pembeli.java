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

class pembeli extends barang {
public int id_pembeli;
public String nama_pembeli, alamat, no_telp;

public pembeli(int id_pembeli, String nama_pembeli, String alamat, String no_telp
,int id_barang, String nama_brg, String merk_brg, int harga_brg)
{
    super (id_barang, nama_brg, merk_brg, harga_brg);
  
        this.id_pembeli = id_pembeli;
        this.nama_pembeli = nama_pembeli;
        this.alamat = alamat;
        this.no_telp = no_telp;   
}
public void tampilkan()
{
    System.out.println("id pembeli    :"+this.id_pembeli);
    System.out.println("nama pembeli    :"+this.nama_pembeli);
    System.out.println("alamat pembeli    :"+this.alamat);
    System.out.println("no telepon    :"+this.no_telp);
    super.tampilkan();
}
}