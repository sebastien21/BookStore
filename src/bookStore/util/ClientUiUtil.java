package bookStore.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * client ui util
 * @author acmil
 *
 */
public class ClientUiUtil {
	
	//system out
	public static void systemOut(String message) {
		System.out.println(message);
	}
	
	/**
	 * currency: rmb
	 * rounding method: down
	 * scale after integer: 2
	 */
	public static BigDecimal rounding(BigDecimal money) {
		BigDecimal roundingResult = money.setScale(2, RoundingMode.DOWN);
		return roundingResult;
	}
	
}
