package Hilos;

public class HiloSuma extends Thread{

	private int re,i,n,k;
	
	public HiloSuma(int k, int n) {
		this.n = n;
		this.k = k;
	}
	
	
	public void run() {
		for(i=k; i<n; i++) {
			re+=i;
		}
	}
	
	public int RE() {
		return re;
	}
}
