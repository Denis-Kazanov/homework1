import junit.framework.TestCase;
import lesson12.CalculateDrob;
import lesson12.FractionNumber;
import lesson12.FractionNumberIml;
import org.junit.Test;

public class FraztionNumberTest extends TestCase {
    @Test
    public void testAdd(){
        FractionNumberIml num1 = new FractionNumberIml(2, 5);
        FractionNumberIml num2 = new FractionNumberIml(1, 7);
        CalculateDrob cal = new CalculateDrob();
        FractionNumber resultFact = cal.add(num1,num2);
        FractionNumberIml resultTrue = new FractionNumberIml(19, 35);

        assertEquals(resultFact, resultTrue);
    }
}
