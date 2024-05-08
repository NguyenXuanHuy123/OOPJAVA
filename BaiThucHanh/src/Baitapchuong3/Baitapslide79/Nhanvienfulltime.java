public class Nhanvienfulltime extends Nhanvien {
    public int ngaylamthem;
    public int loaichucvu;
    public Nhanvienfulltime(String ten){
       this.ten = ten;
    }
    public Nhanvienfulltime(String ten, int ngaylamthem){
        this.ten = ten;
        this.ngaylamthem = ngaylamthem;
    }
    public void setLoaiChucVu(int loaichucvu){
        this.loaichucvu = loaichucvu;
    }
    @Override
    public String Loai_nhan_vien(){
        return "Nhan vien FullTime";
    }
    public void tinhluong(){
       if (loaichucvu == configs.sep){
        Luong = configs.Luong_sep + ngaylamthem * configs.luong_lam_them_moi_ngay;
       }else if (loaichucvu == configs.Luong_linh){
        Luong = configs.Luong_linh + ngaylamthem * configs.luong_lam_them_moi_ngay;
       }
}
}
