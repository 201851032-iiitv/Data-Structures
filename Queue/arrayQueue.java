package Adit;

import java.util.*;


class arrayQueue
{
    protected Object Queue[] ;
    protected int front, rear, size, len;
 
    
    public arrayQueue(int n) 
    {
        size = n;
        len = 0;
        Queue = new Object[size];
        front = -1;
        rear = -1;
    }    
    
    public boolean isEmpty() 
    {
        return front == -1;
    }    
    
    public boolean isFull() 
    {
        return front==0 && rear == size -1 ;
    }    
  
    public int getSize()
    {
        return len ;
    }    
  
    public Object peek() 
    {
        if (isEmpty())
           throw new NoSuchElementException(" Exception");
        return Queue[front];
    }    

    public void insert(Object i) 
    {
        if (rear == -1) 
        {
            front = 0;
            rear = 0;
            Queue[rear] = i;
        }
        else if (rear == size-1)
        {
        	
        	
    			Object [] arr1 = new Object[size*2];
    			System.arraycopy(Queue, 0, arr1, 0,Queue.length);
    			Queue= arr1;
    			size*=2;
    		Queue[++rear]= i;
        }
        else 
            Queue[++rear] = i;    
        len++ ;
        System.out.println(rear+" "+size);
    }    
   
    public Object remove() 
    {
        if (isEmpty())
           throw new NoSuchElementException("Exception");
        else 
        {
            len-- ;
            Object ele = Queue[front];
            if ( front == rear) 
            {
                front = -1;
                rear = -1;
            }
            else
                front++;                
            return ele;
        }        
    }
    
    public void display()
    {
        System.out.print("\nQueue = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = front; i <= rear; i++)
            System.out.print(Queue[i]+" ");
        System.out.println();        
    }

 


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
 
        
        System.out.println("Enter Size of  Queue ");
        int n = scan.nextInt();
        
        arrayQueue q = new arrayQueue(n);        
             
        char ch;
        do{
            System.out.println("\nQueue Operations");
            System.out.println("1. enqueue");
            System.out.println("2. dequeue");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            
            System.out.println("5. size");
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter element to insert");
               
                    q.insert( scan.next() );
                                  
                break;                         
            case 2 : 
                
                    System.out.println("Removed Element = "+q.remove());
       
                break;                         
            case 3 : 
                
                    System.out.println("Peek Element = "+q.peek());
                
                
                break;                            
            case 4 : 
                System.out.println("Empty status = "+q.isEmpty());
                break;                
                                     
            case 5 : 
                System.out.println("Size = "+ q.getSize());
                break;                         
            default : System.out.println("Wrong Entry \n ");
                break;
            }
            
            q.display();            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
 
        } while (ch == 'Y'|| ch == 'y');                                                        
    }    
}