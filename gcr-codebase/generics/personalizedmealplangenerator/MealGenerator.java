package personalizedmealplangenerator;
public class MealGenerator{

    public static <T extends MealPlan> void generateMeal(T mealplan){

        System.out.println("Meal selected "+mealplan.getMealType());
        Meal<T> meal = new Meal<>(mealplan);
        meal.serve();
    }
}
