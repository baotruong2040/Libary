public class Sach {
    private int id;
    private String tieuDe;
    private String tacGia, theLoai;
    private int namXuatBan;
    private boolean trangThai; //true = SS / false = Dang Muon
    public Sach(int id, String tieuDe, String tacGia, String theLoai, int namXuatBan, boolean trangThai) {
        this.id = id;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.namXuatBan = namXuatBan;
        this.trangThai = trangThai;
    }
    public Sach() {

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTieuDe() {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }
    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public String getTheLoai() {
        return theLoai;
    }
    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
    public int getNamXuatBan() {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }
    public boolean isTrangThai() {
        return trangThai;
    }
    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    @Override
    public String toString() {
        return "[id=" + id + ", tieuDe=" + tieuDe + ", tacGia=" + tacGia + ", theLoai=" + theLoai + ", namXuatBan="+ namXuatBan + ", trangThai=" + trangThai + "]";
    }

    
}
