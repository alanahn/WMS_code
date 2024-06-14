package W13;

import java.util.List;

public class Recipe {
    private String name;
    private List<Ingredient> ingredient;
    private List<CookingStep> steps;
    private int age;

    public Recipe(String name, List<Ingredient> ingredient, List<CookingStep> steps, int age) {
        this.name = name;
        this.ingredient = ingredient;
        this.steps = steps;
        this.age = age;
    }

    public void age_plus() {
        this.age += 1;
    }
    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredient() {
        return ingredient;
    }

    public List<CookingStep> getSteps() {
        return steps;
    }
}
