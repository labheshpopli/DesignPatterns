package visitorPattern.visitor;

import visitorPattern.Computer;
import visitorPattern.Keyboard;
import visitorPattern.Mouse;

public class ComputerPartsVisitorImpl implements ComputerPartsVisitor{
	
	public void visit(Computer computer) {
		System.out.println("computer");
	}
	public void visit(Keyboard keyboard) {
		System.out.println("keyboard");
	}
	public void visit(visitorPattern.Monitor monitor) {
		System.out.println("monitor");
	}
	public void visit(Mouse mouse) {
		System.out.println("mouse");
	}
}
