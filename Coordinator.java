/*
Coordinator Class:
There are no issues with this class. 

Documentation:

@param This class has no contructor, so there is no parameters that need to be listed.
@return Has set methods for the abstract methods within the superclass.

*/
public class Coordinator extends Employee
{
   public final static double PAY_RATE = 20.00;
   public void setPayRate(double rate)
   {
      if(rate > PAY_RATE)
        payRate = PAY_RATE;
      else
        payRate = rate;
   }
   public void setJobTitle()
   {
      jobTitle = "coordinator";
   }
}
