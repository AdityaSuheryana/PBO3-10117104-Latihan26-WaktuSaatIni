/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan26.waktusaatini;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 *
 * @author
 * Nama      : Aditya Suheryana
 * Nim       : 10117104
 * Kelas     : IF-3/PBO3
 * Deskripsi : Menampilkan Waktu Saat ini
 * 
 */
public class PBO310117104Latihan26WaktuSaatIni {

    public String getTanggal(){
        DateFormat dateFormat = new SimpleDateFormat ("EEEE,dd MMM yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }
    public String getWaktu(){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    public static void main(String[] args) {
        PBO310117104Latihan26WaktuSaatIni  tgl = new PBO310117104Latihan26WaktuSaatIni ();
        System.out.println("Hari ini adalah hari : "+ tgl.getTanggal() +" "+ tgl.getWaktu());
    }
    
}
