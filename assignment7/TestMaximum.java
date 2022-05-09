class Maximum{
	public static <T extends Comparable> T findMax(T arr[]){
		T max = arr[0];
		for (int i = 1; i < arr.length; i++){
			if (arr[i].compareTo(max) > 0){
				max = arr[i];
			}
		}
		return max;
	}
}

public class TestMaximum{
	public static void main(String []args){
		Integer a[] = {23,12,34,12,5,6,45,23};
		System.out.println("Maximum element is " + Maximum.findMax(a));
		String b[] = {"Java","C++","Django","C","Python"};
		System.out.println("Maximum element is " + Maximum.findMax(b));
	}
}
