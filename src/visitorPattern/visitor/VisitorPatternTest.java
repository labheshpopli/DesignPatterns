package visitorPattern.visitor;

import visitorPattern.Computer;
import visitorPattern.ComputerParts;

public class VisitorPatternTest {
	
	public static void main(String[] args) {
		
		ComputerParts computer = new Computer();
		computer.accept(new ComputerPartsVisitorImpl());
	}
	
}
