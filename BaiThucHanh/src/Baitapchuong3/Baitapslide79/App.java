public class App {

    public static void main(String[] args) {
        Nhanvienfulltime sep = new Nhanvienfulltime("NguyenXuanHuy");
        sep.setLoaiChucVu(configs.sep);
        Nhanvienfulltime linh = new Nhanvienfulltime("TranHuyHoang",20);
        linh.setLoaiChucVu(configs.linh);
        Nhanvienparttime pt = new Nhanvienparttime("Vu Viet Cuong", 120);
        pt.tinhluong();
        sep.tinhluong();
        linh.tinhluong();
        pt.Xuat();
        sep.Xuat();
        linh.Xuat();
    }
}