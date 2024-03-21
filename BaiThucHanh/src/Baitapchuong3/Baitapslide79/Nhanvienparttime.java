package Baitapchuong3.Baitapslide79;

public class Nhanvienparttime extends Nhanvien {
    public long soGioCong;
    public Nhanvienparttime(){
        chucVu = "Nhan vien parttime";
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

