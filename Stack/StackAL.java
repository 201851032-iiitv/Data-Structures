
import java.util.*;

class StackAL<D> implements Stack<D>
{
public Object [] arr;
	public Integer size;
	public Integer above=-1;
	
	StackAL(Integer capacity)
	{
		if(capacity <=0)
		{
			try{
	BoundsException T = new BoundsException();
	throw T;}
	catch(BoundsException x)
	{x.printerror();
			}
			
		}
		else
		{
			
			arr = new Object[capacity];
			size = capacity;
		}
		
		
	}
	 StackAL()
	{
		this(5);
	}
	
	
	public Integer size()
	{
		return size;
		
	}
	public D peek()
	{
		return (D)arr[above];
	}
	
	public void push(D ob)
	{
		
		if(above == size-1)
		{
			Object [] arr1 = new Object[size*2];
			for (Integer i=0;i<size;i++)
				arr1[i]=arr[i];
			arr=arr1;
		}
		arr[above+1]= ob;
		above++;
		
	}
	
	public D pop()
	{
		Object removed = arr[above];
		above--;
		return (D)removed;	
		
	}
	
	
	public void ViewStack()
	{
		for(Integer i =0;i< above+1;i++)
		{
			
			System.out.println(arr[i]);
		}
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the capacity of Stack");
		Integer capacity = s.nextInt();
		StackAL<Integer> st = new StackAL(capacity);
		 while(true)
		 {   
			 System.out.println("Functions:\n1.Push a element\n2.Pop a element\n3.Get size\n4.use peek\n5.View List.");
			 System.out.println("Enter the choice");
			 Integer choice  = s.nextInt();
			 
			 switch(choice)
			 {
			 case 1:System.out.println("What you want to add");
			        Integer u = s.nextInt();
			        st.push(u);break;
			        
			 case 2:System.out.println("Removed element is:\n");
			 System.out.println( st.pop());break;
			        
			 
			 
			 case 3:System.out.println("the size is:\n"+st.size());
			        
			        break;
			        
			 case 5:System.out.println("The Stack is:\n");
			        st.ViewStack();break;
			 case 4:
				 System.out.println("Want the uppermost element");
				 System.out.println(st.peek());break;
				 default: System.out.println("Enter the correct choice");
			 }	 
		 }	
	}





















}
