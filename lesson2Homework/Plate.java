
public class Plate {

    private int food;

    public int getFood() {
        return this.food;
    }

    public void setFood(int food) {
        if (food < 0) {
            this.food = 0;
        } 
        else {
            this.food = food;
        }
    }

    public void addeadFood(int food) {
        if (food < 0) {
            setFood(getFood() + food);
        } 
    }


    public Plate(int food) {
        setFood(food);
    }

    public void info() {
        System.out.println("plate: " + getFood());
    }
}