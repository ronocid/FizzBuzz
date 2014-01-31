package fizzbuzz;

import static org.junit.Assert.*;


public class Test {

	@org.junit.Test
	public void test() {
		
	}
	
	@org.junit.Test
    public void digo1ymedevuelve1() throws Exception {
        //Arrange
        final String expected = "1";
        //Act
        String result = FizzBuzz.dice(1);
        //Assert
        assertEquals("no devuelve 1", expected, result);
    }

	@org.junit.Test
    public void digo2YMeDevuelve2() throws Exception {
        //Arrange
        final String expected = "2";
        //Act
        String result = FizzBuzz.dice(2);
        //Assert
        assertEquals("no devuelve 2", expected, result);
    }

	@org.junit.Test
    public void digo3YMeDevuelveFizz() throws Exception {
        //Arrange
        final String expected = "Fizz";
        //Act
        String result = FizzBuzz.dice(3);
        //Assert
        assertEquals("no devuelve Fizz", expected, result);
    }

	@org.junit.Test
    public void digoNumeroYMeDevuelveNumero() throws Exception {
        //Arrange
        final String expected = "4";
        //Act
        String result = FizzBuzz.dice(4);
        //Assert
        assertEquals("no devuelve 4", expected, result);
    }

	@org.junit.Test
    public void digo5YMeDevuelveBuzz() throws Exception {
        //Arrange
        final String expected = "Buzz";
        //Act
        String result = FizzBuzz.dice(5);
        //Assert
        assertEquals("no devuelve Buzz", expected, result);
    }
	
	@org.junit.Test
    public void digo15YMeDevuelveFizzBuzz() throws Exception {
        //Arrange
        final String expected = "FizzBuzz";
        //Act
        String result = FizzBuzz.dice(15);
        //Assert
        assertEquals("no devuelve Buzz", expected, result);
    }

}
