import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class Customer {
    private String makh;
    private String name;
    private String gender;
    private String date;
    private String address;
    private static int cnt = 1;

    public Customer(String name, String gender, String date, String address) {
        this.name = chuanhoa(name);
        this.gender = gender;
        this.date = chuanHoaNgay(date);
        this.address = address;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMakh() {
        return String.format("KH%03d", cnt++);
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public String chuanhoa(String name) {
        name = name.trim().toLowerCase();
        String[] words = name.split("\\s+");
        String res = "";
        for (String word : words) {
            res += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
        }
        return res;
    }

    private String chuanHoaNgay(String ngay) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = inputFormat.parse(ngay);
            return outputFormat.format(date);
        } catch (ParseException e) {
            return ngay;
        }
    }

    @Override
    public String toString() {
        return getMakh() + " " + name + " " + gender + " " + date + " " + address;
    }

}

public class DanhSachKhachHangTrongFile {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String date = sc.nextLine();
            String address = sc.nextLine();
            Customer customer = new Customer(name, gender, date, address);
            list.add(customer);
        }
        Collections.sort(list, new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
                try {
                    Date date1 = formatter.parse(c1.getDate());
                    Date date2 = formatter.parse(c2.getDate());
                    return date1.compareTo(date2);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return 0;
            }
        });
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setMakh(String.format("KH%03d", i + 1));
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        sc.close();
    }
}
