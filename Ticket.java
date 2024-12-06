public class Ticket {
    private String maVe;
    private String maChuyenBay;
    private String maGhe;
    private char hangGhe;
    private double giaVe;
    private char trangThaiVe;
    private HanhKhach hanhKhach;
    public Ticket(String maVe, String maChuyenBay, String maGhe, char hangGhe, double giaVe, char trangThaiVe, HanhKhach hanhKhach) {
        this.maVe = maVe;
        this.maChuyenBay = maChuyenBay;
        this.maGhe = maGhe;
        this.hangGhe = hangGhe;
        this.giaVe = giaVe;
        this.trangThaiVe = trangThaiVe;
        this.hanhKhach = hanhKhach;
    }
    public String getMaVe() {
        return maVe;
    }
    public String toString() {
        return "Ticket{maVe='" + maVe + "', maChuyenBay='" + maChuyenBay + "', hangGhe=" + hangGhe + "}";
    }
}
