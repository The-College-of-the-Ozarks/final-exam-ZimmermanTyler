/*
Employee Class:
This class contains multiple typos and needs debugged. There are no logical issues with this class 
besides the aforementioned typos.

Documentation:
This class is an abstract class for the didferent type of employees that the dinner event will need. Also, has two abstract methods that need to be created within the subclasses.
@param This class has no contructor, so there is no parameters that need to be listed.
@return This method has get and set methods for all the information stored within the class. 

*/
public abstract class Employee
{
   private String employeeNumber;
   private String lastName;
   private String firstName;
   protected double payRate;
   protected String jobTitle;
   public void setEmployeeNumber(String num)
   {
     employeeNumber = num;
   }
   public void setLastName(String name)
   {
      lastName = name;
   }
   public void setFirstName(String name)
   {
      firstName = name;
   }
   public String getEmployeeNumber()
   {
      return employeeNumber;
   }
   public String getName()
   {
      return firstName + " " + lastName;
   }
   public double getPayRate()
   {
      return payRate;
   }
   public String getJobTitle()
   {
      return jobTitle;
   }
   public abstract void setPayRate(double rate);
   public abstract void setJobTitle();
}
