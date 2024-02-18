package com.higortavares.cap2;

public class User {
  private String username;
  private String password;
  private String fullName;

  private User() {}
  private User(String username, String password, String fullName) {
    this.username = username;
    this.password = password;
    this.fullName = fullName;
  }
  private User(String username, String password) {
    this.username = username;
    this.password = password;
  }
  public static User create(String username, String password, String fullName) {
   return new User(username, password, fullName);
  }

  public static User createSimple(String username, String password) {
    return new User(username, password);
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getFullName() {
    return fullName;
  }

  @Override
  public String toString() {
    return "User{" +
        "username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", fullName='" + fullName + '\'' +
        '}';
  }
}
