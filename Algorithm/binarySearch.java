import java.util.*;
public class binarySearch{
	public static void main(String[] args) {
		int a[]={1,5,8,9,12,13,17,19};
		int size=a.length;
		System.out.println("Array list:");
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println();
		System.out.print("Enter Search item: ");
		Scanner sc=new Scanner(System.in);
		int item=sc.nextInt();
//must be passed arguments in print().
		System.out.print('\n');
//'single_quote' contain only one character.
		int loc=search(a,size,item);
		if(loc!=-1)
			System.out.println("Search found. Location="+(loc+1));
		else
			System.out.println("Search not found.");
	}
	public static int search(int a[],int size,int x){
		int i,j,mid,loc;
		i=0;
		j=size-1;
		while (i<j) {
			mid=(i+j)/2;
			if (a[mid]<x)
				i=mid+1;
			else
				j=mid;
		}
		if(a[i]==x)
			loc=i;
		else
			loc=-1;
		return loc;
	}
}