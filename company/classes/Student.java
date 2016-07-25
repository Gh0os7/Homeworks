package com.company.classes;

/**
 * Created by dstoykov on 19.7.2016 г..
 */
public class Student {

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getCourse() {
    return course;
  }

  public void setCourse(int course) {
    this.course = course;
  }

  public String getSpecialty() {
    return specialty;
  }

  public void setSpecialty(String specialty) {
    this.specialty = specialty;
  }

  public String getUniversity() {
    return university;
  }

  public void setUniversity(String university) {
    this.university = university;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public static int getInitCount() {
    return initCount;
  }

  public static void setInitCount(int initCount) {
    Student.initCount = initCount;
  }

  private String firstName;
  private String middleName;
  private String lastName;
  private int course;
  private String specialty;
  private String university;
  private String email;
  private String phoneNumber;
  private static int initCount;

  public Student(String firstName, String lastName, String university) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.university = university;
    this.middleName = null;
    this.specialty = null;
    this.phoneNumber = null;
    this.course = 0;
    this.email = null;
    Student.initCount++;
  }

  public Student(int course, String phoneNumber) {
    this.phoneNumber = phoneNumber;
    this.course = course;
    this.specialty = null;
    this.middleName = null;
    this.firstName = null;
    this.lastName = null;
    this.university = null;
    Student.initCount++;
  }

  public Student() {
  }

  void allStudentInfo() {
    System.out.println(phoneNumber);
    System.out.println(course);
    System.out.println(specialty);
    System.out.println(middleName);
    System.out.println(firstName);
    System.out.println(lastName);
    System.out.println(university);
    System.out.println(initCount);
  }
}
