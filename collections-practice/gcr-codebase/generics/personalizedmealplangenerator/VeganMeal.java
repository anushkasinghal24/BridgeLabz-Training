package personalizedmealplangenerator;

public class VeganMeal implements MealPlan{

    @Override

    public String getMealType(){
        return "Vegan Meal";
    }

    @Override

    public void showMeal(){
        System.out.println("meal : vegetables, brown rice, fruits, tofu");
    }
}