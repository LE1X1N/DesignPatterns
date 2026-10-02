package Creational.Builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        // build VegMeal
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal: ");
        vegMeal.showItems();
        System.out.println("\nTotal Cost: " + vegMeal.getCost());

        // build NonVegMeal
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\nNon Veg Meal: ");
        nonVegMeal.showItems();
        System.out.println("\nTotal Cost: " + nonVegMeal.getCost());
    }
}
