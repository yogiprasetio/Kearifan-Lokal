package Com.prediksicuaca.Controller;

import java.lang.Math;
import Com.prediksicuaca.Controller.Controller;
import java.math.MathContext;

public class Core {
   // Math math = new Math;
    Controller control;
    private static int sbtAwalCerah=0,sbtAkhirCerah=0,PurnamaCerah=0,BaruCerah=0,sbtAwalHujan=0,sbtAkhirHujan=0,PurnamaHujan=0,baruHujan=0,sbtAwalBln=0,sbtAkhirBln=0,PurnamaBln=0,baruBln=0,sbtAwalBlntdk=0,sbtAkhirBlntdk=0,PurnamaBlntdk=0,baruBlntdk=0;
    private static int sbtAwalHujany,sbtAkhirHujany,PurnamaHujany,BaruHujany,sbtAwalHujanx,sbtAkhirHujanx,PurnamaHujanx,baruHujanx,sbtAwalblny,sbtAkhirblny,Purnamablny,barublny,sbtAwalBlntdkx,sbtAkhirBlntdkx,PurnamaBlntdkx,baruBlntdkX;
    private static double Stinggi,Srendah,Stinggiawn,Srendahawn,Stinggicrh,Srendahcrh;
    public static double sumSuhutertinggi[], sumSuhuterendah[],sumSuhuTertinggiCerah[],sumSuhuTerendahCerah[],sumSuhuterendahAwan[],sumSuhutertinggiAwan[];
    private static double avgSuhutertinggi=0,avgSuhuterendah=0,avgsuhuTertinggiCerah=0, avgSuhuterendahCerah=0, avgSuhutertinggiAwan=0,avgSUhuterendahAwan=0;
    private static double avgSuhutertinggin,avgSuhuterendahn,avgsuhuTertinggiCerahn, avgSuhuterendahCerahn, avgSuhutertinggiAwann,avgSUhuterendahAwann;
    private static double xitinggi[],xirendah[],xitinggiHjn[],xirendahhjn[],xitinggicrh[],xirendahcrh[];
    private static double sumxitinggi=0,sumxirendah=0,sumxitinggiHjn=0,sumxirendahhjn=0,sumxitinggicrh=0,sumxirendahcrh=0;
    private static double sumxitinggin,sumxirendahn,sumxitinggiHjnn,sumxirendahhjnn,sumxitinggicrhn,sumxirendahcrhn;
    private static int i,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0;
    public static String Konndisi;
    
    public Core() {
        System.out.println(Controller.arrData.get(k).getSuhuTerendah());
        sum();
        System.out.println("masuk avg");
        avg();
        xi();
        KondisiBln();
        Cuacaa();
    }
    public static void Kondisi(double tempTinggi,double tempRendah,String Bulan){
//        int n = Controller.arrData.size();
        hasilC1RendahAwan(tempRendah);
        System.out.println("C1");
        hasilC1RendahCerah(tempRendah);
        System.out.println("c2");
        hasilC1TinggiAwan(tempTinggi);
        System.out.println("c3");
        hasilC1TinggiCerah(tempTinggi);
        System.out.println(tempTinggi);
        hasilC1Tinggihjn(tempTinggi);
        hasilC1rendahhjn(tempRendah);
        likehood(Bulan);
        execyute();
    }
    
