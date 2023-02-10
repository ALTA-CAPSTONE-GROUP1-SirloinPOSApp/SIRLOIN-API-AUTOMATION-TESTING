package starter.Sirloin.CustomersStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Sirloin.CustomerAPI;
import starter.Sirloin.Utils.Constant;

public class GetCustomerStepdef {

    @Steps
    CustomerAPI customerAPI;

    @Given("Get display all customer")
    public void getDisplayAllCustomer() {
        customerAPI.getCustomer(Constant.TOKEN);
    }

    @When("Send request getCustomer")
    public void sendRequestGetCustomer() {
        SerenityRest.when().get(CustomerAPI.GET_CUSTOMER);
    }

    @Given("Get display customer with id {int}")
    public void getDisplayCustomerWithId(int id) {
        customerAPI.getCustomerById(Constant.TOKEN, id);
    }

    @When("Send request getCustomer with id")
    public void sendRequestGetCustomerWithId() {
        SerenityRest.when().get(CustomerAPI.GET_CUSTOMER_ByID);
    }

    @Given("Get display customer with invalid id {string}")
    public void getDisplayCustomerWithInvalidId(String id) {
        customerAPI.getCustomerInvalidId(Constant.TOKEN,id);
    }

    @When("Send request getCustomer with invalid id")
    public void sendRequestGetCustomerWithInvalidId() {
        SerenityRest.when().get(CustomerAPI.GET_CUSTOMER_InvalidID);
    }
}
