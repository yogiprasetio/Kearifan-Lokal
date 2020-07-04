package Com.prediksicuaca.Controller;

import Com.prediksicuaca.Object.DataSet;
import java.util.ArrayList;
import Com.prediksicuaca.Koneksi.Koneksi;
import Com.prediksicuaca.View.MainView;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller {
    Koneksi conn;
    public static ArrayList<DataSet> arrData;
    Core core;
    
    public Controller() throws SQLException {
    conn = new Koneksi();
    this.arrData = new ArrayList<>();
        System.out.println("Mau GetDTAsET");
    this.getDataSet();
        System.out.println("Sudah GetdData");
    core = new Core();
    new MainView().show();
    }

    public ArrayList<DataSet> getDataSet() throws SQLException{
        System.out.println("GetDataSet");
        this.arrData.clear();
        ResultSet rs = this.conn.GetData("SELECT * FROM data_cuaca ");
        while (rs.next()){
            String hari = rs.getString("hari");
            String tanggal = rs.getString("tanggal");
            String Cuaca = rs.getString("Cuaca");
            String Kondisi_Bulan = rs.getString("Kondisi_Bulan");
            System.out.println(Kondisi_Bulan);
            double suhuTertinggi = rs.getDouble("suhuTertinggi");
            System.out.println(suhuTertinggi);
            double suhhuTerendah = rs.getDouble("suhhuTerendah");
            DataSet dts = new DataSet(Kondisi_Bulan, suhuTertinggi, suhhuTerendah, hari, tanggal,Cuaca);
            this.arrData.add(dts);
        }
        return this.arrData;
    }
    
    
    
}
