package Test;

import Base.BaseTest;
import com.saucedemo.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    @Test
    public void testProductHeaderIsDisplayed(){
        ProductPage productPage=loginPage.logIntoApplication("standard_user","secret_sauce");
        Assert.assertTrue(productPage.isProductHeaderDisplayed());
    }
}
