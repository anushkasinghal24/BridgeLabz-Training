package personalizedmealplangenerator;

public class HighProteinMeal implements MealPlan{

    @Override

    public String getMealType(){
        return "High protien meal";
    }

    @Override

    public void showMeal(){
        System.out.println("meal : eggs, chicken, milk,..");
    }
}