    public static void sum(){
        System.out.println(Controller.arrData.get(9).getCuaca()+"-");
        for(i=0;i<Controller.arrData.size();i++){
            System.out.println("sum 1"+Controller.arrData.size());
            System.out.println(Controller.arrData.get(i).getWaktu().getHari());
            System.out.println(Controller.arrData.get(i).getCuaca());
            if("hujan".equals(Controller.arrData.get(i).getCuaca())){
                System.out.println(Controller.arrData.get(i).getCuaca());
                sumSuhutertinggi= new double[j+1];
                sumSuhuterendah=new double[j+1];
                sumSuhutertinggi[j]= Controller.arrData.get(i).getSuhuTertinggi();
                sumSuhuterendah[j]=Controller.arrData.get(i).getSuhuTerendah();
                j++;
            }
            else if("cerah".equals(Controller.arrData.get(i).getCuaca())){
//                System.out.println(Controller.arrData.get(i).getCuaca());
                sumSuhuTerendahCerah = new double[k+1];
                sumSuhuTertinggiCerah = new double[k+1];
                sumSuhuTerendahCerah[k]= Controller.arrData.get(i).getSuhuTerendah();
                sumSuhuTertinggiCerah[k]= Controller.arrData.get(i).getSuhuTertinggi();
                k++;
            }
            else if ("berawan".equals(Controller.arrData.get(i).getCuaca())){
                sumSuhuterendahAwan = new double[l+1];
                sumSuhutertinggiAwan = new double[l+1];
//                System.out.println(Controller.arrData.get(i).getCuaca());
//                System.out.println(l+" "+i);
                sumSuhuterendahAwan[l] = Controller.arrData.get(i).getSuhuTerendah();
//                System.out.println(sumSuhuterendahAwan[l]);
                sumSuhutertinggiAwan[l]= Controller.arrData.get(i).getSuhuTertinggi();
//                System.out.println(sumSuhutertinggiAwan[i]);
                l++;
            }
        }
    }
    
    public static void avg() {
        System.out.println(sumSuhuterendah.length);
    /**/
//    if(sumSuhutertinggi.length != 0 ){
    for(i=0;i<sumSuhuterendah.length;i++){
         System.out.println(j+" _ "+sumSuhuterendah[i]);
         avgSuhuterendah = avgSuhuterendah+sumSuhuterendah[i];
     }
     avgSuhuterendahn = avgSuhuterendah/sumSuhuterendah.length;
     for(i=0;i<sumSuhutertinggi.length;i++){
         avgSuhutertinggi = avgSuhutertinggi+sumSuhutertinggi[i];
     }
     avgSuhutertinggin = avgSuhutertinggi/sumSuhutertinggi.length;
//    } 
//
/**/
    for(i=0;i<sumSuhuTerendahCerah.length;i++){
         avgSuhuterendahCerah = avgSuhuterendahCerah+sumSuhuTerendahCerah[i];
     }
     avgSuhuterendahCerahn = avgSuhuterendahCerah/sumSuhuTerendahCerah.length;
     for(i=0;i<sumSuhuTertinggiCerah.length;i++){
         avgsuhuTertinggiCerah = avgsuhuTertinggiCerah+sumSuhuTertinggiCerah[i];
     }
     avgsuhuTertinggiCerahn = avgsuhuTertinggiCerah+sumSuhuTertinggiCerah.length;
//
     
     for(i=0;i<sumSuhuterendahAwan.length;i++){
         avgSUhuterendahAwan = avgSUhuterendahAwan+sumSuhuterendahAwan[i];
     }
     avgSUhuterendahAwann = avgSUhuterendahAwan/sumSuhuterendahAwan.length;
     for(i=0;i<sumSuhutertinggiAwan.length;i++){
         avgSuhutertinggiAwan = avgSuhutertinggiAwan+sumSuhutertinggiAwan[i];
     }
     avgSuhutertinggiAwann = avgSuhutertinggiAwan/sumSuhutertinggiAwan.length;
    }
    
