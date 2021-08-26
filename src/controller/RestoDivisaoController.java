package controller;

public class RestoDivisaoController {
	
	public RestoDivisaoController() {
		super();
	}
	
	public double mod(double numero, double numerocont) {
		//Condição de parada = se o numero dividido por 10, tiver resto 0 
	 if (numero == 0) {
      return 0;	     
	 }else {
		 if (numero % 10 == numerocont)
			 return 1 + mod(numero / 10, numerocont);
		 else
				 return mod(numero / 10, numerocont);
	 }
	 
}
}