package org.example;

public class Main {

  public static void main(String[] args) {
    User user = new User("Phuoc","phuoc@gmail.com",21,"HCM");
    User user1 = user.clone();

    System.out.println(user);
    System.out.println(user1);
    System.out.println("---------------------------------------------");
    user.setName("Thuong");
    System.out.println(user);
    System.out.println(user1);// copy thành một đối tượng mới (địa chỉ mới ở bộ nhớ stack)
    System.out.println("-----------------------------------------------");

    // custom prototype
    Teacher teacher = new Teacher("Thanh","thanh@gmail.com",38,"HCM");
    Teacher teacher1 = teacher.clone();

    System.out.println(teacher);
    System.out.println(teacher1);
    System.out.println("-----------------------------------------------");
    teacher.setName("Hoang");
    System.out.println(teacher);
    System.out.println(teacher1);
  }
}