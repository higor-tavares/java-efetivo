import com.higortavares.cap2.LoginService;

public class LoginServiceTest {
  public static void main(String[] args) {
    var loginService = LoginService.getInstance();
    loginService.connect("user1", "pass1");
    var anotherLoginService = LoginService.getInstance();
    System.out.println(loginService);
    System.out.println(anotherLoginService);
  }
}
