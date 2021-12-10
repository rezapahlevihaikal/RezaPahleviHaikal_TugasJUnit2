package com.test.function;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junitparams.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.juaracoding.tugas.function.FungsiAirKolam;


@RunWith(JUnitParamsRunner.class)
public class TestingFunctionAirKolam {
	
	FungsiAirKolam airKolam;
	
	@Before
	public void setUp() throws Exception {
		airKolam = new FungsiAirKolam();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/data_keliling_kolam_air.csv")
	public final void testHitungKeliling(double panjang, double lebar, double tinggi, double hasil) {
//		fail("Not yet implemented"); // TODO
		assertEquals(hasil, airKolam.hitungKeliling(panjang, lebar, tinggi), 0.0001);
	}

	@Test
	@FileParameters("src/test/resources/data_volume_kolam_air.csv")
	public final void testHitungVolume(double panjang, double lebar, double tinggi, double hasil) {
//		fail("Not yet implemented"); // TODO
		assertEquals(hasil, airKolam.hitungVolume(panjang, lebar, tinggi), 0.0001);
		
	}

}
