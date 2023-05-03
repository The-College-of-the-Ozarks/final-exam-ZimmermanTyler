/*
Waitstaff Class:
An intern developer accidentaly deleted the implementation of the 
setPayRate method of this class. This class will also need to be debugged. 

Documentation:

@param This class has no contructor, so there is no parameters that need to be listed.
@return Has set methods for the abstract methods within the superclass.

*/
public class Waitstaff extends Employee
{
   public final static double PAY_RATE = 10.00;
   public void setPayRate(double rate)
   {
     if(rate > PAY_RATE)
        payRate = PAY_RATE;
      else
        payRate = rate;
   }
   public void setJobTitle()
   {
      jobTitle = "waitstaff";
   }
}
