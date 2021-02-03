public class Main {

    public static void main(String[] args) {

        Greeting greeting = new Greeting(){
           @Override
            public void Welcome(){
                System.out.println("Yo kourtinoxyl!!!");
            }
        };
        Greeting greeting2 = new Greeting();

            // ONLY After creating the instance I can use the method I have defined into the Greeting class!
        greeting.Welcome();
        greeting2.Welcome();
    }
}
