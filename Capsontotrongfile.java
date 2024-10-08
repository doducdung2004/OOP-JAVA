
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Capsontotrongfile {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n >= 2;
    }

public static void main(String[] args) throws FileNotFoundException , ClassNotFoundException , IOException {
    ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
    List<Integer> a1 = (ArrayList<Integer>) ois1.readObject() ;
    Set<Integer> s1 = new TreeSet<>() ;


    for (int i : a1){
        if(isPrime(i)){
            s1.add(i) ;
        }
    }
    ois1.close();
    ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
    List<Integer> a2 = (ArrayList<Integer>) ois2.readObject() ;
    Set<Integer> s2 = new TreeSet<>() ;
    for(int i : a2){
        if(isPrime(i)) {
            s2.add(i) ;
        }
    }
    ois2.close();
    final int SUM = 1000000;
    for (Integer i : s1) {
        if (i * 2 >= SUM) {
            break;
        }
        if (s2.contains(SUM - i)) {
            System.out.println(i + " " + (SUM - i));
        }
    }








}
}
