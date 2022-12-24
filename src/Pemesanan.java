import java.util.Date;

public class Pemesanan {
    private int id;
    private Penyewa penyewa;
    private Kos kos;
    private Date tanggalPesan;
    private Date tanggalCheckin;
    private Date tanggalCheckout;
    private int jumlahHari;
    private int hargaTotal;

    public Pemesanan() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Penyewa getPenyewa() {
        return penyewa;
    }

    public void setPenyewa(Penyewa penyewa) {
        this.penyewa = penyewa;
    }

    public Kos getKos() {
        return kos;
    }

    public void setKos(Kos kos) {
        this.kos = kos;
    }

    public Date getTanggalPesan() {
        return tanggalPesan;
    }

    public void setTanggalPesan(Date tanggalPesan) {
        this.tanggalPesan = tanggalPesan;
    }

    public Date getTanggalCheckin() {
        return tanggalCheckin;
    }

    public void setTanggalCheckin(Date tanggalCheckin) {
        this.tanggalCheckin = tanggalCheckin;
    }

    public Date getTanggalCheckout() {
        return tanggalCheckout;
    }

    public void setTanggalCheckout(Date tanggalCheckout) {
        this.tanggalCheckout = tanggalCheckout;
    }

    public int getJumlahHari() {
        return jumlahHari;
    }

    public void setJumlahHari(int jumlahHari) {
        this.jumlahHari = jumlahHari;
    }

    public int getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(int hargaTotal) {
        this.hargaTotal = hargaTotal;
    }
}
