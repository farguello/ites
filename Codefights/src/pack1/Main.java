package pack1;

public class Main {

	public static void main(String[] args) {
		
		int[] resultInt;
		boolean resultBool;
		String[] s = {"abc", 
					  "def",
					  "ghi",
					  "jkl"};
		
		int[] a = {1, 2, 3, 4, 5, 6};
		int[] b = {1, 3, 2, 6, 5, 4};
		
		
		Tests test = new Tests();
		
		resultBool = test.areSimilar(a, b);
		
		
		System.out.println("Resultado: ");
		System.out.println(resultBool);
		
	}

}
