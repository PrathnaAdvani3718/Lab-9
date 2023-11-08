package PriorityQueue;


public class PriorityQueueUsingArray {
	 // create an array
	int arr[];
	 int size, capacity;

	
	 public PriorityQueueUsingArray(int capacity) {
	 // initialize an array
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
		arr[size]=data;
		size++;
	}
	 }
	 public int extractMax() {
	 // return and remove max value from array
		 if(size==0) {
			 System.out.println("Queue is empty");
		 }
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
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
			for(int i=0;i<size;i++) {
				for(int j=i+1;j<size;j++) {
					if(arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
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
		 PriorityQueueUsingArray pq=new  PriorityQueueUsingArray(5);
		 pq.insert(7);
		 pq.insert(5);
		 pq.insert(3);
		 pq.insert(10);
		 pq.insert(2);
		System.out.println("Maximum : "+pq.getMax());
		System.out.println("Extract Maximum : "+pq.extractMax()); 
		System.out.println("Search result: "+pq.searchData(2));

	}

}
