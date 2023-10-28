package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.altashop.ProductsCategory.DeleteProductCategory;
import starter.altashop.ProductsCategory.GetAllProductCategory;
import starter.altashop.ProductsCategory.PostProductCategory;

public class ProductCategorySteps {
    @Steps
    GetAllProductCategory getAllProductCategory;


    @Steps
    PostProductCategory postProductcategory;
    @Steps
    DeleteProductCategory deleteProductCategory;

    @Given("I set the GET api endpoints")
    public void iSetTheGETApiEndpoint() { getAllProductCategory.iSetTheGETApiEndpoint();

    }

    @When("I send HTTP api GET request")
    public void iSendHTTPApiGETRequest() { getAllProductCategory.iSendHTTPApiGETRequest();

    }

    @Then("I receive valid HTTP response code {int} for GET All product category")
    public void iReceiveAValidHTTPResponseCodeForGetAllProductCategory(int ignoredArg0) { getAllProductCategory.iReceiveAValidHTTPResponseCodeForGetAllProductCategory();

    }

    @And("I received valid data for all product category")
    public void iReceiveValidDataForAllProductCategory() { getAllProductCategory.iReceiveValidDataForAllProductCategory();

    }



    @Given("I set the POST api endpoints in category")
    public void iSetThePOSTApiEndpointsInCategory() { postProductcategory.iSetThePOSTApiEndpointsInCategory();


    }

    @When("I send HTTP api POST request")
    public void iSendHTTPApiPOSTRequest() { postProductcategory.iSendHTTPApiPOSTRequest();

    }

    @Then("I receive valid HTTP response code {int} in product category")
    public void iReceiveValidHTTPResponseCodeInProductCategory(int ignoredArg0) { postProductcategory.iReceiveValidHTTPResponseCodeInProductCategory();

    }

    @And("I receive valid data for new product category")
    public void iReceiveValidDataForNewProductCategory() { postProductcategory.iReceiveValidDataForNewProductCategory();
    }

    @Given("I set the DELETE api endpoints")
    public void iSetTheDELETEApiEndpoints() { deleteProductCategory.iSetTheDELETEApiEndpoints();


    }

    @When("I send HTTP api DELETE request for category")
    public void iSendHTTPApiDELETERequestForCategory() { deleteProductCategory.iSendHTTPApiDELETERequestForCategory();

    }

    @Then("I receive valid HTTP response code {int} for category DELETE")
    public void iReceiveValidHTTPResponseCodeForCategoryDELETE(int ignoredArg0) { deleteProductCategory.iReceiveValidHTTPResponseCodeForCategoryDELETE();
    }
}
