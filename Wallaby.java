package zooAnimals;

public class Wallaby implements iAnimal {
   private static final String ANIMAL_TYPE = "Wallaby";
   private static final int MIN_TEMP = 60;
   private static final int MAX_TEMP = 90;
   private int idTag;
   
   public Wallaby() {
      idTag = 0;
   }
   public String getAnimalType() {
      return ANIMAL_TYPE;
   }
   public int getIdTag() {
      return idTag;
   }
   public void setIdTag(int anIdTag) {
      idTag = anIdTag;
   }
   public int getMinTemperature() {
      return MIN_TEMP;
   }
   public int getMaxTemperature() {
      return MAX_TEMP;
   }
}