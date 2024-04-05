
public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int appetite;

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    
    private boolean full;

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public Cat(String name, int appetite) {
        setName(name);
        setAppetite(appetite);
        setFull(false);
    }

    public boolean eat(int food) {
        if (food >= getAppetite()){
            setFull(true);
            System.out.println(getName() + ": поел");
            return true;
        }
        else {
            System.out.println(getName() + ": не ел");
            return false;

        }
    }
}