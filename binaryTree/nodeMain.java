
//Author: Moises Pantoja
public class nodeMain{
    public static void main(String[] args)
    {
        
        //TODO:
        //min or max value
            //while loop til its null
        //more test data sets
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println(tree.about());
        System.out.println(); 
        tree.add(10);
        tree.add(43);
        tree.add(18);
        tree.add(6);
        tree.add(50);
        tree.add(8);
        tree.printTree();
        System.out.println(); 
        tree.printValues();
        System.out.println(); 
        tree.clear();

        System.out.println();   //Blank line
        
        tree.add(50);
        tree.add(30);
        tree.add(70);
        tree.add(20);
        tree.add(40);
        tree.add(60);
        tree.add(80);
        tree.remove(30);
        //tree.clear();
        tree.printTree(); 
        System.out.println();
        tree.printValues();
        
        //
       
    }
}