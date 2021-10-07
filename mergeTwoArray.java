package task4oct;

public class mergeTwoArray {
public static void mai(String args[]) {
	int[] arr1= {0,1,2,3};
	int[] arr2= {4,5,6,7,9};
	
	int a=arr1.length;
	int b=arr2.length;
	int c=a+b;
	int[] arr3= new int[c];
	for(int i=0; i<a; i++){
		arr3[i]=arr1[i];
	}
	for(int j=0; j<b; j++){
		arr3[j]=arr2[j];
	}
	for(int k=0; k<arr3.length; k++) {
		System.out.println(arr3[k]);
	}
	
	
}
}
