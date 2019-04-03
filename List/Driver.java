class Driver
{
	public static void main(String args[])
	{
		OrderedList obj = new OrderedList();
		System.out.print("Adding new element 5 7 2 8 89 56 123 and 3");
		obj.add(5);
		obj.add(7);
		obj.add(2);
		obj.add(8);
		obj.add(89);
		obj.add(56);
		obj.add(123);
		obj.add(3);
		System.out.print("\nNow Traversing the array: ");
		obj.traverse();
		System.out.print("\nNow Removing 5 from the array: ");
		obj.remove(5);
		System.out.print("\nNow Traversing the array: ");
		obj.traverse();
		System.out.print("\nNow Searching for 89 in the array: ");
		System.out.print("\nFunction returned "+obj.search(89));
		System.out.print("\n");
	}
}
