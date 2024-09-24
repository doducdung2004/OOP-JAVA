import java.util.Scanner;

class SanPham {
  static  int cnt = 1 ;
  private String ma  , ten , nhaSX  ;
  private  int soLuong  ;
  private double gia ;
 public SanPham (String ten1, int soLuong1, double gia1, String nhaSX1) {

 }
  public void SanPham(String ten , int soLuong , double gia , String nhaSX) {
    this.ma = ma  ;
    this.ten = ten ;
    this.nhaSX = nhaSX ;
    this.soLuong = soLuong ;
    this.gia = gia ;
}
  public  void setMa() {
      this.ma = ma ;
  }
  public String getMa(){
      this.ma = nhaSX.toUpperCase() + "-" + String.format("%03d", cnt ) ;
      cnt +=1 ;
  }
   public void setTen() {
      this.ten = ten ;
  }
  public String getTen(){
      return this.ten ;
  }
   public  void setnNhasx() {
      this.nhaSX = nhaSX ;
  }
  public String  getNhasx(){
      return this.nhaSX ;
  }
   public void setSl() {
      this.soLuong = soLuong ;
  }
  public int getSl(){
      return this.soLuong ;
  }
   public void setGia() {
      this.gia = gia ;
  }
  public  double getGia(){
      return this.gia ;
  }
   public String getThanhTien() {
         float s1 = (float) soLuong ;
         double sum = 0 ;
         if(s1 < 20){
          sum = s1*gia ;
         }
         else {
          gia  = gia*0.9 ;
          sum = s1*gia ;
         }
         String ab = String.format("%.01f", sum) ;
    } 
  @Override
    public String toString() {
      return getMa() + " " + this.ten + " " + this.soLuong +" "+ getGia() + " " + getThanhTien() ;
    }
     
   
} 
public class Product {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String ten;
        String nhaSX;
        int soLuong;
        double gia;
        while(n-->0){
            ten=sc.nextLine();
            nhaSX=sc.nextLine();
            soLuong=Integer.parseInt(sc.nextLine());
            gia=Double.parseDouble(sc.nextLine());
            SanPham p=new SanPham(ten, soLuong, gia, nhaSX);
            System.out.println(p);
        }
    }
}