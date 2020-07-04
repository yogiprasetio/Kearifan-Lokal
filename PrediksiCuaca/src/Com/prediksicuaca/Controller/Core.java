package Com.prediksicuaca.Controller;

import java.lang.Math;
import Com.prediksicuaca.Controller.Controller;
import java.math.MathContext;

public class Core {
   // Math math = new Math;
    Controller control;
    private static double Stinggi,Srendah,Stinggiawn,Srendahawn,Stinggicrh,Srendahcrh;
    private static double sumSuhutertinggi[], sumSuhuterendah[],sumSuhuTertinggiCerah[],sumSuhuTerendahCerah[],sumSuhuterendahAwan[],sumSuhutertinggiAwan[];
    private static double avgSuhutertinggi=0,avgSuhuterendah=0,avgsuhuTertinggiCerah=0, avgSuhuterendahCerah=0, avgSuhutertinggiAwan=0,avgSUhuterendahAwan=0;
    private static double avgSuhutertinggin,avgSuhuterendahn,avgsuhuTertinggiCerahn, avgSuhuterendahCerahn, avgSuhutertinggiAwann,avgSUhuterendahAwann;
    private static double xitinggi[],xirendah[],xitinggiHjn[],xirendahhjn[],xitinggicrh[],xirendahcrh[];
    private static double sumxitinggi=0,sumxirendah=0,sumxitinggiHjn=0,sumxirendahhjn=0,sumxitinggicrh=0,sumxirendahcrh=0;
    private static double sumxitinggin,sumxirendahn,sumxitinggiHjnn,sumxirendahhjnn,sumxitinggicrhn,sumxirendahcrhn;
    private static int i,j=0,k=0,l=0,m=0,n=0,o=0;
    public Core() {
    
    }
    
    public static void StdDeviasiC1(){
        int n = Controller.arrData.size();
        
        
    }
    
    public static void sum(){
        for(i=0;i<Controller.arrData.size();i++){
            if("hujan".equals(Controller.arrData.get(i).getCuaca())){
                sumSuhutertinggi[j]= Controller.arrData.get(i).getSuhuTertinggi();
                sumSuhuterendah[j]=Controller.arrData.get(i).getSuhuTerendah();
                j++;
            }
            else if("cerah".equals(Controller.arrData.get(i).getCuaca())){
                sumSuhuTerendahCerah[k]= Controller.arrData.get(i).getSuhuTerendah();
                sumSuhuTertinggiCerah[k]= Controller.arrData.get(i).getSuhuTertinggi();
                k++;
            }
            else/*point keraguan*/{
                sumSuhuterendahAwan[l] = Controller.arrData.get(i).getSuhuTerendah();
                sumSuhutertinggiAwan[l]= Controller.arrData.get(i).getSuhuTertinggi();
                l++;
            }
        }
    }
    public static void avg() {
     for(i=0;i<sumSuhuterendah.length;i++){
         avgSuhuterendah = avgSuhuterendah+sumSuhuterendah[i];
     }
     avgSuhuterendahn = avgSuhuterendah/sumSuhuterendah.length;
     for(i=0;i<sumSuhutertinggi.length;i++){
         avgSuhutertinggi = avgSuhutertinggi+sumSuhutertinggi[i];
     }
     avgSuhutertinggin = avgSuhutertinggi/sumSuhutertinggi.length;
     for(i=0;i<sumSuhuTerendahCerah.length;i++){
         avgSuhuterendahCerah = avgSuhuterendahCerah+sumSuhuTerendahCerah[i];
     }
     avgSuhuterendahCerahn = avgSuhuterendahCerah/sumSuhuTerendahCerah.length;
     for(i=0;i<sumSuhuTertinggiCerah.length;i++){
         avgsuhuTertinggiCerah = avgsuhuTertinggiCerah+sumSuhuTertinggiCerah[i];
     }
     avgsuhuTertinggiCerahn = avgsuhuTertinggiCerah+sumSuhuTertinggiCerah.length;
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
            xirendah[m]= Math.pow((sumSuhuterendah[i]-avgSuhuterendahn),2);
        }
        for(i=0;i<xirendah.length;i++){
            sumxirendah=sumxirendah+xirendah[i];
        }
        sumxirendahn=sumxirendah;
        Srendah = Math.sqrt(sumxirendahn/(sumSuhuterendah.length-1));
        for(i=0;i<sumSuhutertinggi.length;i++){
            xitinggi[n]= Math.pow((sumSuhutertinggi[i]-avgSuhutertinggin),2);
        }
        for(i=0;i<xitinggi.length;i++){
            sumxitinggi=sumxitinggi+xitinggi[i];
        }
        sumxitinggin=sumxitinggi;
        Stinggi = Math.sqrt(sumxitinggin/(sumSuhutertinggi.length-1));
        for(i=0;i<sumSuhuTerendahCerah.length;i++){
            xirendahcrh[o]= Math.pow((sumSuhuTerendahCerah[i]-avgSuhuterendahCerahn),2);
        }
        for(i=0;i<xirendahcrh.length;i++){
            sumxirendahcrh=sumxirendahcrh+xirendahcrh[i];
        }
        sumxirendahcrhn=sumxirendahcrh;
        Srendahcrh = Math.sqrt(sumxirendahcrhn/(sumSuhuTerendahCerah.length-1));
        for(i=0;i<sumSuhuTertinggiCerah.length;i++){
            xitinggicrh[j]= Math.pow((sumSuhuTertinggiCerah[i]-avgsuhuTertinggiCerahn),2);
        }
        for(i=0;i<xitinggicrh.length;i++){
            sumxitinggicrh=sumxitinggicrh+xitinggicrh[i];
        }
        sumxitinggicrhn=sumxitinggicrh;
        Stinggicrh = Math.sqrt(sumxitinggicrhn/(sumSuhuTertinggiCerah.length-1));
        for(i=0;i<sumSuhuterendahAwan.length;i++){
            xirendahhjn[k]= Math.pow((sumSuhuterendahAwan[i]-avgSUhuterendahAwann),2);
        }
        for(i=0;i<xirendahhjn.length;i++){
            sumxirendahhjn=sumxirendahhjn+xirendahhjn[i];
        }
        sumxirendahhjnn=sumxirendahhjn;
        Srendahawn = Math.sqrt(sumxirendahhjnn/(sumSuhuterendahAwan.length-1));
       for(i=0;i<sumSuhutertinggiAwan.length;i++){
            xitinggiHjn[l]= Math.pow((sumSuhutertinggiAwan[i]-avgSuhutertinggiAwann),2);
        }
       for(i=0;i<xitinggiHjn.length;i++){
            sumxitinggiHjn=sumxitinggiHjn+xitinggiHjn[i];
        }
        sumxitinggiHjnn=sumxitinggiHjn;
        Stinggiawn = Math.sqrt(sumxitinggiHjnn/(sumSuhutertinggiAwan.length-1));
    }
}
