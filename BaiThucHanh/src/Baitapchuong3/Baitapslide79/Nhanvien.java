package Baitapchuong3.Baitapslide79;

import Baitapchuong3.kethuaPerson.person;

public class Nhanvien extends person{
    public String chucVu;
    public String maNhanVien;
    public long luong;

    public void nhapThongTin(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma nhan vien: ");
        maNhanVien = sc.nextLine();
        
    }


    public void xuatThongTin(){
        super.xuat();
        System.out.println("Chuc vu: " + chucVu);
        System.out.println("Ma nhan vien: " + maNhanVien);
        System.out.println("Luong: " + luong);
    }
}

