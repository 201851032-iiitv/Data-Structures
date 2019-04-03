class OrderedList implements List
{
	Integer buffer;
	Integer size,pos;
	Object arr[];
	public void add(Object i)
	{
		if(size==buffer)
		{
			Object arr2[]=new Object[buffer*2];
			buffer*=2;
			for(Integer j=0;j<size;j++)
			{
				arr2[j]=arr[j];
			}
			arr=arr2;
		}
		for(Integer j=0;j<=size;j++)
		{
			if(arr[j]==null)
			{
				pos=j;
				break;
			}
			else if((Integer)arr[j]>(Integer)i)
			{
				pos=j;
				break;
			}
		}		
		for(Integer j=size-1;j>=pos;j--)
		{
			arr[j+1]=arr[j];
		}
		arr[pos]=i;
		size++;
	}
	public void traverse()
	{
		System.out.print("[ ");		
		for(Integer i=0;i<size;i++)
		{
			System.out.print(arr[i]+" , ");
		}
		System.out.print(" null ]");
	}
	public Integer search(Object obj)
	{
		Integer low,high,mid;
		low=0;
		high=size-1;
		for(Integer j=0;j<size;j++)
		{
			mid=(low+high)/2;
			if(obj.equals(arr[mid]))
			{
				return mid;
			}
			else if((Integer)obj>(Integer)arr[mid])
			{
				low=mid;
			}
			else if((Integer)obj<(Integer)arr[mid])
			{
				high=mid;
			}
		}
		return -1;
	}
	public void remove(Object i)
	{
		for(Integer j=0;j<size;j++)
		{
			if(i.equals(arr[j]))
				pos=j;
		}		
		for(Integer j=pos;j<size;j++)
		{
			arr[j]=arr[j+1];
		}
		size--;
	}
	OrderedList()
	{
		buffer=5;
		size=0;
		pos=0;
		arr = new Integer[buffer];
	} 
}
