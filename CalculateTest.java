package Calculate;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
    Calculate cal = new Calculate();
	@SuppressWarnings("deprecation")
	@Test
	public void testAdd() {
		int resluat = cal.add(1, 3);
		assertEquals(4,resluat);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testSubtration() {
		int resluat = cal.subtration(1, 3);
		assertEquals(-2,resluat);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testMultiplication() {
		int resluat = cal.multiplication(1, 3);
		assertEquals(3,resluat);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testDivision() {
		int resluat = cal.division(10, 5);
		assertEquals(2,resluat);
	}

}
