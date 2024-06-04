import java.util.ArrayList;

/**
 * This class represents one section of a course offered in a department.
 * 
 * @author James Corino
 * @version 3/31/22
 */
public class Section
{
    //The name of the department in which the course is offered.  E.g., CSIS
    private String department = "";
    
    //The course number, e.g., 010 or 120
    private String courseNum = "";
    
    //The section number, e.g., 01 or 12M
    private String sectionNum = "";
    
    //A list of students in the course.
    private ArrayList<Student> students;

    /**
     * Constructs a section of a course with an empty list of students.
     * 
     * @param department The department in which the course is offered.  E.g., CSIS
     * @param courseNum The course number.  E.g., 010 or 120
     * @param sectionNum The section number.  E.b., 01 or 12M
     */
    public Section(String department1, String courseNum1, String sectionNum1)
    {
        students = new ArrayList<Student>();
        department = department1;
        courseNum = courseNum1;
        sectionNum = sectionNum1;
    }

    /**
     * Returns the name of the department in which the course is offered.  E.g., CSIS
     * 
     * @return The name of the deparment in which the course is offered.
     */
    public String getDepartment()
    {
        return department;
    }

    /**
     * Returns the course number.  E.g., 010 or 120
     * 
     * @return The course number.
     */
    public String getCourseNumber()
    {
        return courseNum;
    }

    /**
     * Returns the section number.  E.g., 01 or 12M
     * 
     * @return The section number.
     */
    public String getSectionNumber()
    {
        return sectionNum;
    }

    /**
     * Returns the section name.  E.g., CSIS-120-01
     * 
     * @return The section name.
     */
    public String getSectionName()
    {
        return department + "-" + courseNum + "-" + sectionNum;
    }

    /**
     * Adds a student to the section.  Assume the value of the parameter is not null.
     * 
     * @param student The student to be added to the section.  
     */
    public void addStudent(Student student)
    {
        students.add(student);
    }

    /**
     * Returns the student information for the given student name.
     * 
     * @param firstName The first name of the student.
     * @param lastName The last name of the student.
     * @return The student information for the given student name or null
     *         if the studnet is not in this section.
     */
    public Student getStudent(String firstName, String lastName)
    {
      String fullName = lastName + ", " + firstName;
      if (students.contains(firstName) && students.contains(lastName)) {
        
      }
      else {
        fullName = null;
      }
      return null;
    }
        
    /**
     * Removes the input student from the section.
     * 
     * @param student The student to be removed from the section.
     * @return The student that was removed from the section or null if the 
     *         student was not in the section.
     */
    public Student dropStudent(Student student)
    {
      Student studentRemove = student;
      if (students.contains(student)){
        students.remove(student);
      }
      else {
        studentRemove = null;
      }
      
      return studentRemove;        
    }

    /**
     * Returns the avereage of each student's average grade in this section.
     * 
     * @return The average of each student's average grade in this section.
     */
    public double getClassAverageGrade()
    {
        double classAverage = 0;
        for (Student i : students) {
          classAverage += i.getAverage();
        }
        classAverage = classAverage / students.size();
        return classAverage;
    }
    
    /**
     * Returns a description of the section in the format
     * 
     * section name
     * student name
     * student grades
     * student name
     * student grades
     * ...
     * 
     * for all students in the section.
     * 
     * @return A description of the section.
     */
    public String toString()
    {
      String description = "";
      description = description + getSectionName() + "\n";
        
      for(Student student : students)
      {
        description = description + student.toString() + "\n";
      }
        
      return description;
    }
}
