import java.util.Scanner ;


public class BoichungUocChung {
    public static Scanner ip = new Scanner(System.in);
    public static long ucln(long a ,long b){
      while(b!=0){
        long tmp = b ;
        b = a % b  ;
        a = tmp ;
      }
      return a ; 
    }
    public static long bcnn(long a , long b ) {
          return Math.abs(a*b)/ucln(a,b) ;
    }
    public static void  main(String[] args) {
        int t  = ip.nextInt() ;
        while(t-->0){
            long a  = ip.nextLong() ;
            long b = ip.nextLong() ;
            System.out.println(bcnn(a,b) + " " + ucln(a,b));
        }
    }
}
