import java.util.*;
class StackLL<D> implements Stack<D>
{
ListObject<D> top;
StackLL()
{
 top = null;
  
}
public D peek()
{

return top.GetData();
}
public void push(D ob)
{
ListObject<D> obj = new ListObject<D>(ob,null);
obj.SetNext(null);
if(top == null)
{
top = obj;
}
else
{
obj.SetNext(top);
top = obj;
}
}
public D pop()
{
D object = top.GetData();
top = top.GetNext();
return object;
}
public Integer size()
{Integer k=0;
 ListObject<D> i ;
for(i = top;i!= null;i=i.GetNext())
{
++k;
}
return k;
}



public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		
		StackLL<Integer> st = new StackLL<Integer>();
		 while(true)
		 {   
			 System.out.println("Functions:\n1.Push a element\n2.Pop a element\n3.Get size\n4.use peek\n");
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
			 
			 case 4:
				 System.out.println("Want the uppermost element");
				 System.out.println(st.peek());break;
				 default: System.out.println("Enter the correct choice");
			 }	 
		 }	









}



















}
