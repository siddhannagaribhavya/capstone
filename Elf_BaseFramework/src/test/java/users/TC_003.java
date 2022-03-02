package users;

import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.MySchedule;

public class TC_003 extends Base_Class {
		@Test
		public void sample() {
				
			MySchedule my=new MySchedule(driver);
			my.getSwitch_to_actiTIME().click();
			my.getMy_schedule().click();
			my.gettoday().click();
			my.getdate().click();
		
	
	}

}
