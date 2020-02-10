package Structural.Flyweight;


import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private Map<String, ConcreteIngredient> ingredients =
            new HashMap<String, ConcreteIngredient>();

    public ConcreteIngredient lookup(String ingredientName){
        if(!ingredients.containsKey(ingredientName))
            ingredients.put(ingredientName,
                            new ConcreteIngredient(ingredientName));
        return ingredients.get(ingredientName);
    }

    public int countIngredients(){
        return ingredients.size();
    }
}
