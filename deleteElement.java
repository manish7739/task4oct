package task4oct;
public class deleteElement {
public static void main(String args[]) {
	int[] arr= {10,20,30,40,50,60,70,80,90};
	int k=50;
	int count=0;
	for(int i=0;i<arr.length;i++){
		if(k==arr[i]){
			for(int j=i; j<arr.length-1; j++) {
            	arr[j]=arr[j+1];
			}
			count=count+1;
			break;
		}
	}
	if(count==0){
		System.out.println("Element not found");
	           }
	else{
		    System.out.println("Element delete successful");
		    for(int l=0; l<arr.length-1; l++) {
			System.out.println(arr[l]);
		}
			
	}
}
}
