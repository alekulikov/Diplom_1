package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class IngredientTypeTest {

    private final IngredientType ingredientType;

    public IngredientTypeTest(IngredientType ingredientType) {
        this.ingredientType = ingredientType;
    }

    @Parameterized.Parameters
    public static Object[] data() {
        return new Object[]{
                IngredientType.FILLING,
                IngredientType.SAUCE
        };
    }

    @Test
    public void getTypeReturnCorrectValue() {
        Ingredient ingredient = new Ingredient(ingredientType, "ingredient", 77.7f);
        Assert.assertEquals("return incorrect value", ingredientType, ingredient.getType());
    }
}