/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119062.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 * Deskripsi Progam : program ini berisi program untuk menampilkan
 * gaji karyawan
 */
public class PBOIF210119062Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        Manager objManager = new Manager();
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : "); objManager.setNik(input.nextLine());
        System.out.print("Masukkan Nama : "); objManager.setNama(input.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : "); objManager.setGolongan(input.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : "); objManager.setJabatan(input.next());
        System.out.print("Masukkan Jumlah Kehadiran : "); objManager.setKehadiran(input.nextInt());
        System.out.println("");
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK     : "+objManager.getNik());
        System.out.println("NAMA    : "+objManager.getNama());
        System.out.println("GOLONGAN: "+objManager.getGolongan());
        System.out.println("JABATAN : "+objManager.getJabatan());
        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN  : "+objManager.tunjanganGolongan(objManager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN   : "+objManager.tunjanganJabatan(objManager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : "+objManager.tunjanganKehadiran(objManager.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL  : "+objManager.gajiTotal());
    }
    
}
