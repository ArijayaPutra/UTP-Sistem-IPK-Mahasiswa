/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemipk;

/**
 *
 * @author Jungs
 */
public class Praktikum extends Nilai{
    public double hitungIpk(){
        double tugas = 0;
        for (int i = 0; i < getTugas().length; i++) {
            tugas+=getTugas()[i];
        }
        setParam(1);
        return ((tugas/getTugas().length)*20/100) + (getUts()*40/100) + (getUas()*40/100);
    };
    
    public void tampilNa(){
        System.out.println("------------------------------------------------");
        System.out.print("Nilai Tugas Praktikum : ");
        for (int i = 0; i < getTugas().length; i++) {
            System.out.print(getTugas()[i]+ ", ");
        }
        System.out.println("\nNilai UTP : "+getUts());
        System.out.println("Nilai UAP : "+getUas());
        System.out.println("Nilai Akhir Praktikum : "+hitungIpk());
    }
}
