package Baitapchuong3.Baitapslide79;

import java.util.Scanner;

public class Nhanvienfulltime extends Nhanvien {
    public long soNgayLamViec;
    public Nhanvienfulltime(){
        chucVu = "Nhan Vien Fulltime ";
        luong = 50000;
    }
    public void nhapSoNgay(){
        super.nhapThongTin();
        Scanner Sc = new Scanner(System.in);
        System.out.println("So ngay lam viec: ");
        soNgayLamViec = sc.nextLong();
    }
    public void tinhLuong(){
        luong = soNgayLamViec*luong;
    }
}
