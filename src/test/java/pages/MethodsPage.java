package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BasePage;
import org.openqa.selenium.JavascriptExecutor;

import javax.lang.model.util.Types;
import java.util.List;
public class MethodsPage extends BasePage {

    public MethodsPage(AppiumDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "iv_item")
    WebElement clickAllCategory;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[23]")
    WebElement selectTrainElement;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]")
    WebElement sourceStation;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView")
    WebElement sourceStationName;

    @AndroidFindBy(id = "tv_destination_station")
    WebElement destinationStation;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.TextView")
    WebElement destinationStationName;

    @AndroidFindBy(id = "sw_round_trip")
    WebElement selectRoundTrip;

    @AndroidFindBy(id = "tv_start_date")
    WebElement selectStartDate;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@content-desc=\"28\"]")
    WebElement setStartDate;

    @AndroidFindBy(id = "tv_return_date")
    WebElement selectReturnDate;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Lanjut\"]")
    WebElement goToNextMonth;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@content-desc=\"20\"]")
    WebElement setReturnDate;

    @AndroidFindBy(id = "bt_select_train")
    WebElement search;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.Button")
    WebElement bookTrain;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.Button")
    WebElement bookTicket;

    @AndroidFindBy(id = "tv_see_details")
    WebElement seeDetails;


    @AndroidFindBy()
    List<WebElement> listOfSourceStations;

    public String returnSelectedSourceStation(int i) {
        return getTextWithIndex(listOfSourceStations,i,3);

    }

    public void selectSourceStation() {
        click(sourceStation, 5);

    }

    public void setSourceStation() {
        click(sourceStationName, 5);
    }

    public void selectDestinationStation() {
        click(destinationStation, 5);
    }

    public void setDestinationStation() {
        click(destinationStationName, 5);
    }

    public void selectRoundTrip() {
        click(selectRoundTrip, 5);
    }


    public void selectTrain() {
        click(selectTrainElement, 5);
    }

    public void clickAllCategory() {
        click(clickAllCategory, 5);
    }

    public void selectAndSetStartDate() {
        click(selectStartDate, 5);
        click(setStartDate, 5);
    }

    public void selectAndSetReturnDate() {
        click(selectReturnDate, 5);
        click(goToNextMonth, 5);
        click(setReturnDate, 5);
    }

    public void search() {
        click(search, 5);
    }

    public void bookTrain() {
        click(bookTrain, 5);
        click(bookTicket, 5);
    }

    public void productDetails() {
        click(seeDetails, 5);
    }
}
