package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailPageObjects extends Base {

	public RetailPageObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement clickOnAccount;

	public void clickOnAccount() {
		clickOnAccount.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement clickOnLogin;

	public void clickOnLogin() {
		clickOnLogin.click();
	}

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailAddress;

	public void emailAddress() {
		emailAddress.sendKeys("sabour.azadani@gmail.com");
	}

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password;

	public void password() {
		password.sendKeys("FakePass123");
	}

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;

	public void loginButton() {
		loginButton.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Edit your affiliate information')]")
	private WebElement registerAffiliateAccount;

	public void registerAffiliateAccount() {
		registerAffiliateAccount.click();
	}

	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement company;

	public void company() {
		company.clear();
		company.sendKeys("Azadani Dojo");
	}

	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement website;

	public void website() {
		website.clear();
		website.sendKeys("www.azadanidojo.us");
	}

	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxID;

	public void taxID() {
		taxID.clear();
		taxID.sendKeys("12345");
	}

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement paymentMethod;

	public void paymentMethod() {
		paymentMethod.click();
	}

	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement chequePayeeName;

	public void chequePayeeName() {
		chequePayeeName.clear();
		chequePayeeName.sendKeys("Azadani Dojo");
	}

//	@FindBy (xpath = "//input[@name='agree']")
//	private WebElement checkBox;
//	public void checkBox() {
//		checkBox.click();
//	}

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton;

	public void continueButton() {
		continueButton.click();
	}

	@FindBy(xpath = "//a[text()= 'Edit your affiliate information']")
	private WebElement editAffiliateInformation;

	public void editAffiliateInformation() {
		editAffiliateInformation.click();
	}

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransfareRadioButton;

	public void bankTransfareRadioButton() {
		bankTransfareRadioButton.click();
	}

	@FindBy(xpath = "//input[@name='bank_name']")
	private WebElement bankName;

	public void bankName(String bank) {
		WebDriverUtility.enterValue(bankName, bank);
	}

	@FindBy(xpath = "//input[@name='bank_branch_number']")
	private WebElement abaNumber;

	public void abaNumber(String accountNumber) {
		WebDriverUtility.enterValue(abaNumber, accountNumber);
	}

	@FindBy(xpath = "//input[@name='bank_swift_code']")
	private WebElement swiftCode;

	public void swiftCode(String sCode) {
		WebDriverUtility.enterValue(swiftCode, sCode);
	}

	@FindBy(xpath = "//input[@name='bank_account_name']")
	private WebElement accountName;

	public void accountName(String acctName) {
		WebDriverUtility.enterValue(accountName, acctName);
	}

	@FindBy(xpath = "//input[@name='bank_account_number']")
	private WebElement accountNumber;

	public void bankAccountNumberAffiliate(String acctNumber) {
		WebDriverUtility.enterValue(accountNumber, acctNumber);
	}

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButtonAffiliate;

	public void continueButtonAffiliate() {
		continueButtonAffiliate.click();
	}

	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccountInformation;

	public void editYourAccountInformation() {
		editYourAccountInformation.click();
	}

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;

	public void firstName(String ffName) {
		firstName.clear();
		WebDriverUtility.enterValue(firstName, ffName);
	}

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;

	public void lastName(String lName) {
		lastName.clear();
		WebDriverUtility.enterValue(lastName, lName);
	}

	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;

	public void email(String aemail) {
		email.clear();
		WebDriverUtility.enterValue(email, aemail);
	}

	@FindBy(xpath = "//input[@name='telephone']")
	private WebElement telephone;

	public void telephone(String ttelephone) {
		telephone.clear();
		WebDriverUtility.enterValue(telephone, ttelephone);
	}

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButtonEditAccount;

	public void continueButtonEditAccount() {
		continueButtonEditAccount.click();
	}

}