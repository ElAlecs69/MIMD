package Hilos;

public class prueba {

	public static void main(String[] args) {
		
		int a = 6;
		
		HiloSuma HS1 = new HiloSuma(1, a/2);
		HiloSuma HS2 = new HiloSuma((a/2)+1, a);
		
		HiloMultiplicación HM1 = new HiloMultiplicación(1, a/2);
		HiloMultiplicación HM2= new HiloMultiplicación((a/2)+1, a);
		
		HS1.start();
		HS2.start();
		
		HM1.start();
		HM2.start();
		
try {
		HS1.join();
		HS2.join();
		
		HM1.join();
		HM2.join();
		
}catch(InterruptedException e){
	e.printStackTrace();
}

int TS = HS1.RE()+HS2.RE();
int TM = HM1.R()+HM2.R();

System.out.println("Resultado HS "+TS);
System.out.println("Resultado HM "+TM);
	}

}
