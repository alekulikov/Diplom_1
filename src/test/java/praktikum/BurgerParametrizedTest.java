package praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static java.lang.System.lineSeparator;
import static praktikum.IngredientType.*;
import static praktikum.MockUtils.*;

@RunWith(Parameterized.class)
public class BurgerParametrizedTest {

    private final Bun bun;
    private final List<Ingredient> ingredients;
    private final String expectedReceipt;
    private final float expectedPrice;
    private Burger burger;

    public BurgerParametrizedTest(Bun bun, List<Ingredient> ingredients, String expectedReceipt, float expectedPrice) {
        this.bun = bun;
        this.ingredients = ingredients;
        this.expectedReceipt = expectedReceipt;
        this.expectedPrice = expectedPrice;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {getBunMock("big bun", 100.0f),
                        List.of(getIngredientMock(SAUCE, "ketchup", 50.5f),
                                getIngredientMock(FILLING, "filling", 70.5f)),
                        "(==== big bun ====)" + lineSeparator()
                                + "= sauce ketchup =" + lineSeparator()
                                + "= filling filling =" + lineSeparator()
                                + "(==== big bun ====)" + lineSeparator()
                                + lineSeparator() + "Price: 321,000000" + lineSeparator(),
                        321.0f},
                {getBunMock("big bun", 100.0f),
                        List.of(getIngredientMock(SAUCE, "ketchup", 50.5f)),
                        "(==== big bun ====)" + lineSeparator()
                                + "= sauce ketchup =" + lineSeparator()
                                + "(==== big bun ====)" + lineSeparator()
                                + lineSeparator() + "Price: 250,500000" + lineSeparator(),
                        250.5f},
                {getBunMock("big bun", 100.0f), List.of(),
                        "(==== big bun ====)" + lineSeparator()
                                + "(==== big bun ====)" + lineSeparator()
                                + lineSeparator() + "Price: 200,000000" + lineSeparator(),
                        200.0f},
        };
    }

    @Before
    public void setUp() {
        burger = new Burger();
        burger.setBuns(bun);
        ingredients.forEach(ingredient -> burger.addIngredient(ingredient));
    }

    @Test
    public void getReceiptReturnCorrectValue() {
        Assert.assertEquals("receipt is incorrect", expectedReceipt, burger.getReceipt());
    }

    @Test
    public void getPriceReturnCorrectValue() {
        Assert.assertEquals("receipt is incorrect", expectedPrice, burger.getPrice(), 0.0f);
    }
}
