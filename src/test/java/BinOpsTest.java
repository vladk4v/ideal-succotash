import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BinOpsTest {

	@ParameterizedTest
	@CsvSource(value = {
			"110, 101, 1011",
			"100011, 101101, 1010000"
	})
	void sumTest(String a, String b, String c) {
		BinOps bn = new BinOps();
		assertEquals(c, bn.sum(a, b));
	}

	@ParameterizedTest
	@CsvSource(value = {
			"110, 101, 11110",
			"100011, 101101, 11000100111"
	})
	void multTest(String a, String b, String c) {
		BinOps bn = new BinOps();
		assertEquals(c, bn.mult(a, b));
	}
}