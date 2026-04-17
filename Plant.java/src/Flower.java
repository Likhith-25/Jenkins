class PlantA{
    void rose(){
        System.out.println("Rose");
    }
}
class PlantB extends PlantA{
    void jasmine(){
        System.out.println("Jasmine");
    }
}
class PlantC extends PlantB{
    void marie(){
        System.out.println("Marie");
    }
}
public class Flower {
    public static void main(String args[])
    {
        PlantC f1 = new PlantC();
        f1.rose();
        f1.jasmine();
        f1.marie();
    }
}
