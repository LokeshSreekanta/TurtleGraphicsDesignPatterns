package unit.conversion.visitorPattern;

import unit.Degree;
import unit.Radian;

public interface IUnitVisitor {
	public double visit(Degree aDegree);

	public double visit(Radian aRadian);

}
