import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
class LopSinhVien {
     private    String hoTen ;
     private    String lop ;
     private   String ngaySinh ;
     private Float gpa ;

     
    public LopSinhVien(String hoTen, String lop, String ngaySinh , Float gpa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh ;
        this.gpa = gpa;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public Float getGpa() {
        return gpa;
    }
    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }
    public String getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public String forMat() {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatter.parse(ngaySinh);
            return formatter.format(date);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return "";
    }

     

}
public class SinhVien {

   public static void main(String[] args) {
    Scanner ip = new Scanner(System.in) ;
   String  x = ip.nextLine() ;
   String y = ip.next() ;
   String z = ip.next() ;
   Float t = ip.nextFloat() ;
    LopSinhVien sv1 = new LopSinhVien(x, y, z ,t ) ;
    System.out.printf("B20DCCN001 "  + sv1.getHoTen() +" "+ sv1.getLop()+" " + sv1.forMat() +" " +"%.2f\n",sv1.getGpa());
   }
}
