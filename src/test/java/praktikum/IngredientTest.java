package praktikum;

import org.junit.Assert;
import org.junit.Test;

public class IngredientTest {

    @Test
    public void getNameReturnCorrectValue() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "ketchup", 50.5f);
        Assert.assertEquals("return incorrect value", "ketchup", ingredient.getName());
    }

    @Test
    public void getPriceReturnCorrectValue() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "ketchup", 50.5f);
        Assert.assertEquals("return incorrect value", 50.5f, ingredient.getPrice(), 0.0f);
    }

}
