package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopPageObj extends Base {

	public DesktopPageObj() {
		PageFactory.initElements(driver, this);
	}

	// Finding Elements at Desktop page of Retail Web-site
	@FindBy(linkText = "Desktops")
	private WebElement desktopButton;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktops;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private boolean allDesktopElments;

	@FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
	private WebElement clickOnHP;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement selectQauntity;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageOnHP;

	@FindBy(linkText = "Desktops")
	private WebElement clickOnDesktopButton;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showBackAllDesktops;

	// User add Canon EOS 5Dfrom Desktops tab to the cart
	@FindBy(xpath = "//a[contains(text(),'Canon EOS 5D')]")
	private WebElement clickOnCanon;

	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement clickOnSeletct;

	@FindBy(xpath = "//option[contains(text(),'Red')]")
	private WebElement selectRedColor;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement addingQuatity;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartCanonButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageOnCanon;

	// Clicking on Canon EOS 5D and adding customer reviews
	@FindBy(xpath = "//a[contains(text(),'Reviews (0)')]")
	private WebElement clickOnReview;

	@FindBy(id = "input-name")
	private WebElement yourName;

	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement yourReview;

	@FindBy(xpath = "(//input[@name='rating'])[5]")
	private WebElement ratingGood;

	@FindBy(id = "button-review")
	private WebElement buttonReviewContinueButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement reviewOutcomeMessage;

	// Creating methods to perform actions on desktop to add HP LP3065
	public void clickOnDesktops() {
		desktopButton.click();
	}

	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}

	public boolean allDesktopElments() {
		return allDesktopElments;
	}

	public void clickAddToCart() {
		clickOnHP.click();
	}

	public void selectQauntity() {
		selectQauntity.clear();
		selectQauntity.sendKeys("1");
	}

	public void clickAddToCartButton() {
		addToCartButton.click();
	}

	public void successMessageOnHP() {
		successMessageOnHP.isDisplayed();
	}

	// Methods for Canon EOS 5D and adding customer reviews
	public void clickBackOnDesktops() {
		clickOnDesktopButton.click();
	}

	public void clickBackOnShowAllDesktops() {
		showBackAllDesktops.click();
	}

	public void clickOnCanon() {
		clickOnCanon.click();
	}

	public void clickOnSeletct() {
		clickOnSeletct.click();
	}

	public void selectRedColor() {
		selectRedColor.click();
	}

	public void addingQuatity() {
		addingQuatity.click();
	}

	public void addToCartCanonButton() {
		addToCartCanonButton.click();
	}

	public void successMessageOnCanon() {
		successMessageOnCanon.isDisplayed();
	}

	public void clickOnReview() {
		clickOnReview.click();
	}

	public void clickYourName(String name) {
		yourName.sendKeys("Sabour Azadani");
	}

	public void clickYourReview(String string) {
		yourReview.sendKeys("Hi Everyone Out There! I have recently purchased Canon EOS 5D and I'm very "
				+ "satisified with usage and it's performance. I highly recommend this for you and everyone.");
	}

	public void clickRatingGood(String ratingType) {
		ratingGood.click();
	}

	public void buttonReviewContinueButton() {
		buttonReviewContinueButton.click();
	}

	public boolean reviewOutcomeMessage() {
		boolean outcomeMessage = reviewOutcomeMessage.isDisplayed();
		return outcomeMessage;
	}

}