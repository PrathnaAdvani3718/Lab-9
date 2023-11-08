package PriorityQueue;

public class SortedArrayPQ {
		int arr[];
		 int size, capacity;

		
		 public SortedArrayPQ(int capacity) {
			 arr=new int[capacity];
			 size=0;
			 this.capacity=capacity;
		 }
		 
		 public void insert(int data) {
		 // insert data in array in any order
		if(size==capacity) {
			System.out.println("Queue is full");
		}
		else {
			int index = 0;
		    
		    // Find the correct position for the new element in ascending order
		    while (index < size && data > arr[index]) {
		        index++;
		    }

		    // Shift elements to make room for the new element
		    for (int i = size-1; i >= index; i--) {
		        arr[i + 1] = arr[i];
		    }
		    arr[index]=data;
		    size++;
			}
		}
		 
		 public int extractMax() {
		 // return and remove max value from array
			 if(size==0) {
				 System.out.println("Queue is empty");
			 }
			int max=arr[size-1];
			size--;
			return max;
		 }
		 public int getMax() {
		 // just return max value from array
			 if(size==0) {
				 System.out.println("Queue is empty");
			 }
			
			 return arr[size-1];
		 }
		 public boolean searchData(int data) {
		 // search data from array
			 if(size==0) {
				 System.out.println("Queue is empty");
			 }
			 for(int i=0;i<size;i++) {
				 if(arr[i]==data) {
					 return true;
				 }
				 
			 }
			 return false;
		 }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			SortedArrayPQ queue=new SortedArrayPQ(5);
			queue.insert(700);
			queue.insert(1);
			queue.insert(8);
			queue.insert(4);
			queue.insert(99);
			System.out.println("Maximum : "+queue.getMax());
			System.out.println("Extract Maximum : "+queue.extractMax()); 
			System.out.println("Search result: "+queue.searchData(99));

		}

}
