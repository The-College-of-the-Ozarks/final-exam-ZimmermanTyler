/*
Event Class:
This class contains multiple typos and needs debugged. There are no logical issues with this class 
besides the aforementioned typos.

Documentation:
The event class is made to hold and test that all the information into the object is in the correct format. The object only needs the event number and the number of guests to be created, while the rest of the information can be entered into the object later.
@param This event can either be called with no parameters or a String & an int.
@return All information stored within this class can be called with a get method and will return it in the correct format.

*/
class Event
{
   public final static double HIGH_GUEST_PRICE = 35.00;
   public final static double LOW_GUEST_PRICE = 32.00;  
   public final static int LARGE_EVENT = 50;
   public final static int EVENT_NUM_LENGTH = 4;
   public final static String[] EVENT_TYPES =
      {"wedding", "baptism", "birthday", "corporate", "other"}; 
   private String eventNumber;
   private int guests;
   private double pricePerGuest;
   private double priceForEvent;
   private String contactPhone;
   private int eventType;
   public Event()
   {
      this("A000", 0);
   } 
   public Event(String num, int guests)
   {
      setEventNumber(num);
      setGuests(guests);
   }
   public void setEventNumber(String num)
   {
      boolean numOk = num.length() != EVENT_NUM_LENGTH || !Character.isLetter(num.charAt(0)) || !Character.isDigit(num.charAt(1)) || !Character.isDigit(num.charAt(2)) || !Character.isDigit(num.charAt(3));
      if(numOk) 
          eventNumber = "A000";      
        else
         eventNumber = num.toUpperCase();
   }
   public void setGuests(int gsts)
   {
      guests = gsts;
      if(isLargeEvent())
      {
         pricePerGuest = LOW_GUEST_PRICE;
         priceForEvent = guests * LOW_GUEST_PRICE;
      }
      else
      {
         pricePerGuest = HIGH_GUEST_PRICE;
         priceForEvent = guests * HIGH_GUEST_PRICE;
      }
   }
   public static double getHighGuestPrice() {
		return HIGH_GUEST_PRICE;
	}
	 public static double getLowGuestPrice() {
		return LOW_GUEST_PRICE;
	}
	 public static int getLargeEvent() {
		return LARGE_EVENT;
	}
	 public static int getEventNumLength() {
		return EVENT_NUM_LENGTH;
	}
	 public static String[] getEventTypes() {
		return EVENT_TYPES;
	}
	 public void setPricePerGuest(double pricePerGuest) {
		this.pricePerGuest = pricePerGuest;
	}
	 public void setPriceForEvent(double priceForEvent) {
		this.priceForEvent = priceForEvent;
	}
   public String getEventNumber()
   {
      return eventNumber;
   }
   public int getGuests()
   {
      return guests;
   }
   public double getPriceForEvent()
   {
      return priceForEvent;
   }
   public double getPricePerGuest()
   {
      return pricePerGuest;
   }
   public String getContactPhone()
   {
      String phone;
      phone = "(" + contactPhone.substring(0, 3) + ") " +
         contactPhone.substring(3, 6) + "-" +
         contactPhone.substring(6, 9);
      return phone;
   }
   public void setContactPhone(String phone)
   {
      final int VALID_LEN = 10;
      final String INVALID_PHONE = "0000000000";
      contactPhone = "";
      int len = phone.length();
      for(int x = 0; x < len; ++x)
      {
         if(Character.isDigit(phone.charAt(x)))
            contactPhone += phone.charAt(x);
      }
      if(contactPhone.length() != VALID_LEN)
         contactPhone = INVALID_PHONE;
   }
   public void setEventType(int code)
   {
      if(code < EVENT_TYPES.length)
         eventType = code;
      else
         eventType = EVENT_TYPES.length - 1;
   }
   public int getEventType()
   {
     return eventType;
   }
   public String getEventTypeString()
   {
      return EVENT_TYPES[eventType];
   }
   public boolean isLargeEvent()
   {
      boolean isLarge = false;
      if(guests >= LARGE_EVENT)
         isLarge = true;
      return isLarge;
   }
}
