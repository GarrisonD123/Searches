public class SearchingAlgs {

	public static void main(String[] args) {
	}
		
		public static boolean binSearchRe (int[]a, int val, int minIndex, int maxIndex) {
			int midIndex = (maxIndex+minIndex)/2;
			if(a[minIndex] == val)
				return true;
			else if(midIndex > maxIndex)
				return false;
			else {
				if(val > a[midIndex]) {
					return binSearchRe(a,val, midIndex+1, maxIndex);
				}
				else {
					return binSearchRe(a,val, minIndex, midIndex -1);
				}
			}
		}
		
		public static void bubbleSort(int[]a) {
			boolean hasSwapped = true;
			while(hasSwapped) {
				hasSwapped = false;
				for(int i = 0; i < a.length; i++) {
					if(a[i]>a[i+1]) {
					int temp = a[i];
					a[i]= a[i+1];
					a[i+1] = temp;
					hasSwapped = true;
					}
				}
			}
		}
		
		public static void mergeSort(int[]a) {
			int size = a.length;
			if(size<2)
				return;
			int mid = size/2;
			int leftSize = mid;
			int rightSize = size - mid;
			
			int [] left = new int[leftSize];
			int []right = new int[rightSize];
			for(int i =0; i <mid; i++) {
				left[i] = a[i];
			}
			for(int i = mid; i< size; i++) {
				right[i-mid]= a[i];
			}
			mergeSort(left);
			mergeSort(right);
			
		}
		public static void merge( int[]right, int[]left, int[]a) {
			int leftSize = left.length;
			int rightSize = right.length;
			int j=0;
			int k =0;
			int i= 0;
			 while(i<leftSize && j <rightSize) {
				 if(left[i]<= right[i]) {
				a[k] = left[i];
				i++;
				k++;
				 }
				 else {
					 a[k] = right[i];
					 j++;
					 k++;
				 }
			 }
			 while(i<leftSize) {
				 a[k] = left[i];
				 i++;
				 k++;
			 }
			 while(j<rightSize) {
				 a[k] = right[j];
				 j++;
				 k++;
			 }
		}
	
		public static void quickSort(int []a, int leftIndex, int rightIndex) {
			int pIndex = partition(a,leftIndex,rightIndex);
			if(leftIndex < pIndex -1)
				quickSort(a,leftIndex,pIndex -1);
			if(rightIndex > pIndex)
				quickSort(a,pIndex,rightIndex);
			
		}
		public static int partition(int []a, int leftIndex, int rightIndex) {
			int i = leftIndex;
			int j = rightIndex;
			int pivot = a[(leftIndex+rightIndex)/2]; //Value not index
			while(i<=j) {
				while(a[i]<pivot)
					i++;
				while(a[j]>pivot)
					j--;
				if(i<=j) {
					int temp = a[i];
					a[i]=a[j];
					a[j]= temp;
					i++;
					j--;
				}
			}
			return i;
		}
   }





