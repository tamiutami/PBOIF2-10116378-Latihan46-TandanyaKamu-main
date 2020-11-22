/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Human;

/**
 *
 *@author Sri Utami Ningsih
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116378
 * Deskripsi Program : Program meramal umur
 */
import java.util.Scanner;
import java.util.Calendar;


public class TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        Age umur = new Age();
        
        System.out.printf("Masukkan Tahun Lahir Anda : ");umur.setYearBirth(scan.nextInt());
        
        System.out.printf("\n======Hasil Perhitungan Umur======\n");
        System.out.printf("Tahun lahir anda : %d\n",umur.getYearBirth());
        umur.Age(Calendar.getInstance().get(Calendar.YEAR));
        System.out.printf("Hari ini tahun : %d\n",umur.getYearNow());
        System.out.printf("Umur kamu sampai hari ini adalah %d tahun\n", umur.hitungUmur());
        System.out.printf("Tandanya Kamu %s\n", umur.tandanyaKamu(umur.hitungUmur()));
        
        
    }
    
}
