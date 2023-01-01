package package2;
// class ruangan yg terdapat access modifier private, public & protected
public class ruangan {
    private String kode_ruang;
    public String nama_ruang;
    protected String waktu_penggunaan;
    
// constructor
    public ruangan(String kode_ruang,String nama_ruang,String waktu_penggunaan) {
        this.kode_ruang = kode_ruang;
        this.nama_ruang = nama_ruang;
        this.waktu_penggunaan = waktu_penggunaan;
    }
// method
    public void tampilkan(){
        System.out.println("Kode Ruangan" +"\t\t"+ this.kode_ruang);
        System.out.println("Nama Ruangan" +"\t\t"+ this.nama_ruang);
        System.out.println("Waktu Penggunaan" +"\t"+ this.waktu_penggunaan +"\n");
    }
    
    // Getter & Setter kode_ruang
    private String getKode_ruang() {
        return kode_ruang;
    }

    private void setKode_ruang(String kode_ruang) {
        this.kode_ruang = kode_ruang;
    }

    // Getter & Setter waktu_penggunaan
    protected String getWaktu_penggunaan() {
        return waktu_penggunaan;
    }

    protected void setWaktu_penggunaan(String waktu_penggunaan) {
        this.waktu_penggunaan = waktu_penggunaan;
    } 
}






