public class Main{
    MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();

        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(rand.nextInt(1000));
            Student value = new Student("Student" + i);
            table.put(key, value);
        }

        for (int i = 0; i < table.chainArray.length; i++) {
            int count = 0;
            MyHashTable.HashNode<MyTestingClass, Student> node = table.chainArray[i];
            while (node != null) {
                count++;
                node = node.next;
            }
            System.out.println("Chain " + i + " contains " + count + " elements.");
        }
    }

};
