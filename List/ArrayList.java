class ArrayList implements LinearList
{
	Integer buffer;
	Integer size;
	Object arr[];
	
	public void add(Object obj)
	{
	arr[size]=obj;
	size++;
	
		if(size==buffer)
		{
		Object arr2[]=new Object[buffer*2];
		
		int temp;
		for(temp=0;temp<buffer;temp++)
		arr2[temp]=arr[temp];
		buffer*=2;
		arr=arr2;
		}
	}
	
	public void add(Object o,Integer pos)
	{
			try
			{
				if(pos>size)
				{
				BoundsException ob=new BoundsException();
				throw ob;
				}
			}
			
			catch(BoundsException x)
			{
			x.printError();
			return;
			}
			
			
	int i;
	for(i=size-1;i>pos-2;i--)
	arr[i+1]=arr[i];
	arr[pos-1]=o;
	size++;
	
		if(size==buffer)
		{
		Object arr2[]=new Object[buffer*2];
		
		int temp;
		for(temp=0;temp<buffer;temp++)
		arr2[temp]=arr[temp];
		buffer*=2;
		arr=arr2;
		}
	
	}
	
	public void traverse()
	{
	int temp;
	for(temp=0;temp<size;temp++)
	System.out.println(arr[temp]);
	}
	
	ArrayList()
	{
	size=0;
	buffer=2;
	arr=new Object[buffer];
	}
	
}
