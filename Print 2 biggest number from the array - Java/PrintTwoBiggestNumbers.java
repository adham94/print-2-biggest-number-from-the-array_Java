public class PrintTwoBiggestNumbers{
    
    public static void main(String []args){
        int num[] = {5,34,78,2,45,1,98,23,97,-45};   
        printTwoBiggestNumbers(num); 
    }
     
    public static void printTwoBiggestNumbers(int[] n) {

    int largest = n[0];
    int secondLargest = n[0];
    
    for (int i = 0; i < n.length; i++) {
     
    		if (n[i] > largest) {
    			secondLargest = largest;
    			largest = n[i];
     
    		} else if (n[i] > secondLargest) {
    			secondLargest = n[i];
    	}
    }
        System.out.println("\nFirst largest number is:" + largest);
        System.out.println("\nSecond largest number is:" + secondLargest);		

    }
}

