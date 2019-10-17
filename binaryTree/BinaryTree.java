//MPantoja
public class BinaryTree
{
    public Node root;

    public String about()
	{
		return "Author: Moises Pantoja";
	}
	
    public BinaryTree()
    {
        this.root = null;
    }

    public BinaryTree(Node root)
    {
        this.root = root;
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
}
