public class Kos implements ManajemenKos {
    private int id;
    private String nama;
    private String alamat;
    private int jumlahKamar;
    private int hargaSewa;
    private String fasilitas;
    public Kos() {
        // this.id = id;
        // this.nama = nama;
        // this.alamat = alamat;
        // this.jumlahKamar = jumlahKamar;
        // this.hargaSewa = hargaSewa;
        // this.fasilitas = fasilitas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getJumlahKamar() {
        return jumlahKamar;
    }

    public void setJumlahKamar(int jumlahKamar) {
        this.jumlahKamar = jumlahKamar;
    }

    public int getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }
    @Override
public void tambahPenyewa() {
}

@Override
public void tambahKos() {
}

@Override
public void lihatInformasi() {
}
}
