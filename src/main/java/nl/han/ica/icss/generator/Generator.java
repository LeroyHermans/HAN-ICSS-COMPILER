package nl.han.ica.icss.generator;

import nl.han.ica.icss.ast.*;
import java.util.ArrayList;

public class Generator {

	public String generate(AST ast) {
        StringBuilder builder = new StringBuilder();

        for(ASTNode node : ast.root.getChildren()){
        	if(node instanceof Stylerule){
        		addStyleRule((Stylerule) node, builder, "");
			}
		}

		return builder.toString();
	}

	private void addStyleRule(Stylerule stylerule, StringBuilder builder, String prefix) {
		builder.append(prefix)
				.append(stylerule.selector.toString())
				.append(" {")
				.append(System.lineSeparator());
		for(ASTNode node : stylerule.getChildren()){
			if(node instanceof Declaration){
				addDeclaration((Declaration) node, builder);
			}
		}
		builder.append('}')
				.append(System.lineSeparator());
	}

	private void addDeclaration(Declaration declaration, StringBuilder builder) {
		builder.append("    ")
				.append(declaration.property)
				.append(": ")
				.append(declaration.expression.toString())
				.append(";")
				.append(System.lineSeparator());
	}
}
