package unit.conversion.visitorPattern;

import unit.Degree;
import unit.Radian;

public class UnitConversionVisitor implements IUnitVisitor {
	@Override
	public double visit(Degree aDegree) {
		return aDegree.getConversionBehaviour().convert(aDegree.getValue());
	}

	@Override
	public double visit(Radian aRadian) {
		return aRadian.getConversionBehaviour().convert(aRadian.getValue());
	}

}
