package sistemipk;

/**
 *
 * @author Jungs
 */
public class SistemIPK {

    
    public static void main(String[] args) {
        int [] namamat = {0,1};
        Mahasiswa maha = new Mahasiswa("I Nyoman Arijaya PutrA","195150607111009",namamat);
        maha.tampilMahasiswa();
        Nilai nilai = new Nilai();
        Nilai matkul[] = new Matkul[2];
        for (int i = 0; i < matkul.length; i++) {
            matkul[i]= new Matkul();
        }
        double tugasMatkul[] = {100,100};
        matkul[0].setTugas(tugasMatkul);
        matkul[0].setUts(0);
        matkul[0].setUas(100);
        matkul[1].setTugas(tugasMatkul);
        matkul[1].setUts(0);
        matkul[1].setUas(100);
        System.out.println("Pemlan");
        matkul[0].tampilNa();
        System.out.println("Statistik");
        matkul[1].tampilNa();
        
        Nilai praktikum = new Praktikum();
        double praktikumMatkul[] = {100,100};
        praktikum.setTugas(praktikumMatkul);
        praktikum.setUts(100);
        praktikum.setUas(100);
        System.out.println("Pemlan");
        praktikum.tampilNa();
        
        double total = ((matkul[0].hitungIpk()*60/100+praktikum.hitungIpk()*40/100)+matkul[1].hitungIpk())/2;
        System.out.println("IPK = "+total);
    }
    
}
