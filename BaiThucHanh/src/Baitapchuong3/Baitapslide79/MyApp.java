
public package Baitapchuong3.Baitapslide79;

public class MyApp {
    public static void main(String[] args) {
    public long soGioCong;
    public Part(){
        chucVu = "Nhan vien parttime ";
        luong = 30000;
    }
    public void nhapCong(){
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("So gio lam viec: ");
        soGioCong = sc.nextLong();
    }
    public void tinhLuong(){
        luong = luong*soGioCong;
    }
  }
}