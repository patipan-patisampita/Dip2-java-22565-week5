public class Main {
    //2.instance method/function
    public static void main(String[] args) {
        //3.Instance Object: Dog1Object
        Dog Dog1Object = new Dog();
        Dog Dog2Object = new Dog();
        Dog Dog3Object = new Dog();

        Lamp led = new Lamp();

        led.turnOn();

        Dog1Object.testDog();
        Dog2Object.testDog2();
        Dog3Object.testDog3();
    }
}