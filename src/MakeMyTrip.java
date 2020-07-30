class LoginClass {

    boolean flag = false;
    public void Login(String UserName,String Password){
        if(UserName == "rishikesh"){
            if(Password == "1234"){
                System.out.println("Welcome User");
                flag=true;
            }
            else {
                System.out.println("Wrong Password");
            }
        }
        else {
            System.out.println("Wrong Username");
        }
    }
}
class AirIndia extends LoginClass //LoginClass is Parent Class here AirIndia is Child Class
{
    void Check(){
        if(flag == true){
            System.out.println("AirIndia Login Successful");
        }
    }
}
class Indigo extends LoginClass{
    void Check(){
        if(flag == true){
            System.out.println("Indigo Login Successful");
        }
    }
}

public class MakeMyTrip {
    public static void main(String[] args) {
        AirIndia airIndia = new AirIndia();
        airIndia.Login("rishikesh","1234");
        airIndia.Check();
        Indigo indigo = new Indigo();
        indigo.Login("rishikesh","1234");
        indigo.Check();
    }
}
