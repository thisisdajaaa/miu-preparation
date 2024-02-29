package practice.array_list;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.insert(0, 1);
        arrayList.insert(1, 2);
        arrayList.insert(2, 3);
        arrayList.insert(3, 4);
        arrayList.insert(4, 5);
        arrayList.remove(4);

        arrayList.insert(4, 5);

        arrayList.showArray();
    }
}
