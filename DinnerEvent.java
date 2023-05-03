/*
DinnerEvent Class:
There are no issues with this class.

Documentation:
This class extends event class which it adds an array of employees that would work the event and stores all the choices for the different meals for the dinner event.
@param Has one parameter that includes both a String and int for the superclasss. Also, four ints to pick the meal for the event.
@return has a method to return the meal in the desired format. Also, has a get and set methods for the employee array.


*/
class DinnerEvent extends Event
{
   public final static String[] ENTREES = {"beef", "chicken", "fish", "pasta"};
   public final static String[] SIDES = {"salad", "mixed vegetables", "baked potato", "garlic bread", "dinner roll"};
   public final static String[] DESSERTS = {"chocolate cake", "apple pie", "butterscotch pudding"};
   private int entreeChoice;
   private int sideChoice1;
   private int sideChoice2;
   private int dessertChoice;
   Employee[] emps = new Employee[15];
   public DinnerEvent(String num, int guests, int choice1, int choice2, int choice3, int choice4)
   {
      super(num, guests);
      if(choice1 < ENTREES.length)
         entreeChoice = choice1;
      else
         entreeChoice = 0;
      if(choice2 < SIDES.length)
         sideChoice1 = choice2;
      else
         sideChoice1 = 0;
      if(choice3 < ENTREES.length)
         sideChoice2 = choice3;
      else
         sideChoice2 = 0;
      if(choice4 < DESSERTS.length)
         dessertChoice = choice4;
      else
         dessertChoice = 0;
    }
   public Employee[] getEmps()
   {
      return emps;
   }
   public void setEmps(Employee[] staff)
   {
      emps = staff;
   }
   public String getMenu()
   {
      String menu = ENTREES[entreeChoice] + ", " + SIDES[sideChoice1] + ", " +
        SIDES[sideChoice2] + ", and " + DESSERTS[dessertChoice];
      return menu;
   }
 
}
