public class ChuyenBay {
    private String maChuyenBay;
    private String sanBayDi;
    private String sanBayDen;
    private String ngayBay;
    private String gioBay;
    private double khoangCach;
    public ChuyenBay(String maChuyenBay, String sanBayDi, String sanBayDen, String ngayBay, String gioBay, double khoangCach) {
        this.maChuyenBay = maChuyenBay;
        this.sanBayDi = sanBayDi;
        this.sanBayDen = sanBayDen;
        this.ngayBay = ngayBay;
        this.gioBay = gioBay;
        this.khoangCach = khoangCach;
    }
    public String toString() {
        return "ChuyenBay{maChuyenBay='" + maChuyenBay + "', sanBayDi='" + sanBayDi + "', sanBayDen='" + sanBayDen + "'}";
    }
}
