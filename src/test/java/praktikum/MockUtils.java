package praktikum;

import org.mockito.Mockito;

public class MockUtils {

    public static Bun getBunMock(String name, float price) {
        Bun bun = Mockito.mock(Bun.class);
        Mockito.when(bun.getName()).thenReturn(name);
        Mockito.when(bun.getPrice()).thenReturn(price);
        return bun;
    }

    public static Ingredient getIngredientMock(IngredientType type, String name, float price) {
        Ingredient ingredient = Mockito.mock(Ingredient.class);
        Mockito.when(ingredient.getType()).thenReturn(type);
        Mockito.when(ingredient.getName()).thenReturn(name);
        Mockito.when(ingredient.getPrice()).thenReturn(price);
        return ingredient;
    }

}
