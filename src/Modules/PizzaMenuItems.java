package Modules;

public class PizzaMenuItems {

    private String name;
    private String description;
    private int prize;

     public PizzaMenuItems(String name, String description, int prize){

        this.name = name;
        this.description = description;
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrize() {
        return prize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }
   @Override  // for editing the method string
    public String toString(){

        return name+ " " + description + " " + prize +"CZK";
    }
}
