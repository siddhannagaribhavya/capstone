package users;

import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.MySchedule;

public class SampleTestCase extends Base_Class{
	
	@Test
	public void sample() {
		//homePage.getUsersModuleLink().click();	
		MySchedule my=new MySchedule(driver);
		my.getSwitch_to_actiTIME().click();
		my.getMy_schedule().click();
		my.close1().click();
	//my.getClose_button().click()
	my.getRequests().click();
	my.getStayHome().click();
	  //driver.switchTo().alert().accept();
	my.getDeleteButton().click();
	}

}
