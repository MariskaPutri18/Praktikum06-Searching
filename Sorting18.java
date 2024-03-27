public class Sorting18{
    public static void sequentialSearch (int[] arr, int key){
        for (int i = 0; i < arr.length; i++){
            if (i == key){
                System.out.println("data ditemukan pada indeks ke- "+ i);
            }
        }
        System.out.println("Data tidak ditemukan");
    }

    public static void main(String[] args) {
        int [] daftarNilai = {10, 5, 20, 15, 80,45};
        sequentialSearch(daftarNilai, 5);
    }

    
}