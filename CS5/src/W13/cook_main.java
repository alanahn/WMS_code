package W13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class RecipeBot {
    private List<Recipe> recipes;
    
    public RecipeBot() {
        recipes = new ArrayList<>();
        initalizeRecipes();
    }

    private void initalizeRecipes() {
        List<Ingredient> pastaIngredients = new ArrayList<>();
        pastaIngredients.add(new Ingredient("파스타면", "200g"));
        pastaIngredients.add(new Ingredient("올리브 오일", "2큰술"));
        pastaIngredients.add(new Ingredient("마늘", "3쪽"));
        pastaIngredients.add(new Ingredient("토마토 소스", "1컵"));

        List<CookingStep> pastaCookingSteps = new ArrayList<>();
        pastaCookingSteps.add(new CookingStep("파스타 면을 끓는 물에 10분간 삶습니다."));
        pastaCookingSteps.add(new CookingStep("팬에 올리브 오일을 두르고 마늘을 볶습니다."));
        pastaCookingSteps.add(new CookingStep("토마토 소스를 팬에 붓고 끓입니다."));
        pastaCookingSteps.add(new CookingStep("삶은 파스타 면을 팬에 넣고 섞습니다."));

        recipes.add(new Recipe("파스타", pastaIngredients, pastaCookingSteps));

        // 더 추가할 수 있다.
    }

    public Recipe findRecipeByName(String name) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().equalsIgnoreCase(name)) {
                return recipe;
            }
        }
        return null;
    }

    public void printRecipe(Recipe recipe) {
        System.out.println("요리 이름 : " + recipe.getName());
        System.out.println("재료 : ");

        for (Ingredient ingredient : recipe.getIngredient()) {
            System.out.println("- " + ingredient);
        }

        System.out.println("조리 단계 : ");
        for (CookingStep step : recipe.getSteps()) {
            System.out.println("- " + step);
        }
    }
}

public class cook_main {
    public static void main(String[] args) {
        System.out.println("-----요리 알려주는 봇------");

        Scanner sc = new Scanner(System.in);
        RecipeBot bot = new RecipeBot();

        System.out.print("1. 요리 알려주기, 2.맛집 알려주기 : ");
        int num = sc.nextInt();
        sc.nextLine();

        switch (num) {
            case 1:
                System.out.println("요리 알려주기");
                System.out.println("원하는 메뉴를 입력하세요.");
                String input = sc.nextLine();

                Recipe recipe = bot.findRecipeByName(input);
                if (recipe != null) {
                    bot.printRecipe(recipe);
                } else {
                    System.out.println("해당 메뉴는 찾을 수 없습니다.");
                }
                break;
            case 2:
                System.out.println("맛집 알려주기");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;
        }

        sc.close();
    }
}
