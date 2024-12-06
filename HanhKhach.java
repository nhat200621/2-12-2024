import java.util.ArrayList;
public class HanhKhach implements IHanhKhach {
    private String id;
    private String ten;
    private int namSinh;
    private String soHoChieu;
    private String idHangBay;
    private String maTheThanhVien;
    private double soDiemBayTichLuy;
    private char hangTheThanhVien;
    private ArrayList<Ticket> danhSachVe;
    private String diaChi;
    public HanhKhach(String id, String ten, int namSinh, String soHoChieu, String idHangBay,
                     String maTheThanhVien, char hangTheThanhVien, String diaChi) {
        this.id = id;
        this.ten = ten;
        this.namSinh = namSinh;
        this.soHoChieu = soHoChieu;
        this.idHangBay = idHangBay;
        this.maTheThanhVien = maTheThanhVien;
        this.hangTheThanhVien = hangTheThanhVien;
        this.diaChi = diaChi;
        this.danhSachVe = new ArrayList<>();
        this.soDiemBayTichLuy = 0;
    }
    public void datVe(String maChuyenBay, char hangGhe) {
        if (danhSachVe.size() >= 5) {
            System.out.println("Không thể đặt quá 5 vé cùng lúc.");
            return;
        }
        System.out.println("Đặt vé thành công cho chuyến bay: " + maChuyenBay);
    }
    public void huyVe(String maVe) {
        System.out.println("Hủy vé: " + maVe);
    }
    public void doiVe(String maVeCu, String maChuyenBayMoi) {
        System.out.println("Đổi vé thành công từ " + maVeCu + " sang " + maChuyenBayMoi);
    }
    public boolean kiemTraTrangThaiVe(String maVe) {
        return danhSachVe.stream().anyMatch(v -> v.getMaVe().equals(maVe));
    }
    public void tichLuyDiemBay(double khoangCach, char hangGhe) {
        double heSo = switch (hangGhe) {
            case 'Y' -> 1.0;
            case 'B' -> 1.5;
            case 'F' -> 2.0;
            default -> 0.0;
        };
        this.soDiemBayTichLuy += khoangCach * heSo;
        capNhatHangThe();
    }
    private void capNhatHangThe() {
        if (soDiemBayTichLuy < 10000) {
            hangTheThanhVien = 'B';
        } else if (soDiemBayTichLuy < 50000) {
            hangTheThanhVien = 'S';
        } else {
            hangTheThanhVien = 'G';
        }
    }
    public String toString() {
        return "HanhKhach{id='" + id + "', ten='" + ten + "', namSinh=" + namSinh +
                ", hangTheThanhVien=" + hangTheThanhVien + "}";
    }
}

