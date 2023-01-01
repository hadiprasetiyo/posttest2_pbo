package package2;
import package1.praktikum;

public class sisipkanArray extends mahasiswa{
    
    public sisipkanArray( String nama){
        super.Nama = nama;
        praktikum.daftarMhs.add(super.Nama);
    }
    public void method(int brp){ 
        System.out.println("\nList Mahasiswa yang telah Menyelesaikan Posttest "+brp+" :\n");
        for(int i = 0; i < praktikum.daftarMhs.size(); i++){
            System.out.println("- "+praktikum.daftarMhs.get(i));
        }
    }
}
