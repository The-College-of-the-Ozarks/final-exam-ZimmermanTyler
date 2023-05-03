/*
Chef Class:
In order to better serve our customers, we are now offering
the availability of a private chef at each of our parties. 

This class has not yet been implemented, but is similar to our waitstaff and coordinator classes. 
The chef should be paid a minimum of $14.00 /hr and the job title will be chef. 

Documentation:

@param This class has no contructor, so there is no parameters that need to be listed.
@return Has set methods for the abstract methods within the superclass.

*/

public class Chef extends Employee
{
  public final static double PAY_RATE = 14.00;
   public void setPayRate(double rate)
   {
      if(rate > PAY_RATE)
        payRate = PAY_RATE;
      else
        payRate = rate;
   }
   public void setJobTitle()
   {
      jobTitle = "chef";
   }
}
