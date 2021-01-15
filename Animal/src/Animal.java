public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

//constructor------------------------------------------------
    public Animal(String name, int brain, int body, int size, int weight){
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

//public classes-----------------------------------------------
    public void eat(){
        System.out.println("Animal.eat() called");
    }

    public void move(int speed){
        System.out.println("Animal.move() called. Animal is moving with " + speed);

    }



// ------------------------------------------------------------------------------------------
    public String getName(){
        return name;
    }

    public void setBrain() {
        this.brain = brain;
    }

    public void setBody() {
        this.body = body;
    }

    public void setSize() {
        this.size = size;
    }

    public void setWeight() {
        this.weight = weight;
    }







}
