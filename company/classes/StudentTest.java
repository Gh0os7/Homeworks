package com.company.classes;

/**
 * Created by dstoykov on 20.7.2016 г..
 */
public class StudentTest {

  public static Student getStudentOne() {
    return studentOne;
  }

  public static Student getStudentTwo() {
    return studentTwo;
  }

  public static Student getStudentThree() {
    return studentThree;
  }

  private static Student studentOne;
  private static Student studentTwo;
  private static Student studentThree;

  public static void studentsValues () {
    studentOne = new Student();
    studentOne.setFirstName("Student One Name");
    studentTwo = new Student();
    studentTwo.setFirstName("Student Two Name");
    studentThree = new Student();
    studentThree.setFirstName("Student Three Name");

  }

  public static void printStudentsInfo () {
    System.out.println(studentOne.getFirstName());
    System.out.println(studentTwo.getFirstName());
    System.out.println(studentThree.getFirstName());
  }

  Student student1 = new Student();
  public void getStudent1() {
    student1.allStudentInfo();
  }

  Student student2 = new Student();
  public void getStudent2() {
    student2.allStudentInfo();
  }

  Student student3 = new Student();
  public void getStudent3() {
    student3.allStudentInfo();
  }
}
