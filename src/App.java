import java.util.Date;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("MANAJEMEN KOS - KOSAN GARUDA MERAH ");
        // Buat objek kelas Kos
        Kos kos = new Kos();
        // Kos kos = new Kos();
        kos.setId(1);
        kos.setNama("Kos ABC");
        kos.setAlamat("Jalan ABC No. 123");
        kos.setJumlahKamar(10);
        kos.setHargaSewa(100000);
        kos.setFasilitas("Kamar mandi dalam, dapur bersama, TV");

        // Buat objek kelas Kos yang baru
        Kos kos2 = new Kos();
        kos2.setId(2);
        kos2.setNama("Kos DEF");
        kos2.setAlamat("Jalan DEF No. 789");
        kos2.setJumlahKamar(12);
        kos2.setHargaSewa(120000);
        kos2.setFasilitas("Kamar mandi dalam, dapur bersama, TV, kolam renang");

        // Buat objek kelas Penyewa
        Penyewa penyewa = new Penyewa();
        penyewa.setId(1);
        penyewa.setNama("John Doe");
        penyewa.setAlamat("Jalan XYZ No. 456");
        penyewa.setNomorTelepon("081234567890");
        penyewa.setEmail("john.doe@example.com");

        // Buat objek kelas Pemesanan
        Pemesanan pemesanan = new Pemesanan();
        pemesanan.setId(1);
        pemesanan.setPenyewa(penyewa);
        pemesanan.setKos(kos);
        pemesanan.setTanggalPesan(new Date());
        pemesanan.setTanggalCheckin(new Date());
        pemesanan.setTanggalCheckout(new Date());
        pemesanan.setJumlahHari(30);
        pemesanan.setHargaTotal(3000000);

        // Buat objek kelas Pembayaran
        Pembayaran pembayaran = new Pembayaran();
        pembayaran.setId(1);
        pembayaran.setPemesanan(pemesanan);
        pembayaran.setTanggalPembayaran(new Date());
        pembayaran.setJumlahPembayaran(3000000);

        // Cetak informasi dari objek kelas Kos
        System.out.println("================================================================");
        System.out.println("Informasi Kos:");
        System.out.println("ID: " + kos.getId());
        System.out.println("Nama : " + kos.getNama());
        System.out.println("Alamat : " + kos.getAlamat());
        System.out.println("Jumlah Kamar : " + kos.getJumlahKamar());
        System.out.println("Jumlah Kamar : " + kos.getJumlahKamar());
        System.out.println("Harga Sewa : " + kos.getHargaSewa());
        System.out.println("Fasilitas : " + kos.getFasilitas());
        System.out.println("================================================================");
                // Cetak informasi dari objek kelas Kos yang baru
        System.out.println("================================================================");
        System.out.println("Informasi Kos:");
        System.out.println("ID: " + kos2.getId());
        System.out.println("Nama : " + kos2.getNama());
        System.out.println("Alamat : " + kos2.getAlamat());
        System.out.println("Jumlah Kamar : " + kos2.getJumlahKamar());
        System.out.println("Jumlah Kamar : " + kos2.getJumlahKamar());
        System.out.println("Harga Sewa : " + kos2.getHargaSewa());
        System.out.println("Fasilitas : " + kos2.getFasilitas());
        System.out.println("================================================================");
        // note perlu dilanjutkan
        
        // Cetak informasi dari objek kelas Pembayaran
        System.out.println("================================================================");
        System.out.println("Informasi Pembayaran:");
        System.out.println("ID: " + pembayaran.getId());
        System.out.println("Pemesanan: " + pembayaran.getPemesanan().getId());
        System.out.println("Tanggal Pembayaran: " + pembayaran.getTanggalPembayaran());
        System.out.println("Jumlah Pembayaran: " + pembayaran.getJumlahPembayaran());
        System.out.println("================================================================");
    }
}
