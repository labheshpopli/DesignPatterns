package visitorPattern;

import visitorPattern.visitor.ComputerPartsVisitor;

public class Keyboard implements ComputerParts{

	@Override
	public void accept(ComputerPartsVisitor computerPartsVisitor) {
		computerPartsVisitor.visit(this);
		
	}

}
