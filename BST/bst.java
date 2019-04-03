import java.util.*;
import java.io.*;

class Node {
    int value;
    Node left;
    Node right;
 
    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}

class BinaryTree {
 
    Node root;
 
    
  private Node addRecursive(Node current, int value) {
    if (current == null) {
        return new Node(value);
    }
 
    if (value < current.value) {
        current.left = addRecursive(current.left, value);
    } else if (value > current.value) {
        current.right = addRecursive(current.right, value);
    } else {
        // value already exists
        return current;
    }
 
    return current;
  }

  public void add(int value) {
    root = addRecursive(root, value);
  }

  private boolean searchRecursive(Node current, int value) {
    if (current == null) {
        return false;
    } 
    if (value == current.value) {
        return true;
    } 

    else if( value < current.value)
      return searchRecursive(current.left, value);

     else
	return searchRecursive(current.right, value);
  }

  public boolean search(int value) {
    return searchRecursive(root, value);
  }




}

     class uk{

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			//int scan= sc.nextInt();
			BinaryTree b = new BinaryTree();

			char ch;

        do    

        {

            System.out.println("\nBinary Search Tree Operations\n");

            System.out.println("1. insert ");
            System.out.println("2. search");

            int choice = sc.nextInt();            

            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                b.add( sc.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ b.search( sc.nextInt() ));
                break;                                          
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }

		//repeat operation
	    System.out.println("Do you want to continue: y/n");
            ch = sc.next().charAt(0);
		
	 } while (ch == 'Y'|| ch == 'y');               
       }
     }

