
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculadoraStringTest {
    public CalculadoraString CalculadoraStringInstance = new CalculadoraString();
    @Test
    public void VacioStringTest() throws Exception {
         Assertions.assertEquals(0, CalculadoraStringInstance.add(""));
    }

    @Test
    public void UnSoloNumeroRetornaValorTest() throws Exception {
        Assertions.assertEquals(2, CalculadoraStringInstance.add("2"));
        Assertions.assertEquals(1, CalculadoraStringInstance.add("1"));
    }

    @Test
    public void dosNumeroRetornaValoresSumadosTest() throws Exception {
        Assertions.assertEquals(4, CalculadoraStringInstance.add("2,2"));
        Assertions.assertEquals(3, CalculadoraStringInstance.add("2,1"));
        Assertions.assertEquals(6, CalculadoraStringInstance.add("2,4"));
    }

    @Test
    public void dosNumeroRetornaValoresSumadosSeparadosPorSaltoLineaTest() throws Exception {
        Assertions.assertEquals(4, CalculadoraStringInstance.add("2\n2"));
        Assertions.assertEquals(3, CalculadoraStringInstance.add("2\n1"));
        Assertions.assertEquals(6, CalculadoraStringInstance.add("2\n4"));
    }

    @Test
    public void dosNumeroRetornaValoresSumadosSeparadosPorCualquierCosaTest() throws Exception {
        Assertions.assertEquals(11, CalculadoraStringInstance.add("2\n7,2"));
        Assertions.assertEquals(6, CalculadoraStringInstance.add("3,2\n1"));
        Assertions.assertEquals(7, CalculadoraStringInstance.add("2\n1,4"));
    }
    @Test
    public void NumNegativoTest(){
        Assertions.assertThrows(Exception.class, ()->{CalculadoraStringInstance.add("-1,-1");});
    }
    @Test
    public void IgnoraSiEs1000Test() throws Exception {
        Assertions.assertEquals(2, CalculadoraStringInstance.add("2,1002"));
        Assertions.assertEquals(2, CalculadoraStringInstance.add("2,1100"));
        Assertions.assertEquals(2, CalculadoraStringInstance.add("2,4000"));
    }

    @Test
    public void SoloSePuedePonerCaracterDelimitadorEnElPrimeroTest() throws Exception {
        Assertions.assertEquals(2, CalculadoraStringInstance.add("#2#1002"));
    }

}
