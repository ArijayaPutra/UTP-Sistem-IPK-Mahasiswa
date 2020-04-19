package sistemipk;

public class Mahasiswa {
    private String nama;
    private String nim;
    private int matkul[];

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int[] getMatkul() {
        return matkul;
    }

    public void setMatkul(int matkul[]) {
        this.matkul = matkul;
    }

    public Mahasiswa(String nama, String nim, int matkul[]) {
        this.nama = nama;
        this.nim = nim;
        this.matkul = matkul;
    }

    public void tampilMahasiswa(){
        System.out.println("Nama :"+getNama());
        System.out.println("Nim :"+getNim());
        System.out.println("Matkul :"+getMatkul());
    }
}
