import java.util.Date;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("MANAJEMEN KOS - KOSAN GARUDA MERAH ");
        
        // Membuat objek kelas Scanner untuk input dari user
        Scanner input = new Scanner(System.in);
        
        // Membuat objek kelas Kos
        Kos kos = new Kos();
        kos.setId(1);
        kos.setNama("Kos ABC");
        kos.setAlamat("Jalan ABC No. 123");
        kos.setJumlahKamar(10);
        kos.setHargaSewa(100000);
        kos.setFasilitas("Kamar mandi dalam, dapur bersama, TV");

        // Membuat objek kelas Kos yang baru
        Kos kos2 = new Kos();
        kos2.setId(2);
        kos2.setNama("Kos DEF");
        kos2.setAlamat("Jalan DEF No. 789");
        kos2.setJumlahKamar(12);
        kos2.setHargaSewa(120000);
        kos2.setFasilitas("Kamar mandi dalam, dapur bersama, TV, kolam renang");

        // Membuat objek kelas Penyewa
        Penyewa penyewa = new Penyewa();
        penyewa.setId(1);
        penyewa.setNama("John Doe");
        penyewa.setAlamat("Jalan XYZ No. 456");
        penyewa.setNomorTelepon("081234567890");
        penyewa.setEmail("john.doe@example.com");

        // Membuat objek kelas Pemesanan
        Pemesanan pemesanan = new Pemesanan();
        pemesanan.setId(1);
        pemesanan.setPenyewa(penyewa);
        pemesanan.setKos(kos);
        pemesanan.setTanggalPesan(new Date());
        pemesanan.setTanggalCheckin(new Date());
        pemesanan.setTanggalCheckout(new Date());
        pemesanan.setJumlahHari(30);
        pemesanan.setHargaTotal(3000000);

        // Membuat objek kelas Pembayaran
        Pembayaran pembayaran = new Pembayaran();
        pembayaran.setId(1);
        pembayaran.setPemesanan(pemesanan);
        pembayaran.setTanggalPembayaran(new Date());
        pembayaran.setJumlahPembayaran(3000000);
            // Menampilkan menu pilihan tindakan kepada user
    System.out.println("Pilih tindakan yang ingin dilakukan: ");
    System.out.println("1. Lihat informasi kos");
    System.out.println("2. Lihat informasi penyewa");
    System.out.println("3. Lihat informasi pemesanan");
    System.out.println("4. Lihat informasi pembayaran");
    System.out.println("5. Tambahkan data penyewa");
    System.out.println("6. Tambahkan data kos");
    System.out.println("7. Keluar");
    
    // Meminta input tindakan dari user
    System.out.print("Masukkan pilihan anda (1-5): ");
    int pilihan = input.nextInt();
    
    // Melakukan tindakan sesuai dengan pilihan user
    switch (pilihan) {
        case 1:
            // Menampilkan informasi kos
            System.out.println("Informasi Kos:");
            System.out.println("ID: " + kos.getId());
            System.out.println("Nama : " + kos.getNama());
            System.out.println("Alamat : " + kos.getAlamat());
            System.out.println("Jumlah Kamar : " + kos.getJumlahKamar());
            System.out.println("Harga Sewa : " + kos.getHargaSewa());
            System.out.println("Fasilitas : " + kos.getFasilitas());
            break;
        case 2:
            // Menampilkan informasi penyewa
            System.out.println("Informasi Penyewa:");
            System.out.println("ID: " + penyewa.getId());
            System.out.println("Nama : " + penyewa.getNama());
            System.out.println("Alamat : " + penyewa.getAlamat());
            System.out.println("Nomor Telepon : " + penyewa.getNomorTelepon());
            System.out.println("Email : " + penyewa.getEmail());
            break;
        case 3:
            // Menampilkan informasi pemesanan
            System.out.println("Informasi Pemesanan:");
            System.out.println("ID: " + pemesanan.getId());
            System.out.println("Nama Penyewa: " + pemesanan.getPenyewa().getNama());
            System.out.println("Nama Kos: " + pemesanan.getKos().getNama());
            System.out.println("Tanggal Pesan: " + pemesanan.getTanggalPesan());
            System.out.println("Tanggal Check-in: " + pemesanan.getTanggalCheckin());
            System.out.println("Tanggal Check-out: " + pemesanan.getTanggalCheckout());
            System.out.println("Jumlah Hari: " + pemesanan.getJumlahHari());
            System.out.println("Harga Total: " + pemesanan.getHargaTotal());
            break;
            case 4:
            // Menampilkan informasi pembayaran
            System.out.println("Informasi Pembayaran:");
            System.out.println("ID: " + pembayaran.getId());
            System.out.println("ID Pemesanan: " + pembayaran.getPemesanan().getId());
            System.out.println("Tanggal Pembayaran: " + pembayaran.getTanggalPembayaran());
            System.out.println("Jumlah Pembayaran: " + pembayaran.getJumlahPembayaran());
            break;
            case 5:
            // Menambahkan data kos
            Kos kosBaru = new Kos();
            System.out.print("Masukkan ID kos: ");
            kosBaru.setId(input.nextInt());
            System.out.print("Masukkan nama kos: ");
            input.nextLine(); // Membaca baris kosong di buffer
            kosBaru.setNama(input.nextLine());
            System.out.print("Masukkan alamat kos: ");
            kosBaru.setAlamat(input.nextLine());
            System.out.print("Masukkan jumlah kamar kos: ");
            kosBaru.setJumlahKamar(input.nextInt());
            System.out.print("Masukkan harga sewa kos: ");
            kosBaru.setHargaSewa(input.nextInt());
            System.out.print("Masukkan fasilitas kos: ");
            input.nextLine(); // Membaca baris kosong di buffer
            kosBaru.setFasilitas(input.nextLine());
            // Menambahkan objek kosBaru ke dalam daftar kos
            // ...
            break;
        case 6:
            // Menambahkan data penyewa
            Penyewa penyewaBaru = new Penyewa();
            System.out.print("Masukkan ID penyewa: ");
            penyewaBaru.setId(input.nextInt());
            System.out.print("Masukkan nama penyewa: ");
            input.nextLine(); // Membaca baris kosong di buffer
            penyewaBaru.setNama(input.nextLine());
            System.out.print("Masukkan alamat penyewa: ");
            penyewaBaru.setAlamat(input.nextLine());
            System.out.print("Masukkan nomor telepon penyewa: ");
            penyewaBaru.setNomorTelepon(input.nextLine());
            System.out.print("Masukkan email penyewa: ");
            penyewaBaru.setEmail(input.nextLine());
            // Menambahkan objek penyewaBaru ke dalam daftar penyewa
            // ...
            break;
            case 7:
            // Keluar dari program
            System.out.println("Terima kasih telah menggunakan program ini.");
            break;
            default:
            // Menampilkan pesan error jika pilihan tidak valid
            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            break;
            }
            }
            }


// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//         System.out.println("MANAJEMEN KOS - KOSAN GARUDA MERAH ");
//         // Buat objek kelas Kos
//         Kos kos = new Kos();
//         // Kos kos = new Kos();
//         kos.setId(1);
//         kos.setNama("Kos ABC");
//         kos.setAlamat("Jalan ABC No. 123");
//         kos.setJumlahKamar(10);
//         kos.setHargaSewa(100000);
//         kos.setFasilitas("Kamar mandi dalam, dapur bersama, TV");

//         // Buat objek kelas Kos yang baru
//         Kos kos2 = new Kos();
//         kos2.setId(2);
//         kos2.setNama("Kos DEF");
//         kos2.setAlamat("Jalan DEF No. 789");
//         kos2.setJumlahKamar(12);
//         kos2.setHargaSewa(120000);
//         kos2.setFasilitas("Kamar mandi dalam, dapur bersama, TV, kolam renang");

//         // Buat objek kelas Penyewa
//         Penyewa penyewa = new Penyewa();
//         penyewa.setId(1);
//         penyewa.setNama("John Doe");
//         penyewa.setAlamat("Jalan XYZ No. 456");
//         penyewa.setNomorTelepon("081234567890");
//         penyewa.setEmail("john.doe@example.com");

//         // Buat objek kelas Pemesanan
//         Pemesanan pemesanan = new Pemesanan();
//         pemesanan.setId(1);
//         pemesanan.setPenyewa(penyewa);
//         pemesanan.setKos(kos);
//         pemesanan.setTanggalPesan(new Date());
//         pemesanan.setTanggalCheckin(new Date());
//         pemesanan.setTanggalCheckout(new Date());
//         pemesanan.setJumlahHari(30);
//         pemesanan.setHargaTotal(3000000);

//         // Buat objek kelas Pembayaran
//         Pembayaran pembayaran = new Pembayaran();
//         pembayaran.setId(1);
//         pembayaran.setPemesanan(pemesanan);
//         pembayaran.setTanggalPembayaran(new Date());
//         pembayaran.setJumlahPembayaran(3000000);

//         // Cetak informasi dari objek kelas Kos
//         System.out.println("================================================================");
//         System.out.println("Informasi Kos:");
//         System.out.println("ID: " + kos.getId());
//         System.out.println("Nama : " + kos.getNama());
//         System.out.println("Alamat : " + kos.getAlamat());
//         System.out.println("Jumlah Kamar : " + kos.getJumlahKamar());
//         System.out.println("Jumlah Kamar : " + kos.getJumlahKamar());
//         System.out.println("Harga Sewa : " + kos.getHargaSewa());
//         System.out.println("Fasilitas : " + kos.getFasilitas());
//         System.out.println("================================================================");
//                 // Cetak informasi dari objek kelas Kos yang baru
//         System.out.println("================================================================");
//         System.out.println("Informasi Kos:");
//         System.out.println("ID: " + kos2.getId());
//         System.out.println("Nama : " + kos2.getNama());
//         System.out.println("Alamat : " + kos2.getAlamat());
//         System.out.println("Jumlah Kamar : " + kos2.getJumlahKamar());
//         System.out.println("Jumlah Kamar : " + kos2.getJumlahKamar());
//         System.out.println("Harga Sewa : " + kos2.getHargaSewa());
//         System.out.println("Fasilitas : " + kos2.getFasilitas());
//         System.out.println("================================================================");
//         // note perlu dilanjutkan
        
//         // Cetak informasi dari objek kelas Pembayaran
//         System.out.println("================================================================");
//         System.out.println("Informasi Pembayaran:");
//         System.out.println("ID: " + pembayaran.getId());
//         System.out.println("Pemesanan: " + pembayaran.getPemesanan().getId());
//         System.out.println("Tanggal Pembayaran: " + pembayaran.getTanggalPembayaran());
//         System.out.println("Jumlah Pembayaran: " + pembayaran.getJumlahPembayaran());
//         System.out.println("================================================================");
//     }
// }
