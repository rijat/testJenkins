package com.jenkins.formation;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.jenkins.formation.Calcul;

public class CalculTest{
	
	@Test
	public void testCalculerSom() throws Exception {
		assertEquals(2, Calcul.calculerSom(1,1));
		assertNotEquals(3, Calcul.calculerSom(1,1));
	}
	@Test
	public void testCalculerDiff() throws Exception {
		assertEquals(2, Calcul.calculerDiff(3,1));
	}
	@Test
	public void testCalculerDiv() throws Exception {
		assertNotEquals(1, Calcul.calculerDiv(4,0));
	}


}
