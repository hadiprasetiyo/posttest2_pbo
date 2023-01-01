package package2;

public class prosesData extends mahasiswa{
    final String Kelas;

    // constructor
    public prosesData(int nim,String nama, String kelas){
        super.NIM = nim;
        super.Nama = nama;
        this.Kelas = kelas;
    }
    @Override
    public void method(){
        System.out.println("NIM"+"\t"+": "+super.NIM);
        System.out.println("Nama"+"\t"+": "+super.Nama);
        System.out.println("Kelas\t: "+this.Kelas+"\n");
    }
}
