public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();

        bst.put(5, "Five");
        bst.put(2, "Two");
        bst.put(8, "Eight");
        bst.put(1, "One");
        bst.put(3, "Three");

        System.out.println(bst.get(5)); // Output: Five
        System.out.println(bst.get(4)); // Output: null

        bst.delete(2);

        System.out.println(bst.get(2)); // Output: null

        for (Integer key : bst.iterator()) {
            System.out.println(key);
        }
    }

}
