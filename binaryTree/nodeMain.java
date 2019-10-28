
public class nodeMain{
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(10);
        tree.add(43);
        tree.add(18);
        tree.add(6);
        tree.add(50);
        tree.add(8);
        tree.printTree(); 
        System.out.println();   //Blank line
        tree.printValues();
    }
}