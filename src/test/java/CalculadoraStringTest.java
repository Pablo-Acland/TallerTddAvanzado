
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
}
