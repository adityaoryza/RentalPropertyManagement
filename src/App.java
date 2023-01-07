import java.util.Date;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=========== MANAJEMEN KOS - KOSAN GARUDA MERAH ==========");
        // Membuat objek kelas Scanner untuk input dari user
        Scanner input = new Scanner(System.in);
        
        // Membuat objek kelas Kos
        Kos kos = new Kos();
        kos.setId(1);
        kos.setNama("Kos Normal");
        kos.setAlamat("Jalan Solo Yogyakarta");
        kos.setJumlahKamar(10);
        kos.setHargaSewa(100000);
        kos.setFasilitas("Kamar mandi dalam, dapur bersama, TV");

        // Membuat objek kelas Penyewa
        Penyewa penyewa = new Penyewa();
        penyewa.setId(1);
        penyewa.setNama("Aditya Oryza");
        penyewa.setAlamat("Jalan Munggur Timur");
        penyewa.setNomorTelepon("081234567890");
        penyewa.setEmail("Oryza429@gmail.com");

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
    while (pilihan != 7) {
    // Melakukan tindakan sesuai dengan pilihan user
    switch (pilihan) {
        case 1:
             System.out.println("================================================================");
             // Menampilkan informasi kos
             System.out.println("========== INFORMASI KOS ==========");
             System.out.println("ID: " + kos.getId());
             System.out.println("Nama : " + kos.getNama());
             System.out.println("Alamat : " + kos.getAlamat());
             System.out.println("Jumlah Kamar : " + kos.getJumlahKamar());
             System.out.println("Harga Sewa : " + kos.getHargaSewa());
             System.out.println("Fasilitas : " + kos.getFasilitas());
             System.out.println("================================================================");
            // cetak ouput ke file txt
            try (PrintWriter writer = new PrintWriter(new File("informasi_kos.txt"))) {
                writer.println("Informasi Kos:");
                writer.println("ID: " + kos.getId());
                writer.println("Nama : " + kos.getNama());
                writer.println("Alamat : " + kos.getAlamat());
                writer.println("Jumlah Kamar : " + kos.getJumlahKamar());
                writer.println("Jumlah Kamar : " + kos.getJumlahKamar());
                writer.println("Harga Sewa : " + kos.getHargaSewa());
                writer.println("Fasilitas : " + kos.getFasilitas());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            break;
        case 2:
            System.out.println("================================================================");
            // Menampilkan informasi penyewa
            System.out.println("========== INFORMASI PENYEWA ==========");
            System.out.println("ID: " + penyewa.getId());
            System.out.println("Nama : " + penyewa.getNama());
            System.out.println("Alamat : " + penyewa.getAlamat());
            System.out.println("Nomor Telepon : " + penyewa.getNomorTelepon());
            System.out.println("Email : " + penyewa.getEmail());
            System.out.println("================================================================");
            // cetak ouput ke file txt
            try (PrintWriter writer = new PrintWriter(new File("daftar_penyewa.txt"))) {
                writer.println("Informasi Penyewa:");
                writer.println("ID: " + penyewa.getId());
                writer.println("Nama : " + penyewa.getNama());
                writer.println("Alamat : " + penyewa.getAlamat());
                writer.println("Nomor Telepon : " + penyewa.getNomorTelepon());
                writer.println("Email : " + penyewa.getEmail());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            break;
        case 3:
            System.out.println("================================================================");
            // Menampilkan informasi pemesanan
            System.out.println("========== INFORMASI PEMESANAN ==========");
            System.out.println("ID: " + pemesanan.getId());
            System.out.println("Nama Penyewa: " + pemesanan.getPenyewa().getNama());
            System.out.println("Nama Kos: " + pemesanan.getKos().getNama());
            System.out.println("Tanggal Pesan: " + pemesanan.getTanggalPesan());
            System.out.println("Tanggal Check-in: " + pemesanan.getTanggalCheckin());
            System.out.println("Tanggal Check-out: " + pemesanan.getTanggalCheckout());
            System.out.println("Jumlah Hari: " + pemesanan.getJumlahHari());
            System.out.println("Harga Total: " + pemesanan.getHargaTotal());
            System.out.println("================================================================");
            // cetak ouput ke file txt
            try (PrintWriter writer = new PrintWriter(new File("informasi_kos.txt"))) {
                writer.println("Informasi Pemesanan:");
                writer.println("ID: " + pemesanan.getId());
                writer.println("Nama Penyewa: " + pemesanan.getPenyewa().getNama());
                writer.println("Nama Kos: " + pemesanan.getKos().getNama());
                writer.println("Tanggal Pesan: " + pemesanan.getTanggalPesan());
                writer.println("Tanggal Check-in: " + pemesanan.getTanggalCheckin());
                writer.println("Tanggal Check-out: " + pemesanan.getTanggalCheckout());
                writer.println("Jumlah Hari: " + pemesanan.getJumlahHari());
                writer.println("Harga Total: " + pemesanan.getHargaTotal());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            break;
        case 4:
            System.out.println("================================================================");
            // Menampilkan informasi pembayaran
            System.out.println("========== INFORMASI PEMBAYARAN ==========");
            System.out.println("ID: " + pembayaran.getId());
            System.out.println("ID Pemesanan: " + pembayaran.getPemesanan().getId());
            System.out.println("Tanggal Pembayaran: " + pembayaran.getTanggalPembayaran());
            System.out.println("Jumlah Pembayaran: " + pembayaran.getJumlahPembayaran());
            System.out.println("================================================================");
            try (PrintWriter writer = new PrintWriter(new File("Struk_Bayar.txt"))) {
                writer.println("Data Kos Baru:");
                writer.println("ID: " + pembayaran.getId());
                writer.println("ID Pemesanan: " + pembayaran.getPemesanan().getId());
                writer.println("Tanggal Pembayaran: " + pembayaran.getTanggalPembayaran());
                writer.println("Jumlah Pembayaran: " + pembayaran.getJumlahPembayaran());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            break;
            case 5:
            System.out.println("================================================================");
            // Menambahkan data kos
            System.out.println("========== TAMBAH DATA KOS BARU ==========");
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
            System.out.println("================================================================");
            // Menambahkan objek kosBaru ke dalam daftar kos
            // ...
            try (PrintWriter writer = new PrintWriter(new File("informasi_kos.txt"))) {
                writer.println("Data Kos Baru:");
                writer.println("ID: " + kosBaru.getId());
                writer.println("Nama: " + kosBaru.getNama());
                writer.println("Alamat: " + kosBaru.getAlamat());
                writer.println("Jumlah Kamar: " + kosBaru.getJumlahKamar());
                writer.println("Harga Sewa: " + kosBaru.getHargaSewa());
                writer.println("Fasilitas: " + kosBaru.getFasilitas());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
            break;
        case 6:
            System.out.println("================================================================");
            // Menambahkan data penyewa
            System.out.println("========== TAMBAH DATA PENYEWA BARU ==========");
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
            System.out.println("================================================================");
            // Menambahkan objek penyewaBaru ke dalam daftar penyewa
            // ...
                        // Menuliskan data penyewa ke dalam file
            try (PrintWriter writer = new PrintWriter(new File("daftar_penyewa.txt") )) {
                writer.println("Data Penyewa Baru:");
                writer.println("ID: " + penyewaBaru.getId());
                writer.println("Nama: " + penyewaBaru.getNama());
                writer.println("Alamat: " + penyewaBaru.getAlamat());
                writer.println("Nomor Telepon: " + penyewaBaru.getNomorTelepon());
                writer.println("Email: " + penyewaBaru.getEmail());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            break;
        }
         // Menampilkan menu pilihan kembali
        System.out.println("MANAJEMEN KOS - KOSAN GARUDA MERAH ");
        System.out.println("1. Tampilkan informasi kos");
        System.out.println("2. Tampilkan informasi penyewa");
        System.out.println("3. Tampilkan informasi pemesanan");
        System.out.println("4. Tampilkan informasi pembayaran");
        System.out.println("5. Tambahkan data kos");
        System.out.println("6. Tambahkan data penyewa");
        System.out.println("7. Keluar");
        System.out.print("Pilihan Anda: ");
        pilihan = input.nextInt();
          
            }
        System.out.println("Terima kasih telah menggunakan program ini.");
    }}