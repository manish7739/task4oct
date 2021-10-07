package task4oct;

public class repatativeElement {
	 public static void twoRepeating(int [] arr){
		 System.out.println("Repeated Elements: ");
		 for (int i = 0; i <arr.length ; i++) {
		 for (int j = i+1; j <arr.length ; j++) {
		 if(arr[i]==arr[j]){
		 System.out.print(arr[i] + " ");
		 }
		 }
		 }
		 }

		 public static void main(String[] args) {
		 int [] arr = {1,5,2,4,8,9,3,1,4,0};
		 twoRepeating(arr);
		 }

}
