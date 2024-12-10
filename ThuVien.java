import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ThuVien implements IQuanLySach {
    private String id;
    private String tenThuVien;
    private ArrayList<Sach> dsSach;
    public ThuVien(String id, String tenThuVien) {
        this.id = id;
        this.tenThuVien = tenThuVien;
        dsSach = new ArrayList<>();
    }

    @Override
    public Sach timSach(int id) {
        for (Sach sach : dsSach) {
            if (sach.getId() == id) {
                return sach;
            }
        }
        return null;
    }
    @Override
    public void xoaSach(int id) {
        Sach sach = timSach(id);
        if( sach != null) {
        dsSach.remove(sach);
        System.out.println("Xoa thanh cong");
        }else {System.out.println("ID Sach khong ton tai!");}
    }
    @Override
    public void themSach(Sach newSach) {
        dsSach.add(newSach);
    }
    @Override
    public List<Sach> timSach(String tieuDe) {
        List<Sach> sachs = new ArrayList<>();
        for (Sach sach : dsSach) {
            if (sach.getTieuDe().equalsIgnoreCase(tieuDe)==true || sach.getTacGia().equalsIgnoreCase(tieuDe)==true) {
                sachs.add(sach);
            }
        }
        return sachs;
    }
    @Override
    public void hienThiDanhSach() {
        dsSach.sort(Comparator.comparing(Sach :: getNamXuatBan));
        for (Sach sach : dsSach) {
            System.out.println(sach.toString());    
        }
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTenThuVien() {
        return tenThuVien;
    }
    public void setTenThuVien(String tenThuVien) {
        this.tenThuVien = tenThuVien;
    }
    public ArrayList<Sach> getDSSach(){
        return dsSach;
    }

    @Override
    public String toString() {
        return "ThuVien[Id = "+id+" | Ten = "+tenThuVien+" | Tong So Sach = "+ dsSach.size()+"\nDanh Sach Sach = "+ dsSach+"]";
    }

    
}
