import structure.CollectionList;
import structure.CyclicList;

public class MainStructure {
    public static void main(String[] args) {
        CollectionList collectionList = new CyclicList();
        collectionList.add(1);
        collectionList.add(5);
        collectionList.add(9);
        collectionList.add(10);
        collectionList.add(2);
        collectionList.delete(2);
        collectionList.add(1);
        collectionList.delete(1);
        collectionList.add(5);
        collectionList.add(1);
        collectionList.sort();
        collectionList.add(100);
        collectionList.printCollection();
        int i = collectionList.get(1);
        System.out.println(i);
    }
}
