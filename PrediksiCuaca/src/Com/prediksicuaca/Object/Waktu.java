package Com.prediksicuaca.Object;

public class Waktu {
    private String Hari,Tanggal;

    public Waktu(String Hari, String Tanggal) {
        setHari(Hari);
        setTanggal(Tanggal);
    }

    public String getTanggal() {
        return Tanggal;
    }
 
    public String getHari() {
        return Hari;
    }

    public void setHari(String Hari) {
        this.Hari = Hari;
    }

    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }
}
