
public class stackObject<D>
{
 private Object data;
 private ListObject next;
 
 
 public stackObject()
 {
	 data =null;
	 next = null;
	 
 }
 public stackObject(D ob,stackObject 	n)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
	
 {
	 data = ob;
	 next = n;
	 
 }
 
	
public void SetData(D ob)
{
	data = ob;
}
public void SetNext(stackObject n)
{
	next = n;
}
public D GetData()
{
	return data;
}
public stackObject GetNext()
{
	return next;
}
}
