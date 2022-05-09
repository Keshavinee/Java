import java.util.Scanner;

class Searching{
	int linearSearch(int []arr,int n, int val){
		int i = 0;
		while (i < n){
			if (arr[i] == val){
				return i;
			}	
			i++;		
		}
		return -1;
	}
	
	int binarySearch(int[] arr,int n, int val){
		int low = 0, high = n-1, mid;
		
		while (low <= high){
			mid = (low + high)/2;
			
			if (arr[mid] == val){
				return mid;
			}
			else if (arr[mid] < val){
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}
		}
		return -1;
	}
}
public class Search{
	public static void main(String []args){
		int n,val,pos;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter no.of elements: ");
		n = in.nextInt();
		
		int []arr = new int[n];
		
		// Inserting elements in an array
		for (int i = 0; i < n; i++){
			System.out.print("Enter element " + (i+1)+ ": ");
			arr[i] = in.nextInt();
		}
		System.out.print("Enter element to be searched: ");
		val = in.nextInt();
		
		// Creating an object of class Searching
		Searching obj = new Searching();
		pos = obj.binarySearch(arr,n,val);
		if (pos != -1){
			System.out.println("The element is found at an index value "+pos);
		}
		else{
			System.out.println("The element is not found!");
		}
		in.close();
	}
}
