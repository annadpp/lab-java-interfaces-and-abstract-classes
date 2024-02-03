import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static double roundToNearestHundredth(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static BigDecimal reverseSignAndRound(BigDecimal number) {
        BigDecimal reversedNumber = number.negate();
        return reversedNumber.setScale(1, RoundingMode.HALF_UP);
    }
}
