package mysrc;

import java.util.Calendar;
import java.util.Date;

public class MyDateTime {

	/**
	 * @param args
	 */
	
	// return time 
	public static  String getTime(){
		String sTime="";
		
	     //Calendar cal = new Calendar();
	     Calendar cal = Calendar.getInstance();
	     Date dat = cal.getTime();
	     
	     return dat.toString();
	    // return sTime;
		
        
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getTime());

	}

}
