package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    @Mock
    private Bun bun;
    @Mock
    private Ingredient ingredientFirst;
    @Mock
    private Ingredient ingredientSecond;

    @Test
    public void setBunsCorrectSetValue() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        Assert.assertEquals("was set incorrect bun", bun, burger.bun);
    }

    @Test
    public void addIngredientAddValue() {
        Burger burger = new Burger();
        burger.addIngredient(ingredientFirst);
        Assert.assertEquals("ingredient not added", ingredientFirst, burger.ingredients.get(0));
    }

    @Test
    public void removeIngredientRemoveValue() {
        Burger burger = new Burger();
        burger.addIngredient(ingredientFirst);
        burger.removeIngredient(0);
        Assert.assertTrue("ingredient not removed", burger.ingredients.isEmpty());
    }

    @Test
    public void moveIngredientMoveValue() {
        Burger burger = new Burger();
        burger.addIngredient(ingredientFirst);
        burger.addIngredient(ingredientSecond);
        burger.moveIngredient(0, 1);
        Assert.assertEquals("ingredient not move on new position", 1, burger.ingredients.indexOf(ingredientFirst));
    }
}
