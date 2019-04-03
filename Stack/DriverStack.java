import java.util.*;
class DriverStack{
     
public static void main(String[] args)
{ 
    Stack_LL<Integer> ob=new Stack_LL<Integer>();
 Node<Integer> temp;
        temp=ob.Head;
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    while(m!=0)
    {
    System.out.println("----------------");
    System.out.println("press 1 to enter the element in stack");
    System.out.println("press 2 to print the top element");
    System.out.println("press 3 to remove the topmost element");
    System.out.println("press 4 to know the size of stack");
    System.out.println("press 5 to print the block of stack");
    System.out.println("-----------------");
    Integer n=sc.nextInt();

   
    switch(n)
    {
        case 1:
            {Integer ne=sc.nextInt();
             ob.push(ne);
             
            break;}
        case 2:
            {System.out.println(ob.peek());
             
             break;}
        case 3:
            {System.out.println(ob.pop());
            
             break;}
        case 4:
            {System.out.println(ob.size());
            
             break;}
        case 5:
            {ob.traverse();}
    }
    }  
    }
    }

