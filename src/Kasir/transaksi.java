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
public class transaksi extends pembeli {
    public static int jml;
    
    public transaksi (int jml, int id_pembeli, String nama_pembeli, String alamat, String no_telp, int id_barang, String nama_brg, String merk_brg, int harga_brg)
    {
        super(id_pembeli, nama_pembeli, alamat, no_telp, id_barang, nama_brg, merk_brg, harga_brg);
        transaksi.jml = jml;
    }
    @Override
    public void tampilkan()
    {
        super.tampilkan();
        System.out.println("Jumlah barang :" + transaksi.jml);
    }
    public static void main (String[] args)
    {
        transaksi tr = new transaksi(12, 111,"Amel","sinar","1200",109 ,"buku","dunia", 10000);
        tr.tampilkan();
        System.out.println("<================================>");
        System.out.println("Kasir : Amel");
        System.out.println("Tanggal : 28/08/2001");
        
    }
    
    
}
