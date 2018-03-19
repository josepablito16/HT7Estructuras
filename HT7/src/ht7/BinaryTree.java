
package ht7;

/**
 *
 * @author jose
 */

public class BinaryTree<E>
{
    Node root;
    
   private Node addRecursive(Node current, Node value) 
   {
        if (current == null) 
        {
            Node<E> j=new Node<E>();
            j=value;
            return j;
        }

      
        if ((value.getKey()).compareTo(current.getKey())>0) {
            current.left = addRecursive(current.left, value);
        } else if ((value.getKey()).compareTo(current.getKey())<0) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }
   
   public void add(Node value) 
   {
        root = addRecursive(root, value);
   }
   
   private boolean containsNodeRecursive(Node current, Node value) 
   {
        if (current == null) {
            return false;
        } 
        if (value.getKey() == current.getKey()) {
            return true;
        } 
        return (value.getKey()).compareTo(current.getKey())<0
          ? containsNodeRecursive(current.left, value)
          : containsNodeRecursive(current.right, value);
    }
   
   public boolean containsNode(Node value) 
   {
        return containsNodeRecursive(root, value);
   }
   
   
   
   public void traverseInOrder(Node node) 
   {
        if (node != null) 
        {
            traverseInOrder(node.left);
            System.out.print(" " + node.getKey());
            traverseInOrder(node.right);
        }
    }
   
   

    
    
    
    
    
}
