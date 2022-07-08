package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import linkedinlearning.cucumbercourser.RestaurantMenu;
import linkedinlearning.cucumbercourser.RestaurantMenuItem;


public class UpdateMenuManagementSteps {
    String title = "thisis the title";
    
    //scenario two
    @Given("I have a menu item with name {string} and i need to change to {string}")
    public void startUpdate(String oldName, String newName){
        this.title = newName;
        System.out.println("scenario 2: step 1");
    }
    
    @When("i update one item")
    public void doUpdate() {
        System.out.println("scenario 2: step 2");
    }
    
    @Then("Menu Item with name {string} should be update")
    public void checkUpdate(String result) {
        if(result.equals(this.title)){
            System.out.println("the result is  ok");
            System.out.println("scenario 2 : step 3");
        }
    }
}

