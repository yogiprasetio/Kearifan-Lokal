package Com.prediksicuaca.Controller;

import Com.prediksicuaca.Object.DataSet;
import java.util.ArrayList;
import Com.prediksicuaca.Koneksi.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller {
    
    public static ArrayList<DataSet> arrData;
    Koneksi conn;
    
    public Controller() throws SQLException {
    conn = new Koneksi();
    this.arrData = new ArrayList<>();
    getDataSet();
    }

    public ArrayList<DataSet> getDataSet() throws SQLException{
        this.arrData.clear();
        ResultSet rs = this.conn.GetData("SELECT * FROM ");
        while (rs.next()){
            String hari = rs.getString("hari");
            String tanggal = rs.getString("tanggal");
            String Cuaca = rs.getString("Cuaca");
            String Kondisi_Bulan = rs.getString("KD_BULAN");
            double suhuTertinggi = rs.getDouble("Suhu_tertinggi");
            double suhhuTerendah = rs.getDouble("suhu_Terendah");
            DataSet dts = new DataSet(Kondisi_Bulan, suhuTertinggi, suhhuTerendah, hari, tanggal,Cuaca);
            this.arrData.add(dts);
        }
        return this.arrData;
    }
    
    
    
}
