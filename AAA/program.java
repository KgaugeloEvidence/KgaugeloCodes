import java.util.*; 
import java.util.Random;
import java.time.Duration;
import java.time.Instant;


public class program {
	

	public static ArrayList<Integer>generateRandomNums(int n,ArrayList<Integer>myList){
		
		for(int i =0; i<n;i++){
			myList.add(i+1);
		}
		Collections.shuffle(myList);		
		return myList;
	}
	public static ArrayList<Integer>generateIncreasingNums(int n,ArrayList<Integer>myList){
		
		for(int i =0; i<n;i++){
			myList.add(i+1);
		}		
		return myList;
	}
	public static int linearSearch(int key, ArrayList<Integer>myList){
		int i=0;
		while(key!=myList.get(i)){
        		i++;
        		if(i==myList.size()-1){
        			break;
        		}
        	}
        	if(key==myList.get(i)){
        		return myList.get(i);	
        	}
        	else{
        		return -1;
        	}
        	
	}
	public static void printArray(ArrayList<Integer>arr){
		int count = 10;
		for(int i=0; i<arr.size();i++){
			System.out.print(arr.get(i)+" ");
			
			if(i==count){
				count=count+10;
				System.out.println();
			}
		}
		System.out.println();
	}
	public static void main(String args[]){
	
        ArrayList<Integer>myList = new ArrayList<Integer>();
        ArrayList<Integer>myList2 = new ArrayList<Integer>();
        
        Scanner in = new Scanner(System.in);
        int input = Integer.parseInt(in.nextLine());
        int key = Integer.parseInt(in.nextLine());
        
       myList = generateRandomNums(input,myList);
       myList2 = generateIncreasingNums(input,myList2);
      	
      	Instant start = Instant.now();
      	int k = linearSearch(key,myList);
      	Instant end = Instant.now();
      	
      	Instant start2 = Instant.now();
      	int j = linearSearch(key,myList2);
      	Instant end2 = Instant.now();
      	
	Duration timeElapsed = Duration.between(start, end);
	Duration timeElapsed2 = Duration.between(start2, end2);
      	//printArray(myList);
      	System.out.println("Time taken in milliseconds for shuffled: "+timeElapsed.toMillis());
      	System.out.println("Time taken in milliseconds for sorted: "+timeElapsed2.toMillis());
    }
}
