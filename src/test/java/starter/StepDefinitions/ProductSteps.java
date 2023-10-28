package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.altashop.product.*;

public class ProductSteps {
    @Steps
    GetAllProduct getAllProduct;

    @Steps
    DeleteProduct deleteProduct;
    @Steps
    PostProduct postProduct;

    @Steps
    GetProductRating getProductRating;
    @Steps
    GetProductComment getProductComment;


    @Given("I set GET endpoints")
    public void iSetGETEndpoints() {
        getAllProduct.GetApiEndpoint();
    }
    @When("I send GET HTTP request")
    public void iSendGETHTTPRequest() {
        getAllProduct.GetHttpRequest();
    }
    @Then("I receive valid HTTP response code {int}")
    public void iReceiveValidHTTPResponseCode(int ignoredArg0) {
        getAllProduct.validateHttpResponseCode200();
    }
    @And("I received valid data for all products")
    public void iReceivedValidDataForAllProducts() {
        getAllProduct.validateDataDetailProduct();
    }





    @Given("I set DELETE endpoints")
    public void iSetDELETEEndpoints() { deleteProduct.iSetDELETEEndpoints();
    }

    @When("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest() { deleteProduct.iSendDELETEHTTPRequest();
    }

    @Then("I receive a valid HTTP response code {int} in products DELETE")
    public void iReceiveAValidHTTPResponseCodeOnAProductDELETE(int ignoredArg0) { deleteProduct.iReceiveAValidHTTPResponseCodeOnAProductDELETE();
    }

    @Given("I set POST endpoints")
    public void iSetPOSTEndpoints() { postProduct.iSetPOSTEndpoints();
    }

    @When("I send POST HTTP request")
    public void iSendPOSTHTTPRequest() { postProduct.iSendPOSTHTTPRequest();

    }

    @Then("I receive a valid HTTP response code {int} in products POST")
    public void iReceiveAValidHTTPResponseCodeInProductsPOST(int ignoredArg0) { postProduct.iReceiveAValidHTTPResponseCodeInProductsPOST();

    }

    @And("I receive valid data for new product")
    public void iReceiveValidDataForNewUser() { postProduct.iReceiveValidDataForNewProduct();

    }

    @Given("I set GET endpoints by rating")
    public void iSetGETEndpointsByRating() { getProductRating.iSetGETEndpointsByRating();

    }

    @When("I send GET HTTP request by rating")
    public void iSendGETHTTPRequestByRating() { getProductRating.iSendGETHTTPRequestByRating();

    }

    @Then("I receive valid HTTP response code {int} for Get rating data products")
    public void iReceiveValidHTTPResponseCodeForGetRatingDataProducts(int ignoredArg0) { getProductRating.iReceiveValidHTTPResponseCodeForGetRatingDataProducts();

    }

    @And("I receive valid data for rating products")
    public void iReceiveValidDataForRatingProducts() { getProductRating.iReceiveValidDataForRatingProducts();

    }

    @Given("I set GET endpoints by comment")
    public void iSetGETEndpointsByComment() { getProductComment.iSetGETEndpointsByComment();

    }

    @When("I send GET HTTP request by comment")
    public void iSendGETHTTPRequestByComment() { getProductComment.iSendGETHTTPRequestByComment();


    }

    @Then("I receive valid HTTP response code {int} for Get comment data products")
    public void iReceiveValidHTTPResponseCodeForGetCommentDataProducts(int ignoredArg0) { getProductComment.iReceiveValidHTTPResponseCodeForGetCommentDataProducts();

    }

    @And("I receive valid data for comment products")
    public void iReceiveValidDataForCommentProducts() { getProductComment.iReceiveValidDataForCommentProducts();
    }



}
