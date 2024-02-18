package com.higortavares.cap2;

public class LoginService {
  private LoginService(){}
  private static final LoginService INSTANCE = new LoginService();
  public void connect(String username, String password) {
    System.out.println("Connected!");
  }
  public static LoginService getInstance() {
    return INSTANCE;
  }
}
