package ObjectAndClassesExercise.VehicleCatalog;

public class CarClass {
    static class Car{
        String type;
        String model;
        String color;
        int hp;

        public Car(String type, String model, String color, int hp){
            this.type=type;
            this.model=model;
            this.color=color;
            this.hp=hp;
        }

        public String getType(){
            return this.type=type;
        }
        public String getModel(){
            return this.model=model;
        }
        public String getColor(){
            return this.color=color;
        }
        public int getHp(){
            return this.hp=hp;
        }
    }
}
