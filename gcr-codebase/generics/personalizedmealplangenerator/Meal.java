package personalizedmealplangenerator;

public class Meal <T extends MealPlan>{

    private T meal;

    public Meal(T meal){
        this.meal = meal;
    }

    public void serve(){
        System.out.println("serving " + meal.getMealType());
        meal.showMeal();
    }
    }