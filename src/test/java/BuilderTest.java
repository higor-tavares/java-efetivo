import com.higortavares.cap2.NutritionalInfo;

public class BuilderTest {
  public static void main(String[] args) {
    var banana = NutritionalInfo.builder(100)
        .carbohydrates(28)
        .vitaminC(10)
        .build();
    var meat = NutritionalInfo.builder(300)
        .fat(28)
        .protein(30)
        .carbohydrates(10)
        .build();

    System.out.println(banana);
    System.out.println(meat);
  }
}
