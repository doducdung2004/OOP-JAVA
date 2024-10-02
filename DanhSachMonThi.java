import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner ;

class MonThi implements  Comparable<MonThi> {
    private String maso ;
    private String tenMon ;
    private String hinhThuc ;

    public MonThi(String hinhThuc, String maso, String tenMon) {
        this.hinhThuc = hinhThuc;
        this.maso = maso;
        this.tenMon = tenMon;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getMaso() {
        return maso;
    }

    @Override 
    public String toString(){
        return this.maso + " " + this.tenMon + " " + this.hinhThuc  ;
    }
    @Override
    public int compareTo(MonThi other) {
        return this.maso.compareTo(other.getMaso());
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }
    
}
public class DanhSachMonThi {
   public static void main(String[] args) throws FileNotFoundException {
       
       File file = new File ("MONHOC.in") ;
       try (Scanner sc = new Scanner(file)) {
           int n = Integer.parseInt(sc.nextLine()) ;
           ArrayList<MonThi> list = new ArrayList<>() ;
           
           for(int i = 0 ; i < n ; i++){
               String ms = sc.nextLine() ;
               String tm = sc.nextLine() ;
               String ht = sc.nextLine() ;
               MonThi a1  = new MonThi(ht, ms, tm) ;
               list.add(a1) ;
               
           }
           Collections.sort(list) ;
           
           for (MonThi x : list){
               System.err.println(x);
           }
       } 
   }
}
