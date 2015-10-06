package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import unit.conversion.visitorPattern.strategyPattern.degreeConversionStrategy.ConvertRadianToDegree;

public class RadianToDegreeTest {

	@Test
	public void testRadianToDegreeConversion() {
		ConvertRadianToDegree aValue = new ConvertRadianToDegree();
		assertEquals(aValue.convert(50), 2864.7889756541163, 0.001);
		
		ConvertRadianToDegree anotherValue = new ConvertRadianToDegree();
		assertEquals(anotherValue.convert(33.3), 1907.949457785641, 0.001);
	}

}