    public static void xi(){
        for(i=0;i<sumSuhuterendah.length;i++){
            xirendah = new double[m+1];
            xirendah[m]= Math.pow((sumSuhuterendah[i]-avgSuhuterendahn),2);
        }
        for(i=0;i<xirendah.length;i++){
            sumxirendah=sumxirendah+xirendah[i];
        }
        sumxirendahn=sumxirendah;
        Srendah = Math.sqrt(sumxirendahn/(sumSuhuterendah.length-1));
        for(i=0;i<sumSuhutertinggi.length;i++){
            xitinggi = new double[n+1];
            xitinggi[n]= Math.pow((sumSuhutertinggi[i]-avgSuhutertinggin),2);
        }
        for(i=0;i<xitinggi.length;i++){
            sumxitinggi=sumxitinggi+xitinggi[i];
        }
        sumxitinggin=sumxitinggi;
        Stinggi = Math.sqrt(sumxitinggin/(sumSuhutertinggi.length-1));
        for(i=0;i<sumSuhuTerendahCerah.length;i++){
            xirendahcrh = new double[o+1];
            xirendahcrh[o]= Math.pow((sumSuhuTerendahCerah[i]-avgSuhuterendahCerahn),2);
        }
        for(i=0;i<xirendahcrh.length;i++){
            sumxirendahcrh=sumxirendahcrh+xirendahcrh[i];
        }
        sumxirendahcrhn=sumxirendahcrh;
        Srendahcrh = Math.sqrt(sumxirendahcrhn/(sumSuhuTerendahCerah.length-1));
        for(i=0;i<sumSuhuTertinggiCerah.length;i++){
            xitinggicrh = new double[p+1];
            xitinggicrh[p]= Math.pow((sumSuhuTertinggiCerah[i]-avgsuhuTertinggiCerahn),2);
        }
        for(i=0;i<xitinggicrh.length;i++){
            sumxitinggicrh=sumxitinggicrh+xitinggicrh[i];
        }
        sumxitinggicrhn=sumxitinggicrh;
        Stinggicrh = Math.sqrt(sumxitinggicrhn/(sumSuhuTertinggiCerah.length-1));
        for(i=0;i<sumSuhuterendahAwan.length;i++){
            xirendahhjn = new double[q+1];
            xirendahhjn[q]= Math.pow((sumSuhuterendahAwan[i]-avgSUhuterendahAwann),2);
        }
        for(i=0;i<xirendahhjn.length;i++){
            sumxirendahhjn=sumxirendahhjn+xirendahhjn[i];
        }
        sumxirendahhjnn=sumxirendahhjn;
        Srendahawn = Math.sqrt(sumxirendahhjnn/(sumSuhuterendahAwan.length-1));
       for(i=0;i<sumSuhutertinggiAwan.length;i++){
           xitinggiHjn = new double[r+1]; 
           xitinggiHjn[r]= Math.pow((sumSuhutertinggiAwan[i]-avgSuhutertinggiAwann),2);
        }
       for(i=0;i<xitinggiHjn.length;i++){
            sumxitinggiHjn=sumxitinggiHjn+xitinggiHjn[i];
        }
        sumxitinggiHjnn=sumxitinggiHjn;
        Stinggiawn = Math.sqrt(sumxitinggiHjnn/(sumSuhutertinggiAwan.length-1));
    }
    private static int sbtAwalblnAwan,sbtAwalblnAwann=0,PurnamablnAwan,PurnamablnAwann=0,SbtblnAwan,SbtblnAwann=0,Newbln,Newblnn=0; 
    public static void KondisiBln(){
        for(i=0;i<Controller.arrData.size();i++){
            if("sabit awal".equals(Controller.arrData.get(i).getKondisi_Bulan())){
                sbtAwalblny = sbtAwalBln+1;
                System.out.println(sbtAwalblny);
                if("hujan".equals(Controller.arrData.get(i).getCuaca())){
                    sbtAwalHujany = sbtAwalHujan + 1;
                    
                }
                else if("berawan".equals(Controller.arrData.get(i).getCuaca())){
                    sbtAwalblnAwan = sbtAwalblnAwann+1;
                }
                else{
                    sbtAwalBlntdkx = sbtAwalBlntdk+1;
                }
            }
            else if("purnama".equals(Controller.arrData.get(i).getKondisi_Bulan())){
                
                    Purnamablny = PurnamaBln+1;
                if("hujan".equals(Controller.arrData.get(i).getCuaca())){
                    PurnamaHujany = PurnamaHujan + 1;
                }
                else if("berawan".equals(Controller.arrData.get(i).getCuaca())){
                    PurnamablnAwan = PurnamablnAwann+1;
                }
                else{
                    PurnamaHujanx = PurnamaBlntdk+1;
                    
                }
            }
            else if("sabit akhir".equals(Controller.arrData.get(i).getKondisi_Bulan())){
                
                    sbtAkhirblny = sbtAkhirBln+1;
                if("hujan".equals(Controller.arrData.get(i).getCuaca())){
                    sbtAkhirHujany = sbtAkhirHujan+1;
                }
                else if("berawan".equals(Controller.arrData.get(i).getCuaca())){
                    SbtblnAwan = SbtblnAwann+1;
                }
                else{
                    sbtAkhirHujanx = sbtAkhirCerah +1;
                }
            }
            else{
                barublny = baruBln+1;
                if("hujan".equals(Controller.arrData.get(i).getCuaca())){
                    BaruHujany = baruHujan+1;
                }
                else if("berawan".equals(Controller.arrData.get(i).getCuaca())){
                    Newbln = Newblnn+1;
                }
                else{
                    baruHujanx =BaruCerah +1;
                }
            }
        }
    }
    
