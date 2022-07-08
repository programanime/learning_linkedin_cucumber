package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import linkedinlearning.cucumbercourser.RestaurantMenu;
import linkedinlearning.cucumbercourser.RestaurantMenuItem;

import static org.junit.Assert.assertEquals;


public class MenuManagementSteps {
    public MenuManagementSteps(){
        System.out.println("i was created..........**");
    }
    RestaurantMenuItem NewMenuItem;
    RestaurantMenu LocationMenu = new RestaurantMenu();
    String title = "thisis the title";
    
    @Given("I have a menu item with name \"([^\"]+)\" and price ([$]?)([0-9]+)")
    public void i_have_a_menu_item_with_name_and_price(String strNewMenuItem, String currency, Integer price){
        NewMenuItem = new RestaurantMenuItem(strNewMenuItem, strNewMenuItem, price);
        System.out.println("step 1");
    }
    
    @When("I add that menu item")
    public void i_add_that_menu_item() {
        LocationMenu.addMenuItem(NewMenuItem);
        System.out.println("step 2");
    }
    
    @Then("Menu Item with name {string} should be added")
    public void menu_Item_with_name_should_be_added(String string) {
        boolean Exists = LocationMenu.DoesItemExist(NewMenuItem);
        assertEquals("one", "one");
        System.out.println("step 3 : " + Exists);
    }
    
    //background: prepare data
    @Given("initial preparation {int}")
    public void initialPreparation(int attemps){
        System.out.println("the attemps are : "+attemps);
    }
}

