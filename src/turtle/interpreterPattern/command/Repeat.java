package turtle.interpreterPattern.command;

import turtle.Turtle;
import turtle.interpreterPattern.visitorPattern.ICommandVisitor;

public class Repeat extends Command {
	private int count;

	public Repeat(int count) {
		this.setCount(count);
	}

	@Override
	public String type() {
		return "repeat";
	}

	@Override
	public void execute(Turtle aTurtle) {
		// Note: This functionality does nothing for now.
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public void accept(ICommandVisitor anICommandVisitor, Turtle aTurtle) {
		anICommandVisitor.visit(this, aTurtle);
	}
}
