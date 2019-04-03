import java.io.*;
import java.util.*;
class maxheap
{
int size;
int[] heap;
int maxsize;

maxheap(){
maxsize=0;

}
maxheap(int maxsize)
{
this.maxsize=maxsize;
this.size=0;
heap=new int[this.maxsize+1];
heap[0]=Integer.MAX_VALUE;

}


void swap(int a,int b)
{
int temp=heap[a];
heap[a]=heap[b];
heap[b]=temp;
}


void heapify(int pos)
{

        if (pos >= (size / 2) && pos <= size) 
            return; 
  
        if (heap[pos] < heap[2*pos] ||  
            heap[pos] < heap[2*pos+1]) { 
  
            if (heap[2*pos] > heap[2*pos+1]) { 
                swap(pos, 2*pos); 
                heapify(2*pos); 
            } 
            else { 
                swap(pos,2*pos+1); 
                heapify(2*pos+1); 
            } 
        } 


}
void insert(int element)
{
heap[++size]=element;
int current = size; 
        while (heap[current] > heap[current/2]) { 
            swap(current, current/2); 
            current = current/2; 
        }
        } 
int removemax()
{
int popped=heap[1];
heap[1]=heap[size--];
heapify(1);
return popped;
}
void print()
{
int i;
for(i=1;i<=maxsize;i++)
{
System.out.println(removemax());
}
}

}
class main
{
public static void main(String[] args)
{
maxheap n = new maxheap(9); 
        n.insert(5); 
        n.insert(3); 
        n.insert(17); 
        n.insert(10); 
        n.insert(84); 
        n.insert(19); 
        n.insert(6); 
        n.insert(22); 
        n.insert(9); 
        n.print();
}
}


