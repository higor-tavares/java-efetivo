package com.higortavares.cap2;

public class NutritionalInfo {
  private static NutritionalInfo self;
  private int calories;
  private int fat;
  private int carbohydrates;
  private int protein;
  private int vitaminC;
  private int vitaminB;
  private int omega3;

  private NutritionalInfo() {}

  public static Builder builder(int calories) {
    self = new NutritionalInfo();
    self.calories = calories;
    return new Builder();
  }

  public static class Builder{
    private Builder(){};

    public Builder fat(int fat) {
      self.fat = fat;
      return this;
    }
    public Builder carbohydrates(int carbohydrates) {
      self.carbohydrates = carbohydrates;
      return this;
    }
    public Builder protein(int protein) {
      self.protein = protein;
      return this;
    }
    public Builder vitaminC(int vitaminC) {
      self.vitaminC = vitaminC;
      return this;
    }
    public Builder vitaminB(int vitaminB) {
      self.vitaminB = vitaminB;
      return this;
    }
    public Builder omega3(int omega3) {
      self.omega3 = omega3;
      return this;
    }
    public NutritionalInfo build() {
      return self;
    }
  }

  @Override
  public String toString() {
    return "NutritionalInfo{" +
        "calories=" + calories +
        ", fat=" + fat +
        ", carbohydrates=" + carbohydrates +
        ", protein=" + protein +
        ", vitaminC=" + vitaminC +
        ", vitaminB=" + vitaminB +
        ", omega3=" + omega3 +
        '}';
  }
}
