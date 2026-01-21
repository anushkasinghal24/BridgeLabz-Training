package personalizedmealplangenerator;

public class KetoMeal implements MealPlan{

    @Override

    public String getMealType(){
        return "Keto Meal";
    }

    @Override

    public void showMeal(){
        System.out.println("meal : eggs, cheese, nuts....");
    }
}