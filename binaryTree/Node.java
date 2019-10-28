public class Node
{
    public Node left;
    public Node right;
    public int data;

    public Node (int data, Node left, Node right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node (int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void printTree(int indent)
    {
        String pad = "";

        //=== Print current node
        //This is ugly. Other languages, such as C#, have useful string methods for padding.
        for (int n = 0; n < indent; n++)     
        {
            pad += "  ";                     //2 spaces
        }
        
          System.out.println(pad +  "+-- " + this.data);
        
        //== Recursion
        if (this.left != null)
        {
            this.left.printTree(indent + 1);
        }
  
        if (this.right != null)
        {
            this.right.printTree(indent + 1);
        }
    }

    public void printValues()
    {
        if (this.left != null)
        {
            this.left.printValues();
        }
        
        //Infix
        System.out.print(this.data + ' ');   //Just print the data (no newline) and a space

        if (this.right != null)
        {
            this.right.printValues();
        }
    }

/*added code */

    public void add(int value){
        //if (contains(this.value)) {   /*true and does nothing */}
        
        //else{       //the current value is not equal to the
                    //current node so test left and right
            if ((Integer)value < (Integer)data) {
                if (this.left == null) {
                    this.left = new Node(value);
                }else{
                    this.left.add(value);
                }
            }else{
                if (this.right == null) {
                    this.right = new Node(value);
                }else{
                    this.right.add(value);
                }
            }//adds the value to the correct position
        //}    // if it already exists, nothing       
    }
    public boolean contains(int value)
    {    
        if (value == data) 
        {//returns True if it is in the tree
            return true;
        }else
        {
            if (value < data) 
            {
                if (left == null) 
                {
                    
                }else
                {
                    return left.contains(value);
                }
            }
            if (value > (Integer)data) 
            {
                if (right == null) 
                {
                    
                }else
                {
                    return right.contains(value);
                }
            }
        }return true;
    }
    public void remove(int value)
    {
        // .contains(int value) then
            //if true { remove}
               //else nothing 
    
    }
    public void clear(){
        //remove all the nodes from tree
            //recursive postorder
                //left = null, right = null
    }
}