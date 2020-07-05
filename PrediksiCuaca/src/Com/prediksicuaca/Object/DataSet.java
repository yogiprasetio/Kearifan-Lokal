package Com.prediksicuaca.Object;

import Com.prediksicuaca.Object.Waktu;

public class DataSet {
    private static String Kondisi_Bulan,Cuaca;
    private static double SuhuTertinggi,SuhuTerendah;
    Waktu waktu;
    public DataSet(String Kondisi_Bulan,double SuhuTertinggi,double SuhuTerendah,String hari,String tanggal,String Cuaca) {
        setKondisi_Bulan(Kondisi_Bulan);
        setSuhuTerendah(SuhuTerendah);
        setSuhuTertinggi(SuhuTertinggi);
        setCuaca(Cuaca);
        waktu = new Waktu(hari, tanggal);
    }

    public String getCuaca() {
        return Cuaca;
    }

    public String getKondisi_Bulan() {
        return Kondisi_Bulan;
    }

    public double getSuhuTerendah() {
        return SuhuTerendah;
    }

    public double getSuhuTertinggi() {
        return SuhuTertinggi;
    }

    public Waktu getWaktu() {
        return waktu;
    }

    private void setCuaca(String Cuaca) {
        this.Cuaca = Cuaca;
    }

    private void setKondisi_Bulan(String Kondisi_Bulan) {
        this.Kondisi_Bulan = Kondisi_Bulan;
    }

    private void setSuhuTerendah(double SuhuTerendah) {
        this.SuhuTerendah = SuhuTerendah;
    }

    private void setSuhuTertinggi(double SuhuTertinggi) {
        this.SuhuTertinggi = SuhuTertinggi;
    }

    private void setWaktu(Waktu waktu) {
        this.waktu = waktu;
    }
}
