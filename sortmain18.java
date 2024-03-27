public class sortmain18 {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100,90};
        System.out.println("sorting dengan merge sort");
        Mergesorting18 mSort = new Mergesorting18();
        System.out.println("data awal");
        mSort.printarray(data);
        mSort.mergesort(data);
        System.out.println("setelah diurutkan");
        mSort.printarray(data);
    }
}
