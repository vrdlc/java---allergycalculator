import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class AllergiesTest {

  @Test
  public void giveAllergens_returnsArrayOfAllergensWhenGivenAllergyScore_eggsAndPeanuts() {
    Allergies allergiesTest = new Allergies();
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("peanuts");
    arrayList.add("eggs");
    assertEquals(arrayList, allergiesTest.giveAllergens (3));
  }

  // @Test
  // public void giveAllergens_returnsArrayOfAllAllergensWhenGivenScoreOf255_allAllergens() {
  //   Allergies allergiesTest = new Allergies();
  //   assertEquals("[]")
  // }
}
