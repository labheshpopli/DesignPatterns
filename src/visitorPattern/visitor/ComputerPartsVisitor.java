package visitorPattern.visitor;

import visitorPattern.Computer;
import visitorPattern.Keyboard;
import visitorPattern.Mouse;

public interface ComputerPartsVisitor {

	public void visit(Computer computer);
	public void visit(Keyboard keyboard);
	public void visit(visitorPattern.Monitor monitor);
	public void visit(Mouse mouse);
}
