import java.util.ArrayList;
public class HangBay {
    private String id;
    private String tenHangBay;
    private ArrayList<ChuyenBay> danhSachChuyenBay;
    public HangBay(String id, String tenHangBay) {
        this.id = id;
        this.tenHangBay = tenHangBay;
        this.danhSachChuyenBay = new ArrayList<>();
    }
    public void themChuyenBay(ChuyenBay cb) {
        danhSachChuyenBay.add(cb);
        System.out.println("Thêm chuyến bay thành công: " + cb);
    }
    public String toString() {
        return "HangBay{id='" + id + "', tenHangBay='" + tenHangBay + "'}";
    }
}