    private static int kondisiFinalhjn,kondisi = 0,kondisiFinalcerah,kondisicrh = 0,kondisiFinalBerawan,kondisiAwan = 0;
    private static double sikon, sikonX,sikonY;
    public static void Cuacaa(){
        for(i=0;i<Controller.arrData.size();i++){
            if("hujan".equals(Controller.arrData.get(i).getCuaca())){
                kondisiFinalhjn = kondisi + 1; 
            }
            else if("Berawan".equals(Controller.arrData.get(i).getCuaca())){
                kondisiFinalBerawan = kondisiAwan +1;
            }
            else {
                kondisiFinalcerah = kondisicrh + 1;
            }
            
        }
        sikon = kondisiFinalhjn/Controller.arrData.size();
        sikonX = kondisiFinalcerah/Controller.arrData.size();
        sikonY = kondisiFinalBerawan/Controller.arrData.size();
    }
    public static double hasil,hasil2,hasil3,hasil4,hasil5,hasil6,hasil7,hasil8,hasil9,hasil10;
    public static void hasilC1Tinggihjn(double tempTinggi){
        double temp1,temp2,temp3,temp4,temp5,temp6,temp7,temp8;
        temp2 = Math.pow(-( tempTinggi- avgSuhutertinggin),2);
        temp1= Math.pow((2*Stinggi), 2);
        temp3 = Math.pow(2.7183, (temp2/temp1));
        temp4 = 1/(Math.sqrt((2*3.14*Stinggi)));
        hasil = temp4*temp3;
    }
    public static void hasilC1rendahhjn(double tempRendah){
        double temp1,temp2,temp3,temp4,temp5,temp6,temp7,temp8;
        temp2 = Math.pow(-( tempRendah- avgSuhuterendahn),2);
        temp1= Math.pow((2*Srendah), 2);
        temp3 = Math.pow(2.7183, (temp2/temp1));
        temp4 = 1/(Math.sqrt((2*3.14*Srendah)));
        hasil2 = temp4*temp3;
    }
    
    public static void hasilC1TinggiCerah(double tempTinggi){
        double temp1,temp2,temp3,temp4,temp5,temp6,temp7,temp8;
        temp2 = Math.pow(-( tempTinggi- avgsuhuTertinggiCerahn),2);
        temp1= Math.pow((2*Stinggicrh), 2);
        temp3 = Math.pow(2.7183, (temp2/temp1));
        temp4 = 1/(Math.sqrt((2*3.14*Stinggicrh)));
        hasil3 = temp4*temp3;
    }
    
    public static void hasilC1RendahCerah(double tempRendah){
        double temp1,temp2,temp3,temp4,temp5,temp6,temp7,temp8;
        temp2 = Math.pow(-( tempRendah - avgSuhuterendahCerahn),2);
        temp1= Math.pow((2*Srendahcrh), 2);
        temp3 = Math.pow(2.7183, (temp2/temp1));
        temp4 = 1/(Math.sqrt((2*3.14*Srendahcrh)));
        hasil4 = temp4*temp3;
    }
    
