import java.util.Arrays;

public class Main {
	static int passes = 0;
	static int fails = 0;
	
	private static void testC(int[] a, int[] b, int[] expected) { //test convolution
		int[] t = Convolution.convolve(a,b);
		if(Arrays.equals(t, expected)) {
			System.out.printf("Test #%s passed%n", (++passes) + fails);
		}
		else{
			System.err.printf("Test #%s failed%n", (++fails) + passes);
		}
	}
	
	public static void main(String[] args) {
		
		testC(new int[] {1,2,3}, new int[] {4,5,6}, new int[] {4, 13, 28, 27, 18});
		testC(new int[] {1,2}, new int[] {3,4}, new int[] {3,10,8});
		testC(new int[] {4,1,9,8}, new int[] {3,1,2,6,4}, new int[] {12,7,36,59,48,74,84,32});
		testC(new int[] {9,9,9}, new int[] {9,9,9}, new int[] {81,162,243,162,81});
		testC(new int[] {1}, new int[] {1}, new int[] {1});
		testC(new int[] {}, new int[] {}, new int[] {});
		testC(new int[] {12,7,36,59,48,74,84,32}, new int[] {81,162,243,162,81}, new int[] {972,2511,6966,14256,24300,34506,42930,46737,41472,27378,11988,2592});
		testC(new int[] {1, 2, 4, 8, 16},  new int[] {}, new int[] {});
		
		System.out.printf("Tests passed: %s, tests failed: %s, total tests: %s%n", passes, fails, passes+fails);
	}
	
}
