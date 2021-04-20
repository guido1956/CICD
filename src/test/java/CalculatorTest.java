import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testen calculator")
class CalculatorTest {

    @Test
    @DisplayName("Vermenigvuldigen twee positieve getallen")
    public void test_twee_positieve_getallen() {
        Calculator calculator = new Calculator();
        int getal1 = 20;
        int getal2 = 30;
        int verwachtResultaat = 600;
        int resultaat = calculator.vermenigvuldig(getal1,getal2);
        assertEquals(verwachtResultaat, resultaat, "vermenigvuldiging: twee positieve getallen niet juist");
    }
}



