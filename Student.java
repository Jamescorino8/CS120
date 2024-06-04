import java.util.ArrayList;

/**
 * This class represents a student in a class.
 * 
 * @author Nicholas Gati, Jame Corino 
 * @version 3/31/2022
 */
public class Student
{
    //Student's first name
    private String firstName;
    
    //Student's last name
    private String lastName;
    
    //Student's grades in the class
    private ArrayList<Integer> grades;
    
    /**
     * Construct a new Student object with the input first and last name.
     * Creates the student's grade list, with no grades.
     * 
     * @param firstName The student's first name.
     * @param lastName The student's last name.
     */
    public Student(String firstName1, String lastName1)
    {
      grades = new ArrayList<Integer>();
      firstName = firstName1;
      lastName = lastName1;
      
    }

    /**
     * Returns the student's first name.
     * 
     * @return The student's first name.
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    /**
     * Returns the student's last name.
     * 
     * @return The student's last name.
     */
    public String getLastName()
    {
        return lastName;
    }
    
    /**
     * Adds the grade to the student's list of grades.
     * 
     * @param grade An integer in [0, 100].  Sorry, no bonus points.
     */
    public void addGrade(Integer grade)
    {
      grades.add(grade);
    }

    /**
     * This method returns a description of the student in the format
     * 
     * last name, first name:
     * list of grades separated by spaces
     * 
     * @return A description of the student including name and grade list.
     */
    public String toString()
    {
      String s = " ";
      s = s + lastName + firstName + ":\n";
      for(Integer g: grades ){
        s = s + g + " ";
      }
      return s; 
    }

    /**
     * This method returns the average of the student's grades.
     * 
     * @return The average of the student's grades.  If the student
     *         has no grades, -1 is returned.
     */
    public double getAverage()
    {
      //if(grades.size() == 0) return -1;
      //double sum = 0;
     // for (Integer g: grades){
      //  sum += 0;
     // }
      //return sum / grades.size();
      int i = 0;
      double average = 0.0;
      
      if (grades.size() == 0) {
        average = -1;
        return average;
      }
      else {
        while (i < grades.size()) {
          average += (grades.get(i));
          i++;
        }
      }
      return average / grades.size();
      
    }
    
    /**
     * Removes the first occurrence of the grade in the student's list
     * of grades.
     * 
     * @param grade The grade to be removed.
     * @return True if the grade was found and removed and false otherwise.
     */
    public boolean removeGrade(Integer grade)
    {
      boolean gradeFound = false;
      
      if (grades.contains(grade) == true) {
      grades.remove(grade);
      gradeFound = true;
      }
      
      return gradeFound;
    }
    
    /**
     * This method removes the student's lowest grade for his or her
     * list of grades.  However, grades of zero are not removed.
     * 
     * @return The grade removed or -1 if no grade was removed.
     */
    public int dropLowestNotZero()
    {
      int i = 0;
      int lowGrade = 101;
      int gradeRemoved = 0;
      int indexRemove = -1;
      
      while(i < grades.size()) {
        if (lowGrade > grades.get(i) && grades.get(i) != 0) {
          lowGrade = grades.get(i);
          indexRemove = i;
        }
        i++;
      }
      if (lowGrade == 0) {
        gradeRemoved = -1;
      }
      else {
        gradeRemoved = grades.get(indexRemove);
        grades.remove(indexRemove);
      }
      
      return gradeRemoved;
    }
    


}