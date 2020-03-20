package visitorPattern;

import visitorPattern.visitor.ComputerPartsVisitor;

public class Mouse implements ComputerParts{

	@Override
	public void accept(ComputerPartsVisitor computerPartsVisitor) {
		computerPartsVisitor.visit(this);
		
	}

}
