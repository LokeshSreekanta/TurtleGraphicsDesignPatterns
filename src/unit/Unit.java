package unit;

import unit.conversion.visitorPattern.IUnit;
import unit.conversion.visitorPattern.strategyPattern.degreeConversionStrategy.IConversionBehaviour;

public abstract class Unit implements IUnit {
	private double value;
	protected IConversionBehaviour conversionBehaviour;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public IConversionBehaviour getConversionBehaviour() {
		return conversionBehaviour;
	}

	public void setConversionBehaviour(IConversionBehaviour aConversionBehaviour) {
		this.conversionBehaviour = aConversionBehaviour;
	}
}
