package com.example;

public class StudentTest
{
    public static void main(String[] args)
    {
        try {
        Course CS151 = new Course("CS-151", "Object Oriented Design", "CS", "6:00pm", "Tue");
        Student John = new Student("John", "Smith", 20, 3.6, "Computer Science", "CS", CS151);
        Student JohnCopy = (Student) John.clone();
        John.printInfo();
        System.out.println();
        JohnCopy.printInfo();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
    }
}
  

