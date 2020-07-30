class Father{
    void house(){
        System.out.println("2000 Square Feet House");
    }
}
class Child extends Father{
    void vehicle(){
        System.out.println("Has Bullet");
    }
}
public class Main_Class extends Father {
    public static void main(String[] args) {
        Child has = new Child();
        has.house();
        has.vehicle();
    }
}
