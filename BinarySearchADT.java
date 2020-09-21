public class BinarySearchADT{
	public static void main(String args[]){
		int b[]={3,5,7,12,17,23,34,45,56,67,77,89,94};
		int key;
		key = Integer.parseInt(args[0]);//search key from cmd line
		position = binarysearch(a,a.length,key);
		if (position == -1){
			System.out.println("Sorry...no key found");
		else
			System.out.println ("key found at "+position + "location...");
	}
	public static int binarysearch(int b[],int n, int key){
		int lb,ub, mid ;
		lb=0;
		ub=n-1;
		while(lb<=ub){ //fail means (lb>ub) 
			mid=(lb+ub)/2;
			if (a[mid] == key)
				return mid;
			else
			if(a[mid<key])
				lb=mid+1;
			else
				ub=mid-1;
		}
		return -1;
	}
}		