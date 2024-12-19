package Hilos;

public class HiloMultiplicación extends Thread{

	private int r,i,n,k;
	
	public HiloMultiplicación(int k, int n) {
		this.n = n;
		this.k = k;
	}
	
	public void run() {
		for(i=k; i<n; i++) {
			r=r*i;
		}
	}
	
	public int R() {
		return r;
	}
}
