package StepDefinitions;

import Pages.LocationPage;
import cucumber.api.java.en.Then;

public class LocatioPageSD {

	@Then("^click on Riskinsured address same$")
	public void click_on_Riskinsured_address_same()
	{
	LocationPage location = new LocationPage();
	location.Location();
	}
	@Then("^enter the \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" in location page$")
	public void enter_the_Then_Then_Then_Then_in_location_page(String arg1, String arg2, String arg3, String arg4, String arg5)
	{
		
	}
}
