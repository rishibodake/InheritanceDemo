class VehicleTypeName { //SuperMost Class
    public VehicleTypeName()
    {
        System.out.println("Constructor Of Class VehicleType Invoked");
    }
    public void vehicleType()
    {
        System.out.println("Vehicle Type: Car");
    }
}
class Brand extends VehicleTypeName { //car is parent class here and Maruti is child class here
    public Brand()
    {
        System.out.println("Constructor of Class Brand is Invoked");
    }
    public void brand()
    {
        System.out.println("Brand: Tesla");
    }
    public void speed()
    {
        System.out.println("Max: 140KMPH");
    }
}
public class ModelName extends Brand { //Maruti here us parent class

    public ModelName()
    {
        System.out.println("Constructor Of  ModelNameClass Invoked");
    }
    public void speed()
    {
        System.out.println("Max: 80Kmph");
    }
    public static void main(String args[])
    {
        ModelName obj=new ModelName();
        obj.vehicleType();
        obj.brand();
        obj.speed();
    }
}