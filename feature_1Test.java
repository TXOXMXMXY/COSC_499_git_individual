import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class feature_1Test {
String result ="29282726242315";
feature_1 A= new feature_1();
	@Test
	public void test() {
		assertEquals(result,A.print());
	}
}
