import com.higortavares.cap2.User;

public class StaticFactoryUser {

  public static void main(String[] args) {
    var fullUser = User.create("pauloh", "1234", "Paulo Higor");
    var simpleUser = User.createSimple("admin", "12345");
    System.out.println(fullUser);
    System.out.println(simpleUser);
  }
}
