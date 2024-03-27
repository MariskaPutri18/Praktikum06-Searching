package minggu7;
import java.util.Scanner;
public class MahasiswaMain18 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Scanner s1 = new Scanner(System.in);

       
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumMhs = s.nextInt();
        PencarianMhs18 data = new PencarianMhs18(jumMhs);
    
        System.out.println("-----------------------------------");
        System.out.println("masukkan data mahasiswa secara urut dari NIM Terkecil");
        for (int i = 0; i < jumMhs; i ++){
            System.out.println("-----------");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();
            System.out.print("nama\t : ");
            String nama = s1.nextLine();
            System.out.print("Umur\t : ");
            int umur =s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            Mahasiswa18 m = new Mahasiswa18(nim, nama, umur, ipk);
            data.tambah(m);
        }
        System.out.println("--------------------------------------");
        System.out.println("Data keseluruhan mahasiswa : ");
        data.tampil();
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
          System.out.println("PEncarian Data : ");
          System.out.println("Masukkan Nim Mahasiswa yang dicari: "); 
          System.out.print("NIM : ");
          int cari = s.nextInt();
          System.out.println(" Menggunakan sequential search");
          int posisi = data.findSeqSearch(cari);
          data.Tampilposisi(cari, posisi);
          data.Tampildata(cari, posisi);

          System.out.println("======================================");
          System.out.println(" Menggunakan Binary search");
          posisi = data.findBinarySearch(cari, 0, jumMhs-1);
          data.Tampilposisi(cari, posisi);
          data.Tampildata(cari, posisi);
    }
}
