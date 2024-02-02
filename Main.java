import java.util.*;
public class Main {
    public static void main (String[] args){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Which meal do you want to add (breakfast, lunch dinner)?");
        String mealCat = scanner.next();
        System.out.println("Input the meal's name:");
        String mealName = scanner.next();
        System.out.println("Input the ingredients:");
        String ingredients = scanner.next();
        String[] ingredientsArray = ingredients.split(",");

        System.out.println("Category: " + mealCat);
        System.out.println("Name: " + mealName);
        for (String s : ingredientsArray) {
            System.out.println(s);
        }
        System.out.println("The meal has been successfully added!");
    }
}
