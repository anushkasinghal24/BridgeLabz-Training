package personalizedmealplangenerator;

public class VegMeal implements MealPlan{

    @Override

    public String getMealType(){
        return "Veg Meal";
    }

    @Override

    public void showMeal(){
        System.out.println("meal : roti, daal, rice, salad, vegetables, paneer");
    }
}
