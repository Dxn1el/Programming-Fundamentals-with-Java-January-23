package ObjectAndClassesExercise.VehicleCatalog;

public class TrucksClass {
    static class Truck {
        String type;
        String model;
        String color;
        int hp;

        public Truck(String type, String model, String color, int hp){
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
        public Integer getHp(){
            return this.hp=hp;
        }
}
}
