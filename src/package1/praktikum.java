package package1;

import package2.ruangan;
import package2.mahasiswa;
import package2.sisipkanArray;
import package2.prosesData;
import java.util.ArrayList;
import java.util.Scanner;


// main class
public class praktikum {
    public static ArrayList daftarMhs = new ArrayList<>();
    static void showPraktikan(){
        System.out.println("\nLABORATORY BUILDING \n");
        // object ruangan
        ruangan a = new ruangan("D303","Lab Web Engineering","2 jam");
        a.tampilkan();
        
        // object mahasiswa
        mahasiswa keseluruhan = new mahasiswa();
        keseluruhan.method();
        
        // object prosesData
        prosesData satu = new prosesData(35,"cede","SI A20");
        satu.method();
        prosesData dua = new prosesData(70,"iyok","SI B21");
        dua.method();
        prosesData tiga = new prosesData(80,"rahmat","SI A21");
        tiga.method();
        prosesData empat = new prosesData(81,"rama","SI B21");
        empat.method();
        prosesData lima = new prosesData(35,"wawa","SI C21");
        lima.method();
        
        Scanner input = new Scanner(System.in);
        System.out.print("TEKAN ENTER UNTUK KEMBALI KE MENU UTAMA. ");
        input.nextLine();
    }
    
    static void showPosttest(){
        // object sisipkanArray
        sisipkanArray kesatu = new sisipkanArray("cede");
        sisipkanArray kedua = new sisipkanArray("rahmat");
        sisipkanArray ketiga = new sisipkanArray("rama");
        sisipkanArray keempat = new sisipkanArray("wawa\n");
        
        keempat.method(3);
        
        Scanner input = new Scanner(System.in);
        System.out.print("TEKAN ENTER UNTUK KEMBALI KE MENU UTAMA. ");
        input.nextLine();
    }
    
    public static void main(String args[]) {
        boolean loop = true;
        while(loop == true){
            Scanner input = new Scanner(System.in);
            System.out.println("SELAMAT DATANG DI PROGRAM PRAKTIKUM\n");
            System.out.println("MENU :");
            System.out.println("1. TAMPILKAN DATA PRAKTIKAN");
            System.out.println("2. TAMPILKAN DAFTAR MAHASISWA YANG TELAH MENYELESAIKAN POSTTEST");
            System.out.println("3. EXIT");
            System.out.print("\nSILAKAN MASUKKAN PILIHAN ANDA : ");
            String pilih = input.nextLine();
            switch(pilih){
                case "1" ->{
                    showPraktikan();
                    break;
                }case "2" ->{
                    showPosttest();
                    break;
                }case "3" ->{
                    loop = false;
                    break;
                }
            }
        }
    }
}