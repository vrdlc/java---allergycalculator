import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Allergies {
  public static void main(String[] args) {
    staticFileLocation("/public");
    //Home Page
    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      HashMap model = new HashMap();
      String score = request.queryParams("score");
      Integer integerScore = Integer.parseInt(score);
      ArrayList<String> results = giveAllergens(integerScore);
      model.put("integerScore", integerScore);
      model.put("results", results);
      model.put("template", "templates/results.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());
  }

    public static ArrayList<String> giveAllergens(Integer score) {

      ArrayList<String> allergyArray = new ArrayList<String>();

      while (score > 0) {
        if (score >= 128) {
          score -= 128;
          allergyArray.add("cats");
        } else if (score >= 64) {
          score -=64;
          allergyArray.add("pollen");
        } else if (score >= 32) {
          score -= 32;
          allergyArray.add("chocolate");
        } else if (score >= 16) {
          score -= 16;
          allergyArray.add("tomatoes");
        } else if (score >= 8) {
          score -= 8;
          allergyArray.add("strawberries");
        } else if (score >= 4) {
          score -= 4;
          allergyArray.add("shellfish");
        } else if (score >= 2) {
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
