public class Ghe {
    private String maGhe;
    private char hangGhe;
    private boolean trangThai;
    private double giaCoBan;
    public Ghe(String maGhe, char hangGhe, boolean trangThai, double giaCoBan) {
        this.maGhe = maGhe;
        this.hangGhe = hangGhe;
        this.trangThai = trangThai;
        this.giaCoBan = giaCoBan;
    }
    public String toString() {
        return "Ghe{maGhe='" + maGhe + "', hangGhe=" + hangGhe + "}";
    }
}
