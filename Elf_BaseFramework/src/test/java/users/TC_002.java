package users;




import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.MySchedule;

public class TC_002  extends Base_Class{
	@Test
	public void sample() throws InterruptedException {
		//homePage.getUsersModuleLink().click();	
		MySchedule my=new MySchedule(driver);
		// to get actitime
		my.getSwitch_to_actiTIME().click();
		my.getMy_schedule().click();
		my.getarrow().click();
		my.getradio().click();
		my.getFinance().click();
		my.getapply().click();
		
		
		
		


	}

}
