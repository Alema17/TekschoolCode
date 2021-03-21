package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopAndNoteBooksPageObjects extends Base {

	public LaptopAndNoteBooksPageObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement laptopAndNoteBookTab;

	public void clickOnLaptopAndNoteBookTab() {
		laptopAndNoteBookTab.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement showAllLaptopAndNoteBook;

	public void clickOnShowAllLaptopAndNoteBook() {
		showAllLaptopAndNoteBook.click();
	}

	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement macBookItem;

	public void clickOnMackBookItem() {
		macBookItem.click();
	}

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartMacBookButton;

	public void clickOnAddToCartMacBookButton() {
		addToCartMacBookButton.click();
	}

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartOption;

	public void clickOnCartOption() {
		cartOption.click();
	}

	@FindBy(xpath = "//i[@class='fa fa-times']")
	private WebElement redXButton;

	public void clickOnRedXButton() {
		redXButton.click();
	}

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement comparisonMacBookIcon;

	public void clickOnComparisonMacBookIcon() {
		comparisonMacBookIcon.click();
	}

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement comparisonMacBookAirIcon;

	public void clickOnComparisonMacBookAirIcon() {
		comparisonMacBookAirIcon.click();
	}

	@FindBy(xpath = "//a[contains(text(), 'product comparison')]")
	private WebElement productComparisonLink;

	public void clickOnProductComparisonLink() {
		productComparisonLink.click();
	}

	@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement heartIconSonyVaio;

	public void clickOnheartIconSonyVaio() {
		heartIconSonyVaio.click();
	}

	@FindBy(xpath = "//img[@title='MacBook Pro']")
	private WebElement macBookProItem;

	public void clickOnmacBookProItem() {
		macBookProItem.click();

	}
}