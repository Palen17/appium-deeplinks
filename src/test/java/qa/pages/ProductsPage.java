package qa.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import qa.base.BasePage;

public class ProductsPage extends BasePage {

//    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Toggle\"]/preceding-sibling::android.widget.TextView")
    @AndroidFindBy (xpath = "//android.widget.TextView[@text='PRODUCTS']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"test-Toggle\"]/parent::*[1]/preceding-sibling::*[1]")
    private WebElement productTitleTxt;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"test-Item title\"])[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"test-Item title\"])[1]")
    private WebElement SLBTitle;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"test-Price\"])[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"test-Price\"])[1]")
    private WebElement SLBPrice;

    public String getTitle() {
        return wait.until(ExpectedConditions.visibilityOf(productTitleTxt)).getText();
    }

    public String getSLBTitle() {
        return wait.until(ExpectedConditions.visibilityOf(SLBTitle)).getText();
    }

    public String getSLBPrice() {
        return wait.until(ExpectedConditions.visibilityOf(SLBPrice)).getText();
    }

    public ProductDetailsPage pressSLBTitle() {
        wait.until(ExpectedConditions.visibilityOf(SLBTitle)).click();
        return new ProductDetailsPage();
    }
}
