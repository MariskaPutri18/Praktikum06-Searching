package minggu7;

public class PencarianMhs18 {
    
        Mahasiswa18 listMHs[] = new Mahasiswa18[5];
        int idx;
    
    void tambah (Mahasiswa18 m ){
        if (idx < listMHs.length){
            listMHs[idx] = m;
            idx ++;
        }else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil(){
        for  (Mahasiswa18 m :listMHs){
            m.tampil();
            System.out.println("======================");
        }
    }

    public int findSeqSearch (int cari){
        int posisi = -1;
        for (int j = 0; j < listMHs.length; j++){
            if(listMHs[j].nim == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }  
    
    public void Tampilposisi(int x, int pos){
        if (pos!= -1){
            System.out.println("data : " + x+ "ditemukan pada indeks "+ pos);

        } else {
            System.out.println("data " + x + "tidak ditemuukan");
        }
    }

    public void Tampildata ( int x, int pos){
        if (pos!= -1){
            System.out.println("Nim\t : " + x);
            System.out.println("nama\t : " + listMHs[pos].nama);
            System.out.println("Umur\t : " + listMHs[pos].umur);
            System.out.println("IPK\t : " + listMHs[pos].ipk);
        }else {
            System.out.println("data" + x + "tidak ditemukan");
        }
    }
}
