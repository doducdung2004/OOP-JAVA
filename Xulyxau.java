
import java.util.HashMap;
import java.util.Scanner;
import javax.sound.sampled.Line;

class MyFunction {
    private  String st ;

    public MyFunction() {
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }
    public int f1(String st) {
        int dem = 0 ;
        for(int i = 0 ; i <st.length() ; i++){
            if(st.charAt(i) < 'a' || st.charAt(i)  >'z' || st.charAt(i) < 'A'|| st.charAt(i) > 'Z') {
                    dem  += 1 ;
            }
        }
        System.out.println("dem");
    }
    public  void f2(String st) {
           String[] list = Line.trim().split("\\s+") ;
           int cnt = 0 ;
          HashMap<String,Integer> map  = new HashMap<>();
          for(int i =0 ; i < list.length ; i++){
             map.put(list[i] , cnt+1) ;
          }
          for (int i = 0; i < map.size(); i++) {
              System.err.println(map.containsValue(i)  + ":" +  map.containsKey(list[i]));
          }
    }
}
public class Xulyxau {
    public  static Scanner in = new Scanner(System.in) ;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String st=in.nextLine();
        MyFunction me = new MyFunction();
        System.out.println(me.f1(st));
        st=in.nextLine();
        me.f2(st);
    }
}
