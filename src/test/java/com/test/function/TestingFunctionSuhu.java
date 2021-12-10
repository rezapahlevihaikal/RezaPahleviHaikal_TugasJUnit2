package com.test.function;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junitparams.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.juaracoding.tugas.function.FungsiSuhu;

@RunWith(JUnitParamsRunner.class)
public class TestingFunctionSuhu {
	FungsiSuhu suhu;

	@Before
	public void setUp() throws Exception {
		suhu = new FungsiSuhu();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/data_konversi_suhu.csv")
	public final void testSuhuKonverter(double fahrenheit, double hasil) {
	//		fail("Not yet implemented"); // TODO
			assertEquals(hasil, suhu.suhuKonverter(fahrenheit), 0.0001);
	}

}
