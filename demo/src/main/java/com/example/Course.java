package com.example;



public class Course implements Cloneable
{
    private String courseName;
    private String courseDesc;
    private String department;
    private String courseTime;
    private String courseDay;

    public Course(String name, String Desc, String dept, String time,  String day) throws Exception
    {
        courseName = name;
        courseDesc = Desc;
        department = dept;
        courseTime = time;
        courseDay = day;
    }
    public Course() throws Exception
    {
        courseName = null;
        courseDesc = null;
        department = null;
        courseTime = null;
        courseDay = null;
    }
    
    public void setName(String nameSet)
    {
        courseName = nameSet;
    }
    public String getName()
    {
            return courseName;
    }
    public void setDesc(String descSet)
    {
        courseDesc = descSet;
    }
    public String getDesc()
    {
        return courseDesc;
    }
    public void setDept(String dept)
    {
        department = dept;
    }
    public String getDept()
    {
        return department;
    }
    public void setTime(String time)
    {
        courseTime = time;
    }
    public String getTime()
    {
        return courseTime;
    }
    public void setDay(String day)
    {
        courseDay = day;
    }
    public String getDay()
    {
        return courseDay;
    }

    public String toString()
    {
        String info = "Course Name: " + courseName + ", Details:" + courseDesc + ", Dept: " + department + ", Time: " + courseTime + ", Day: " + courseDay;
        return info;
    }
    public void printInfo()
    {
        System.out.println(toString());
    }
    protected Course clone() throws CloneNotSupportedException
    {
        Course course = (Course) super.clone();
        return course;
    }
    
}
