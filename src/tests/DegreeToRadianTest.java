package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import unit.conversion.visitorPattern.strategyPattern.degreeConversionStrategy.ConvertDegreeToRadian;

public class DegreeToRadianTest {

	@Test
	public void testDegreeToRadianConversion() {
		ConvertDegreeToRadian aValue = new ConvertDegreeToRadian();
		assertEquals(aValue.convert(30.0), 0.5235987755982988, 0.001);
		
		ConvertDegreeToRadian anotherValue = new ConvertDegreeToRadian();
		assertEquals(anotherValue.convert(82.87), 1.446354351127701, 0.001);
	}

}
