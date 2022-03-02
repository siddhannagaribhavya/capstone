package pomRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MySchedule
{
	
	public  MySchedule (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='logoSwitcherText']")
	private WebElement  Switch_to_actiTIME;
	
		@FindBy(xpath="//a[@class='content my_schedule selected']")
		private WebElement my_schedule;
		
		@FindBy(xpath="//div[@id='closeProjectLightBoxBtn']")
		private WebElement close_button;
		
	
		@FindBy(xpath="//span[text()='Requests']")
		private WebElement Requests;
		
		@FindBy(xpath="//tr[@class='requestRow editable odd']")
		private WebElement StayHome;
	
   @FindBy(xpath="//div[@class='deleteButton'][1]")
   private WebElement DeleteButton;
   
   @FindBy(xpath="//div[@class='arrow']")
   private WebElement selected_users;
   
   
   @FindBy(xpath="//div[@class='x-form-radio-wrap-inner ']")
   private WebElement selected_user;
   
   @FindBy(xpath="//button[.='today']")
   private WebElement today;
   @FindBy(xpath="//div[@id='closeProjectLightBoxBtn']")
   private WebElement close;
   
   //@FindBy(xpath="//span[contains(.,'White, Jane')]")
  // private WebElement Production;
 
  // @FindBy(xpath="	//span[@id='ext-gen138']")
  // private WebElement Apply;



   
   @FindBy(xpath="//div[@class='arrow']")
   private 	WebElement arrow;



		public WebElement getToday() {
	return today;
}

public WebElement getArrow() {
	return arrow;
}
public WebElement getDate() {
	return date;
}
public WebElement getRadio() {
	return radio;
}
public WebElement getApply() {
	return apply;
}
		public WebElement getarrow() {
	return arrow;
} 
   @FindBy(xpath=" //span[.='24']")
   private WebElement date;
   public WebElement getdate() {
		return date;
	}
   @FindBy(xpath="//img[@id='ext-gen75']")
   private WebElement radio;
   public WebElement getradio() {
		return radio;
	}
   @FindBy(xpath="//span[@title='HR & Finance']")
   private WebElement Finance;
   public WebElement getFinance() {
		return Finance;
	}
   @FindBy(xpath="//span[@id='ext-gen138']")
   private WebElement apply;
   public WebElement getapply() {
		return apply;
	}
   public WebElement gettoday() {
		return today;
	}
 //span[.='24']

		public WebElement getSelectUser() {
	return selected_users;
}


		//public WebElement getSelected_user() {
	//return selected_user;
//}


		//public WebElement getSelected_users() {
	//return selected_users;
//}


		public WebElement getDeleteButton() {
	return DeleteButton;
}


		public WebElement getStayHome() {
			return StayHome;
		}
	
       
		
		//public void setStayHome(WebElement stayHome) {
			//StayHome = stayHome;
		//}



		public WebElement getMy_schedule() {
			return my_schedule;
		}



		public WebElement getSwitch_to_actiTIME() {
			return Switch_to_actiTIME;
		}



		public WebElement getClose_button() {
			return close_button;
		}



		public WebElement getRequests() {
						// TODO Auto-generated method stub
		
		return Requests;
		}
		public WebElement close1() {
			// TODO Auto-generated method stub
			return close;
		}

		}

		
		
//		
		
		
		
		
		
		
		
		
		
		
	




