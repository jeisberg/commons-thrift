package com.lockerz.thrift.commons;

import junit.framework.*;
import com.lockerz.thrift.commons.utilities.Utilities;

public class CommonsTest extends TestCase {

	public void test() {
		// test here
		assertTrue(Utilities.isNullOrEmpty(null));
		// test here
		assertTrue(Utilities.isNullOrEmpty(""));
		// test here
		assertFalse(Utilities.isNullOrEmpty("test"));
	}
}