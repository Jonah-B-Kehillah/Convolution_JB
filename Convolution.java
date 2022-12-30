public class Convolution {
	public static int[] convolve(int[] f, int[] g) {
		if(f.length == 0|| g.length == 0) return new int[] {};
		int[] output = new int[f.length + g.length - 1];
		for(int i = 0; i < f.length; i++) for(int j = 0; j < g.length; j++) {
			output[i+j] += f[i] * g[j];
		}
		return output;
	}
}
