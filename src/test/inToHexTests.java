package test;
import static org.junit.Assert.*;
import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;
import intToHex.ToHex;

/**
 * 测试用例
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>succez</p>
 * @author 刘永卓
 * @createdate 2019年4月30日
 */
public class inToHexTests {

	@Test
	public void testToHex() {
		String str = ToHex.intToHex(123456).toString();
		assertTrue("1E240".equals(str));
	}
	@Test
	public void testToHex2() {
		String str = ToHex.intToHex(0).toString();
		assertTrue("0".equals(str));
	}
	@Test
	public void testInput1() {
		Scanner sc=new Scanner("ASFAS");
		assertEquals(-1,ToHex.input(sc));
	}
	@Test
	public void testInput2() {
		Scanner sc2=new Scanner("1234");
		assertEquals(1234,ToHex.input(sc2));
	}
}
