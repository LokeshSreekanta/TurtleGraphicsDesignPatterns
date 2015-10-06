import turtle.Turtle;
import turtle.interpreterPattern.visitorPattern.CommandExecuteVisitor;
import turtle.interpreterPattern.visitorPattern.CommandTotalDistanceVisitor;

public class TurtleClient {
	public static void main(String[] args) {
		Turtle aTurtle = new Turtle("turtleProgram4.txt");
		aTurtle.accept(new CommandExecuteVisitor(), aTurtle);
		System.out.println(aTurtle.getLocation().getX());
		System.out.println(aTurtle.getLocation().getY());
		
		Turtle anotherTurtle = new Turtle("turtleProgram4.txt");
		anotherTurtle.accept(new CommandTotalDistanceVisitor(), anotherTurtle);
		System.out.println(anotherTurtle.getLocation().getX());
		System.out.println(anotherTurtle.getLocation().getY());
		
	}
}
