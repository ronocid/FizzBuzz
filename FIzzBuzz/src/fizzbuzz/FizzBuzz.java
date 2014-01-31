package fizzbuzz;


public class FizzBuzz {

    private static final String FIZZ_BUZZ = "FizzBuzz";
	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";

	public static String dice(Integer numero) {
        return  comprobarNumeroYDevolverValorCorrecto(numero);
    }

	private static String comprobarNumeroYDevolverValorCorrecto(Integer numero) {
		String dato;
		
		if(numero%3==0 && numero%5 == 0){
			dato = FIZZ_BUZZ;
		}else if (numero%3==0) {
            dato = FIZZ;
        } else if (numero%5 == 0) {
            dato = BUZZ;
        } else{
            dato = String.valueOf(numero);
        }
		return dato;
	}
}
