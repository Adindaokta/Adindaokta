import java.util.ArrayList;
import java.util.Scanner;

public class C1M2 {

    private final String nama;
    private final String nim;
    private final String jurusan;

    public void Mahasiswa(String nama, String nim, String jurusan) {
        nama = nama;
        nim = nim;
        jurusan = jurusan;
    }

    public void tampilDataMhsswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }

    public static void tampilUniv() {
        System.out.println("Universitas Muhammadiyah Malang");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah data");
            System.out.println("2. Tampilkan data");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Input data mahasiswa:");
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Jurusan: ");
                    String jurusan = scanner.nextLine();


                    if (nim.length() != 15) {
                        System.out.println("Panjang NIM harus 15 angka");
                        break;
                    }

                    Mahasiswa mahasiswa = new Mahasiswa (nama, nim, jurusan);
                    daftarMahasiswa.add(mahasiswa);
                    System.out.println("Data mahasiswa berhasil ditambahkan.");
                    break;

                case 2:
                    System.out.println("\nData mahasiswa:");
                    Mahasiswa.tampilUniv();
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        mhs.tampilDataMhsswa();
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);
    }
}
