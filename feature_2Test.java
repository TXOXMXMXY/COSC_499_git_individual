import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class feature_2Test {
feature_2 A = new feature_2();

String test = "ABCDEDEFDEFGHFFGGHIH";

	@Test
	void test() {
		assertEquals(test,A.display());
	}

}
