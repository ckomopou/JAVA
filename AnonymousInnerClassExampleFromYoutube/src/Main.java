public class Main {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.Greeting();

        Hello anotherHello = new Hello(){
            public void Greeting(){
                System.out.println("This is the inner class and it is an anonymous one");
            }
        };
        anotherHello.Greeting();


    }
}
