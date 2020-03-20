package visitorPattern;

import visitorPattern.visitor.ComputerPartsVisitor;

public interface ComputerParts {
	
	public void accept(ComputerPartsVisitor computerPartsVisitor);
}