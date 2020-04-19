package sistemipk;

public class Nilai {
    private double tugas[];
    private double uts;
    private double uas;
    private double na;
    private static int param;

    public double getParam() {
        return param;
    }

    public void setParam(int param) {
        this.param = param;
    }

    public double[] getTugas() {
        return tugas;
    }

    public void setTugas(double[] tugas) {
        this.tugas = tugas;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUts() {
        return uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }
    
    public double hitungIpk(){
        return 0;
    }
    
    public void tampilNa(){
        
    }
    
    public double getNa() {
        return na;
    }

    public void setNa(double na) {
        this.na = na;
    }
    
}
