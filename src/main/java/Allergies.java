import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Allergies {
  public static void main(String[] args) {

  }

    public static ArrayList<String> giveAllergens(Integer score) {
      HashMap<String, Integer> mapOfAllergens = new HashMap<String, Integer>();
      mapOfAllergens.put("eggs", 1);
      mapOfAllergens.put("peanuts", 2);
      mapOfAllergens.put("shellfish", 4);
      mapOfAllergens.put("strawberries", 8);
      mapOfAllergens.put("tomatoes", 16);
      mapOfAllergens.put("chocolate", 32);
      mapOfAllergens.put("pollen", 64);
      mapOfAllergens.put("cats", 128);

      ArrayList<String> allergyArray = new ArrayList<String>();

      while (score > 0) {
        if (score >= 2) {
          score -= 2;
          allergyArray.add("peanuts");
        } else if (score >= 1) {
          score -= 1;
          System.out.println(score);
          allergyArray.add("eggs");
        }
      } return allergyArray;


    }
}
