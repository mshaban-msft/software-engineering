public class Functions
{
	public static boolean validInt(String numberAsString)
	{
		// process
		return true;
	}
}





public int isStepped(int[] arr){

	// keep track of each element (how many times it shows up)
	HashMap<Integer, Integer> counter = new HashMap<>();
	counter.put(arr[0], 1);

	// verify each ascending order, and keep track of count of each element
	for(int i = 1; i < arr.length; i++)
	{
		// ascending condition violated
		if(arr[i] < arr[i-1]){
			return 0;
		}
		// store in map
		if(map.containsKey(arr[i])){
			map.put(arr[i], map.get(arr[i]) + 1); // increment counter if element exists
		}else{
			map.put(arr[i], 1);
		}
	}

	// make sure all counters are greater than 3
	for(int value : counter.values()){
		if(value < 3){
			return 0;
		}
	}

	// passed all requirements
	return 1;
}


HashMap<String, Integer> map = new HashMap<>();
map.put("vishal", 10); 
map.containsKey("vishal");
map.clear();









public int isPairedN(int[ ] arr, int n){
	
	// edge cases
	if(arr.length == 0 || arr.length * 2 < n){
		return 0;
	}

	// search for elements
	for(int i = 0; i < arr.length; i++)
	{
		j = n - i;
		if(j < arr.length && arr[i] + arr[j] == n){
			return 1;
		} 
	}

	return 0;
}




public int isDigitIncreasing(int n){
	for(int i = 1; i <= 9; i++)
	{
		int sum = 0;
		int counter = 1;
		while(sum <= n){
			int nn = generateNN(i, counter);
			sum += nn;
			if(sum == n){
				return 1;
			}
			counter++;
		}
	}
	return 0;
}


public int generateNN(int n, int repetitions){
	int result = 0;
	int counter = 1;
	while(counter <= repetitions){
		result *= 10;
		result += n;
		counter++;
	}
	return result;
}