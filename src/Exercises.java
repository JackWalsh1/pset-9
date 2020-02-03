import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) { //SOLVED
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}
		
		if (a.get(0) == b.get(0) || a.get(a.size() - 1) == b.get(b.size() - 1)) {
			return true;
		}
	
		return false;
	}
	
	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {

		if (values == null || values.size() < n || n < 0) {
			return new ArrayList<String>();
		}

		ArrayList<String> endsOnly = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			endsOnly.add(values.get(i));
		}

		for (int i = 0; i < n; i++) {
			endsOnly.add(values.get(values.size() - n + i));
		}

		if (endsOnly.size() != 0) {
			return endsOnly;
		}
		
		return new ArrayList<String>();	// default return value to ensure compilation
	}
	
	public int difference(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 1) {
			return -1;
		}

		int smallestValue = Integer.MAX_VALUE;
		int largestValue = Integer.MIN_VALUE;

		for (int number : numbers) {
			if (number < smallestValue) {
				smallestValue = number;
			} 
			if (number > largestValue) {
				largestValue = number;
			}
		}

		if (smallestValue != Integer.MAX_VALUE) {
			return (largestValue - smallestValue);
		}

		return -1;		// default return value to ensure compilation
	}


	public double biggest(ArrayList<Double> numbers) {
		if (numbers == null || numbers.size() < 3 || numbers.size() % 2 == 0) {
			return -1;
		} else {
			for (int i = 0; i < numbers.size(); i++) {
				if (numbers.get(i) < 0) {
					return -1;
				}
			}
		}

		double firstNumber = numbers.get(0);
		double middleNumber = numbers.get((numbers.size() - 1) / 2);
		double lastNumber = numbers.get(numbers.size() - 1);

		if (firstNumber >= middleNumber) {
			if (firstNumber >= lastNumber) {
				return firstNumber;
			} else  {
				return lastNumber;
			}
		} else {
			if (middleNumber >= lastNumber) {
				return firstNumber;
			} else  {
				return lastNumber;
			}
		}
	}
	
	public ArrayList<String> middle(ArrayList<String> values) {
		if (values == null || values.size() < 3 || values.size() % 2 == 0) {
			return new ArrayList<String>();
		} else {
			for (int i = 0; i < values.size(); i++) {
				if (values.get(i) == null) {
					return new ArrayList<String>();
				}
			}
		}

		ArrayList<String> middleElements = new ArrayList<String>();
				
		for (int i = -1; i < 2; i++) {
			middleElements.add(values.get(values.size()/2 + i));
		}
		
		return middleElements;

	}

	public boolean increasing(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3) {
			return false;
		}

		for (int i = 0; i < numbers.size() - 2; i++) {
			int firstNumber = numbers.get(i);
			int secondNumber = numbers.get(i + 1);
			int thirdNumber = numbers.get(i + 2);
			if (secondNumber - firstNumber == thirdNumber - secondNumber && firstNumber < secondNumber) {
				return true;
			}
		}
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		if (numbers == null || numbers.size() < 1) {
			return false;
		}

		for (int i = 0; i < numbers.size() - 2; i++) {
			if (!(numbers.get(i) == x || numbers.get(i + 2) == x || numbers.get(i + 1) == x) ) {
				return false;
			}
		}

		if (numbers.get(numbers.size() - 1) == x || numbers.get(numbers.size() - 2) == x) { //edge case 
			return true;
		}

		return (false);	// default return value to ensure compilation
	}
	
	public boolean consecutive(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3) {
			return false;
		}

		for (int i = 0; i < numbers.size() - 2; i++) {
			if ((numbers.get(i) % 2 == numbers.get(i + 1) % 2) && (numbers.get(i + 1) % 2 == numbers.get(i + 2) % 2)) {
				return true;
			}
		}

		return false;// default return value to ensure compilation
	}
	
	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(ArrayList<String> values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
