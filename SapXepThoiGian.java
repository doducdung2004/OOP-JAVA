import java.util.Scanner ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class isTime {
    private int gio , phut , giay ;

    public isTime(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    public int getPhut() {
        return phut;
    }

    public void setPhut(int phut) {
        this.phut = phut;
    }

    public int getGiay() {
        return giay;
    }

    public void setGiay(int giay) {
        this.giay = giay;
    }
    public boolean isReturn()
    
}


public class SapXepThoiGian {
  Scanner ip = new Scanner(System.in) ;
  int t  = ip.nextInt() ;
  List<isTime> list = new ArrayList<>(t) ;
   for (int i = 1 ; i<= t ;i++){
    int x  = ip.nextInt() ;
    int y = ip.nextInt() ;
    int z = ip.nextInt() ;
    if(x<=100 && y <=59 && z<=59){
        isTime time1 = new isTime(x,y,z) ;
        list.add(i, time1);
    }
   }
   Collections.sort(list) ;
   for (isTime i : list){
    System.out.println(i);
   }

  
}
