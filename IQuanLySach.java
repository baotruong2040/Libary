import java.util.List;

public interface IQuanLySach {
    public void xoaSach(int id);
    public void themSach(Sach newSach);
    public List<Sach> timSach(String tieuDe);
    public Sach timSach(int id);
    public void hienThiDanhSach();

}