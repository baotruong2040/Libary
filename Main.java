import java.util.Scanner;
public class Main {
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThuVien vku = new ThuVien("DN001", "Thu Vien VKU");
        Sach sach;
        boolean loop = true;
        while (loop) {
            System.out.println("=================VKU===============");
            System.out.println("1. THEM SACH");
            System.out.println("2. XOA SACH");
            System.out.println("3. TIM SACH");
            System.out.println("4. HIEN THI SACH TRONG THU VIEN");
            System.out.println("5. OUT");
            System.out.print("CHOOSE YOUR AGENT: ");
            int n = scanner.nextInt();
            
            //switch
            switch (n) {
                case 1:
                clearScreen();
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tieu De:");
                    String tieude = scanner.nextLine();
                    System.out.print("Tac Gia: ");
                    String tacgia = scanner.nextLine();
                    System.out.print("The loai: ");
                    String theloai = scanner.nextLine();
                    System.out.print("Nam san xuat: ");
                    int nam = scanner.nextInt();

                    sach = new Sach(id, tieude, tacgia, theloai, nam, true);
                    vku.themSach(sach);
                    System.out.println("THEM SACH THANH CONG");
                    break;
                case 2:
                clearScreen();
                    System.out.print("Nhap ID sach muon xoa: ");
                    id = scanner.nextInt();
                    vku.xoaSach(id);
                    break;
                case 3:
                    clearScreen();
                    scanner.nextLine();
                    System.out.print("Nhap TIEU DE hoac TEN TAC GIA: ");
                    tieude = scanner.nextLine();
                    if(vku.timSach(tieude).isEmpty()!= true) {
                        for (Sach book : vku.timSach(tieude)) {
                            System.out.println(book.toString());
                        }
                    }else {System.out.println("Khong tim thay sach");}

                    
                    break;
                case 4:
                clearScreen();
                    vku.hienThiDanhSach();
                    break;
                default:
                    loop = false;
                    break;
            }
            scanner.nextLine();
        }
        
    }
}
