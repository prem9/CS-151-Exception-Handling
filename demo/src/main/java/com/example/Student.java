package com.example;

/**
 * Hello world!
 *
 */
public class Student implements Cloneable
{
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;
    private String major;
    private String dept;
    private Course course;

    public Student(String name, String lastName2, int age2, double gpa2,  String major2, String dept2, Course course2) throws Exception
    {
        firstName = name;
        lastName = lastName2;
        age = age2;
        gpa = gpa2;
        major = major2;
        dept = dept2;
        course = course2;
    }
    public Student()
    {

    }
    public void setName(String firstNameSet)
    {
        firstName = firstNameSet;
    }
    public String getFirstName()
    {
            return firstName;
    }
    public void setLastName(String lastNameSet)
    {
        lastName = lastNameSet;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setAge(int ageSet)
    {
        age = ageSet;
    }
    public int getAge()
    {
        return age;
    }
    public void setGPA(double gpaSet)
    {
        gpa = gpaSet;
    }
    public double getGPA()
    {
        return gpa;
    }
    public void setMajor(String majorSet)
    {
        major = majorSet;
    }
    public String getMajor()
    {
        return major;
    }
    public void setDept(String deptSet)
    {
        dept = deptSet;
    }
    public String getDept()
    {
        return dept;
    }
    public void setCourse(Course courseSet)
    {
        course = courseSet;
    }
    public Course getCourse()
    {
        return course;
    }
    public String toString()
    {
        String info = "Name: " + firstName + " " + lastName + ", age:" + age + ", GPA: " + gpa + ", Major: " + major + ", Department" + dept +  ", Course Info: " + course.toString();
        return info;
    }
    public void printInfo()
    {
        System.out.println(toString());
    }

    protected Student clone() throws CloneNotSupportedException
    {
        
        Student student = (Student) super.clone();
        student.course = (Course) course.clone();
        return student;
    }
}
