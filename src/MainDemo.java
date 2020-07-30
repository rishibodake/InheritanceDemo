interface FirstInterface{
    void FirstMethod();
}
interface SecondInterface{
    void SecondMethod();
}

class ConcreteClass implements FirstInterface , SecondInterface{

    @Override
    public void FirstMethod() {
        System.out.println("In First Method");
    }

    @Override
    public void SecondMethod() {
        System.out.println("In Second Method");
    }
}
public class MainDemo {
    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.FirstMethod();
        concreteClass.SecondMethod();
    }
}
