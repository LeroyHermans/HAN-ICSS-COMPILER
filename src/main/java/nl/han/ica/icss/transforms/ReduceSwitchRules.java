package nl.han.ica.icss.transforms;

import nl.han.ica.icss.ast.*;
import java.util.HashMap;

public class ReduceSwitchRules implements Transform {

    private HashMap<String, ConstantDefinition> symboltable;

    @Override
    public void apply(AST ast) {
        symboltable = ast.symboltable;

        // Loop through the children and transform the Stylerules.
        // If a Switchrule is found, convert it to a styleRule
        for (int i = 0; i < ast.root.getChildren().size(); i++) {
            if (ast.root.getChildren().get(i) instanceof Switchrule)
                ast.root.getChildren().set(i, replaceWithStylerule((Switchrule) ast.root.getChildren().get(i)));
        }
    }

    /**
     * Transforms a Switch Rule to a Stylerule
     * @param switchrule
     * @return
     */
    private Stylerule replaceWithStylerule(Switchrule switchrule) {
        Stylerule stylerule = new Stylerule();
        stylerule.selector = switchrule.selector;

        Expression match = switchrule.match;
        int value = toInt(symboltable.get(((ConstantReference) match).name).expression.toString()) ;

        for (SwitchValueCase valueCase : switchrule.valueCases) {
            if (value == toInt(valueCase.value.toString())){
                stylerule.body = valueCase.body;
            }
        }
        // If we did not find a matching value case, use the default case
        if (stylerule.body.size() == 0)
            stylerule.body = switchrule.defaultCase.body;

        return stylerule;
    }

    private int toInt(String value){
        return Integer.parseInt(value);
    }
}
