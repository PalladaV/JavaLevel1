/**
 * Java 1. Home Work #7
 *
 * @author Yana
 * @version 04/03/2022
 */
 
 public class HomeWork7 {
     public static void main(String[] args) {
        Cat[] cats = {
            new Cat ("Murka", 15), new Cat ("Busya", 10), new Cat ("Barsik", 20)
        };
        Plate  plate = new Plate(50, 30);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        
        System.out.println(plate);
        plate.add(40);
        System.out.println(plate);
        
        for (Cat cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
     }
 } 

class Cat {
    private String name;
    private int appetite;
    private boolean fullness;
    
    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }
    
    void setFullness(boolean status) {
        fullness = status;
    }
    
    void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }
    
    @Override
    public String toString() {
        return "{name=" + name + ", appetite=" +
        appetite + ", fullness=" + fullness + "}";
    }
}  

class Plate {
    private int maxVolume;
    private int food;
    
    Plate(int maxVolume, int food) {
        this.maxVolume = maxVolume;
        this.food = food;
    }
    
    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }
    
    void add(int food) {
        if (this.food + food <= maxVolume) {
            this.food += food;
        }
    }
    
    @Override
    public String toString() {
        return"plate: " + food;
    }
}    