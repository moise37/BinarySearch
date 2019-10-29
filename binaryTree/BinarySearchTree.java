
public class BinarySearchTree
{
    private Node root = null;

    public String about()
    {
        return "Written by D. Cook for CSC 130. Additional code by Moises Pantoja";
    }
    
    public BinarySearchTree()
    {
        this.root = null;
    }

    public void printTree()
    {
        if (this.root != null)
        {
            this.root.printTree(0);   //Start with a zero indent
        }
    }

    public void printValues()
    {
        if (this.root != null)
        {
            this.root.printValues();
        }
    }
    /***************additional code***************/

    public void add(int value){
        if (root == null) {
            root = new Node(value);
        }else{
            root.add(value);
        }
    }

    public boolean contains(int value){
        return root.contains(value);
    }

    public void remove(int value){
        root.remove(value);
    }

    public void clear(){
        root.clear();
        root = null;
    }
}