    public static void hasilC1TinggiAwan(double tempTinggi){
        double temp1,temp2,temp3,temp4,temp5,temp6,temp7,temp8;
        temp2 = Math.pow(-( tempTinggi - avgSuhutertinggiAwann),2);
        temp1= Math.pow((2*Stinggiawn), 2);
        temp3 = Math.pow(2.7183, (temp2/temp1));
        temp4 = 1/(Math.sqrt((2*3.14*Stinggiawn)));
        hasil5 = temp4*temp3;
    }
    
    public static void hasilC1RendahAwan(double tempRendah){
        double temp1,temp2,temp3,temp4,temp5,temp6,temp7,temp8;
        temp2 = Math.pow(-( tempRendah - avgSUhuterendahAwann),2);
        temp1= Math.pow((2*Srendahawn), 2);
        temp3 = Math.pow(2.7183, (temp2/temp1));
        temp4 = 1/(Math.sqrt((2*3.14*Srendahawn)));
        hasil6 = temp4*temp3;
    }
    
//    public static void hasilC1sbtAwalhjn(){
//        double temp1,temp2,temp3,temp4,temp5,temp6,temp7,temp8;
//        temp2 = Math.pow(-( tempRendah - avgSUhuterendahAwann),2);
//        temp1= Math.pow((2*Srendahawn), 2);
//        temp3 = Math.pow(2.7183, (temp2/temp1));
//        temp4 = 1/(Math.sqrt((2*3.14*Srendahawn)));
//        hasil6 = temp4*temp3;
//    }
    
    public static double Hujan,Cerah,Awan;
    public static void likehood(String Bulan){
        System.out.println(Bulan);
        if("sabit awal".equals(Bulan)){
            System.out.println(sbtAwalHujany +" - "+sbtAwalblny+"|"+hasil+"|"+hasil2+"|"+hasil3+"|"+hasil4+"|"+hasil5+"|"+hasil6);
            Hujan = hasil*hasil2*(sbtAwalHujany/sbtAwalblny)*sikon;
            Cerah = hasil3*hasil4*(sbtAwalBlntdkx/sbtAwalblny)*sikonX;
            Awan = hasil5*hasil6*(sbtAwalblnAwan/sbtAwalblny)*sikonY;
            System.out.println(Awan+"|"+Cerah+"|"+Hujan);
        }
        else if("purnama".equals(Bulan)){
            Hujan = hasil*hasil2*(PurnamaHujany/Purnamablny)*sikon;
            Cerah = hasil3*hasil4*(PurnamaHujanx/Purnamablny)*sikonX;
            Awan = hasil5*hasil6*(PurnamablnAwan/Purnamablny)*sikonY;
            System.out.println(Awan+"|"+Cerah+"|"+Hujan);
        }
        else if("sabit akhir".equals(Bulan)){
            Hujan = hasil*hasil2*(sbtAkhirHujany/sbtAkhirblny)*sikon;
            Cerah = hasil3*hasil4*(sbtAkhirHujanx/sbtAkhirblny)*sikonX;
            Awan = hasil5*hasil6*(SbtblnAwan/sbtAkhirblny)*sikonY;
            System.out.println(Awan+"|"+Cerah+"|"+Hujan);
        }
        else if("baru".equals(Bulan)){
             Hujan = hasil*hasil2*(BaruHujany/barublny)*sikon;
            Cerah = hasil3*hasil4*(baruHujanx/barublny)*sikonX;
            Awan = hasil5*hasil6*(Newbln/barublny)*sikonY;
            System.out.println(Awan+"|"+Cerah+"|"+Hujan);
        }
        
    }
    
     private static void execyute() {
        if(Hujan>Cerah && Hujan>Awan){
            System.out.println("Hujan : "+Hujan);
            Konndisi = "hujan";
        }
        else if(Cerah>Hujan && Cerah>Awan){
            System.out.println("Cerah : "+Cerah);
            Konndisi = "cerah";
        }
        else if(Awan>Hujan && Awan>Cerah){
            System.out.println("Awan : "+Awan);
            Konndisi = "berawan";
        }
    }
}
