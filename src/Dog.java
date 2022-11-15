public class Dog {
    //1.instance variable/field/property
    public String breed, size,color;
    public  int age;

    //Data input for Dog1
    public void testDog(){
        this.breed = "Bulldog";
        this.size = "Large";
        this.color = "Light Gray";
        this.age = 5;
        System.out.println("Dog1 Object1:Properties\n breed = " + this.breed + "\n size = " +
                this.size + "\n color = " + this.color+ "\n age = " + this.age);
    }

    public void testDog2(){
        //Data input for Dog2
        this.breed = "Beagle";
        this.size = "Large";
        this.color = "Orange";
        this.age = 6;
        System.out.println("Dog2 Object2:Properties\n breed = " + this.breed + "\n size = " +
                this.size + "\n color = " + this.color+ "\n age = " + this.age);
    }
    public  void testDog3(){
        this.breed = "German Shepherd";
        this.size = "Large";
        this.color = "White and Orange";
        this.age = 6;
        System.out.println("Dog3 Object3:Properties\n breed = " + this.breed + "\n size = " +
                this.size + "\n color = " + this.color+ "\n age = " + this.age);
    }

}
