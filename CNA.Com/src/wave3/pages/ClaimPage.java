package wave3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClaimPage extends BasePage {
//	@FindBy(id="linkedInButtonId")
//	public WebElement linkedInButton;
	
//	@FindBy(id="twitterButtonId")
//	public WebElement twitterIdButton;
	
//	@FindBy(id="shareemail")
//	public WebElement shareEmailButton;
	
	@FindBy(id="printButtonId")
	public WebElement printIdButton;
	
	@FindBy(id="sharepanel")
	public WebElement sharebutton;
	
//	@FindBy(id="sharepanel")
//	public WebElement gmailbutton;
	
	public boolean socialIcon() {
		
		boolean print =printIdButton.isDisplayed();
		boolean share = sharebutton.isDisplayed();
		return  share && print;
	}
	public boolean socialicon() {
		boolean linkedIn = linkedInButton.isDisplayed();
		boolean twitter = twitterIdButton.isDisplayed();
		boolean print = printIdButton.isDisplayed();
		boolean share = shareEmailButton.isDisplayed();
		return linkedIn && twitter && print&& share;
	}
	
	@FindBy(id = "compensationDD")
	public WebElement dropDownValue;

	@FindBy(id = "claimformns_FirstNamePR")
	public WebElement firstNamePR;
	
	@FindBy(id="claimformns_ClaimantFirstNamePR")
	public WebElement healthCareClaimFirstName;
	
	@FindBy(id="claimformns_ClaimantLastNamePR")
	public WebElement healthCareClaimLastName;

	@FindBy(id = "claimformns_LastNamePR")
	public WebElement lastNamePR;
	
	@FindBy(id="claimformns_companyPR")
	public WebElement companyPR;
	
	@FindBy(id="claimformns_emailAddressPR")
	public WebElement emailAddress;
	
	
	@FindBy(id="claimformns_informationRelationshipPR")
	public WebElement relationToInsuredCompanydropDown;
	
	@FindBy(id="claimformns_addressIA")
	public WebElement insuredCompanyAddresse;
	
	@FindBy(id="claimformns_cityIA")
	public WebElement insuredCity;
	
	@FindBy(id="claimformns_stateI")
	public WebElement insuredState;
	
	@FindBy(id="claimformns_zipcodeIA")
	public WebElement insuredZipcode;
	
	@FindBy(id="claimformns_policyNumber")
	public WebElement insuredPolicyNumber;
	
	@FindBy(id="claimformns_claimSurveyRecipFirstName")
	public WebElement claimSurveyRecipFirstName;
	
	@FindBy(id="claimformns_claimSurveyRecipLastName")
	public WebElement claimSurveyRecipLastName;
	
	@FindBy(id="claimformns_claimSurveyRecipientEmail")
	public WebElement claimSurveyRecipientEmail;
	
	@FindBy(id="claimformns_ClaimantFirstNamePR")
	public WebElement claimantFirstNamePR;
	
	@FindBy(id="claimformns_ClaimantLastNamePR")
	public WebElement claimantLastNamePR;
	
	@FindBy(id="claimformns_ClaimantphoneNumberPR")
	public WebElement claimantphoneNumberPR;
	
	@FindBy(id="claimformns_ClaimantaddressIA")
	public WebElement claimantaddressIA;

	@FindBy(id = "claimformns_phoneNumberPR")
	public WebElement phoneNumberPR;

	@FindBy(id = "claimformns_companyName")
	public WebElement companyName;
	
	@FindBy(id="#claimformns_lawsuitcityL")
	public WebElement lawsuitCity;
	
	@FindBy(id="#claimformns_lawsuitState")
	public WebElement lawSuitState;
	
	@FindBy(id="GLanyWitnesses")
	public WebElement witness;
	
	@FindBy(id="claimformns_GLwitnessFN")
	public WebElement witnessFirstName;
	
	@FindBy(id="claimformns_GLwitnessLN")
	public WebElement witnessLastName;
	
	@FindBy(id="anyoneInjured")
	public WebElement injured;
	
	@FindBy(id="claimformns_InjuredPersonFN")
	public WebElement injuredFN;
	
	@FindBy(id="claimformns_InjuredPersonLN")
	public WebElement injuredLN;
	
	@FindBy(id="claimformns_InjuredPersonDesc")
	public WebElement injuryDesc;

	@FindBy(id = "claimAutoNext")
	public WebElement clickNext;

	@FindBy(id = "claimformns_incidentDate")
	public WebElement incidentDate;

	@FindBy(id = "claimformns_address")
	public WebElement claimAddress;

	@FindBy(id = "claimformns_incidentDesc")
	public WebElement claimIncidentDescription;

	@FindBy(id = "claimFormGLNext")
	public WebElement claimGLNext;
	
	@FindBy(id="claimformns_AUDriverFName")
	public WebElement claimDriverFname;
	
	@FindBy(id="claimformns_AUDriverLName")
	public WebElement claimDriverLname;
	
	@FindBy(id="claimformns_AUDriverPhone")
	public WebElement claimDriverPhone;
	
	@FindBy(id="claimformns_AUDriverAddress")
	public WebElement claimDriverAddress;
	
	@FindBy(id="claimformns_AUDriverYear")
	public WebElement claimDriverYear;
	
	@FindBy(id="subNavbarDiv_claimcenter")
	public WebElement claimCenterlink;
	
	@FindBy(id="@id='claimPropertyNext")
	public WebElement NextButton;
	
	@FindBy(id="claimformns_addtionalDesc")
	public WebElement claimFormAdditionalDesc;
	
	@FindBy(id="claimSubmit")
	public WebElement claimSubmit;
	
	@FindBy(id="claimPropertyNext")
	public WebElement claimPropertyNext;
	
	@FindBy(id="claimformns_cityL")
	public WebElement claimCity;
	
	@FindBy(id="claimformns_incidentState")
	public WebElement claimState;
	
	@FindBy(id="claimformns_stateI")
	public WebElement claimFormState;
	
	@FindBy(id="claimFormWCNext")
	public WebElement claimFormWCNext;
	
	@FindBy(id="claimformns_firstNameID")
	public WebElement firstNameID;
	
	@FindBy(id="claimformns_lastNameID")
	public WebElement lastNameID;
	
	@FindBy(id="claimformns_nodependentsL")
	public WebElement claimDependents;
	
	@FindBy(id="claimformns_occupation")
	public WebElement claimOccupation;
	
	@FindBy(id="claimformns_supervisorFName")
	public WebElement claimSupervisor;
	
	@FindBy(id="claimformns_daysPerWeek")
	public WebElement claimDays;
	
	@FindBy(id="claimformns_insureddDate")
	public WebElement claimInsuredDate;
	
	@FindBy(id="claimformns_FirstNameMCPR")
	public WebElement mainClaimantFirstName;
	
	@FindBy(id="claimformns_LastNameMCPR")
	public WebElement mainClaimantLastName;
	
	@FindBy(id="claimformns_businessPhoneMCPR")
	public WebElement mainClaimantPhone;
	
	@FindBy(id="claimformns_emailAddressMCPR")
	public WebElement mainClaimantEmail;
	
	@FindBy(id="claimformns_relationMCPR")
	public WebElement mainCLaimantRelation;
	
	@FindBy(id="claimformns_GLreportNumber")
	public WebElement reportnumber;
	
	@FindBy(id="claimformns_GLreportType")
	public WebElement reportType;
	
	@FindBy(id="claimformns_freseniusWCBeanInsuredLocationCode")
	public WebElement locationCode;
	
	@FindBy(id="claimPropertyNext")
	public WebElement Nextbutton;
	
	

	public ClaimPage(WebDriver driver, long timeout) {
		super(driver, timeout);
		PageFactory.initElements(driver, this);
	}
	
	public WebElement SkipFallTitle() {
		WaitforElementToBeVisible(By.xpath("//h1[@class='ccHeader ML8p']"));
		return driver.findElement(By.xpath("//h1[@class='ccHeader ML8p']"));
	}
	
	public WebElement twitterIdButton() {
		WaitforElementToBeVisible(By.xpath("//img[@alt='Share this content on Twitter']"));
		return driver.findElement(By.xpath("//img[@alt='Share this content on Twitter']"));
	}
	public WebElement linkedinbutton() {
		WaitforElementToBeVisible(By.xpath("//img[@alt='Share this content on LinkedIn']"));
		return driver.findElement(By.xpath("//img[@alt='Share this content on LinkedIn']"));
	}
	public WebElement gmailbutton() {
		WaitforElementToBeVisible(By.id("shareemail"));
		return driver.findElement(By.id("shareemail"));
	}
	public WebElement continuebutton() {
		WaitforElementToBeVisible(By.id("BtnCookiesXout"));
		return driver.findElement(By.id("BtnCookiesXout"));
	}
	public WebElement Cookie_PrivacyCenter() {
		WaitforElementToBeVisible(By.xpath("(//a[contains(text(),'Privacy Center')])[1]"));
		return driver.findElement(By.xpath("(//a[contains(text(),'Privacy Center')])[1]"));
	}
	public WebElement shareicon() {
		WaitforElementToBeVisible(By.xpath("//img[@alt='Share this content via email or social networks']"));
		return driver.findElement(By.xpath("//img[@alt='Share this content via email or social networks']"));
	}
	
	public WebElement errorFieldFirstName() {
		WaitforElementToBeVisible(By.cssSelector("#claimFormSec1 > div:nth-child(3) > div.cfSpan2.cfSpanOffsetR > p"));
		return driver.findElement(By.cssSelector("#claimFormSec1 > div:nth-child(3) > div.cfSpan2.cfSpanOffsetR > p"));
	}
	
	public WebElement errorLastName() {
		WaitforElementToBeVisible(By.cssSelector("#claimFormSec1 > div:nth-child(3) > div.cfSpan2.cfSpanOffsetL > p"));
		return driver.findElement(By.cssSelector("#claimFormSec1 > div:nth-child(3) > div.cfSpan2.cfSpanOffsetL > p"));
	}
	
	public WebElement errorPhone() {
		WaitforElementToBeVisible(By.cssSelector("#claimFormSec1 > div:nth-child(4) > div.cfSpan2.cfSpanOffsetL > p"));
		return driver.findElement(By.cssSelector("#claimFormSec1 > div:nth-child(4) > div.cfSpan2.cfSpanOffsetL > p"));
	}
	
	public WebElement errorEmail() {
		WaitforElementToBeVisible(By.cssSelector("#claimFormSec1 > div:nth-child(5) > div.cfSpan2.cfSpanOffsetR > p"));
		return driver.findElement(By.cssSelector("#claimFormSec1 > div:nth-child(5) > div.cfSpan2.cfSpanOffsetR > p"));
	}
	public WebElement vaildEmail() {
		WaitforElementToBeVisible(By.cssSelector("#claimformns_emailAddressPR"));
		return driver.findElement(By.cssSelector("#claimformns_emailAddressPR"));
	}
	
	public WebElement errorCompanyName() {
		WaitforElementToBeVisible(By.cssSelector("#claimFormSec1 > div:nth-child(10) > div.cfSpan2.cfSpanOffsetR > p"));
		return driver.findElement(By.cssSelector("#claimFormSec1 > div:nth-child(10) > div.cfSpan2.cfSpanOffsetR > p"));
	}
	public WebElement reeipientSurveyCheckbox_Yes() {
		WaitforElementToBeVisible(By.xpath("//input[@id='claimformns_informationCustomerServiceSurvey' and @value='Yes']"));
		return driver.findElement(By.xpath("//input[@id='claimformns_informationCustomerServiceSurvey' and @value='Yes']"));
	}
	
	public WebElement reeipientSurveyCheckbox_No() {
		WaitforElementToBeVisible(By.xpath("//input[@id='claimformns_informationCustomerServiceSurvey' and @value='No']"));
		return driver.findElement(By.xpath("//input[@id='claimformns_informationCustomerServiceSurvey' and @value='No']"));
	}
	public WebElement insuredMainContact_Yes() {
		WaitforElementToBeVisible(By.xpath("//input[@id='claimformns_informationMainContactPR' and @value='Yes']"));
		return driver.findElement(By.xpath("//input[@id='claimformns_informationMainContactPR' and @value='Yes']"));
	}
	
	public WebElement claimant() {
		WaitforElementToBeVisible(By.xpath("//input[@id='claimformns_AUwhoseBehalf' and @value='Claimant']"));
	return driver.findElement(By.xpath("//input[@id='claimformns_AUwhoseBehalf' and @value='Claimant']"));
	}
	
	public WebElement agent() {
		WaitforElementToBeVisible(By.xpath("//input[@id='claimformns_AUwhoseBehalf' and @value='Agent']"));
	return driver.findElement(By.xpath("//input[@id='claimformns_AUwhoseBehalf' and @value='Agent']"));
	}
	public WebElement thirdParty() {
		WaitforElementToBeVisible(By.xpath("//input[@id='claimformns_AUwhoseBehalf' and @value='Third Party']"));
	return driver.findElement(By.xpath("//input[@id='claimformns_AUwhoseBehalf' and @value='Third Party']"));
	}
	
	public WebElement insuredMainContact_No() {
		WaitforElementToBeVisible(By.xpath("//input[@id='claimformns_informationMainContactPR' and @value='No']"));
		return driver.findElement(By.xpath("//input[@id='claimformns_informationMainContactPR' and @value='No']"));
	}
	
	public WebElement lawSuit_Yes() {
		WaitforElementToBeVisible(By.xpath("//input[@id='hasLawsuitBeenFiled' and @value='Yes']"));
		return driver.findElement(By.xpath("//input[@id='hasLawsuitBeenFiled' and @value='Yes']"));
	}
	
	public WebElement lawSuit_No() {
		WaitforElementToBeVisible(By.xpath("//input[@id='hasLawsuitBeenFiled' and @value='No']"));
		return driver.findElement(By.xpath("//input[@id='hasLawsuitBeenFiled' and @value='No']"));
	}
	
	public WebElement officialReport_Yes() {
		WaitforElementToBeVisible(By.xpath("//input[@id='claimformns_GLoficialReport' and @value='Yes']"));
		return driver.findElement(By.xpath("//input[@id='claimformns_GLoficialReport' and @value='Yes']"));
	}
	
	public WebElement departmentWrapper() {
		WaitforElementToBeVisible(By.xpath("//tr[@valign='top']"));
		return driver.findElement(By.xpath("//tr[@valign='top']"));
	}
	
	public WebElement WrapperText() {
		WaitforElementToBeVisible(By.xpath("//div[@class='claimWrapper']"));
		return driver.findElement(By.xpath("//div[@class='claimWrapper']"));
	}
	
	public WebElement officialReport_No() {
		WaitforElementToBeVisible(By.xpath("//input[@id='claimformns_GLoficialReport' and @value='No']"));
		return driver.findElement(By.xpath("//input[@id='claimformns_GLoficialReport' and @value='No']"));
	}
	
	public WebElement lossLocationInsured_Yes() {
		WaitforElementToBeVisible(By.xpath("//input[@id='LossLocationDescCheckbox' and @value='Yes']"));
		return driver.findElement(By.xpath("//input[@id='LossLocationDescCheckbox' and @value='Yes']"));
	}
	
	public WebElement lossLocationInsured_No() {
		WaitforElementToBeVisible(By.xpath("//input[@id='LossLocationDescCheckbox' and @value='No']"));
		return driver.findElement(By.xpath("//input[@id='LossLocationDescCheckbox' and @value='No']"));
	}

	public WebElement txtCID() {
		WaitforElementToBeVisible(By.name("username"));
		return driver.findElement(By.name("username"));
	}

	public WebElement claimImage() {
		WaitforElementToBeVisible(By.cssSelector("#heroImg > div.deskHeroImg.mHide > a > img"));
		return driver.findElement(By.cssSelector("#heroImg > div.deskHeroImg.mHide > a > img"));
	}

	public WebElement reportOnline() {
		WaitforElementToBeVisible(By.xpath("//a[contains(text(),'REPORT ONLINE')]"));
		return driver.findElement(By.xpath("//a[contains(text(),'REPORT ONLINE')]"));

	}
	
	public WebElement repprtNewOnline() {
		WaitforElementToBeVisible(By.xpath("//tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]"));
		
		return driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]"));
	}
	
	public WebElement manageOnline() {//*[@id="boxAreaWrapper"]/div/div[1]/div[2]/p/a
		WaitforElementToBeVisible(By.cssSelector("#boxAreaWrapper > div > div:nth-child(1) > div.claimWrapper > p > a"));
		return driver.findElement(By.cssSelector("#boxAreaWrapper > div > div:nth-child(1) > div.claimWrapper > p > a"));
	}
	
	public WebElement findAnAgent() {//body/div[1]/div[3]/div[12]/div[1]/div[1]/div[1]/div[1]/form[1]/section[2]/div[14]/div[1]/input[2]
		WaitforElementToBeVisible(By.xpath("//*[@class=\"cfRBtn halfBtn\" and @id=\"claimFormGLNext\"]"));
		return driver.findElement(By.xpath("//*[@class=\"cfRBtn halfBtn\" and @id=\"claimFormGLNext\"]"));
	}
	
	public WebElement findAnAgent1() {//body/div[1]/div[3]/div[12]/div[1]/div[1]/div[1]/div[1]/form[1]/section[2]/div[14]/div[1]/input[2]
		WaitforElementToBeVisible(By.xpath("//*[@class=\"cfRBtn halfBtn\" and @id=\"claimFormGLNext\"]"));
		return driver.findElement(By.xpath("//*[@class=\"cfRBtn halfBtn\" and @id=\"claimFormGLNext\"]"));
	}
	
	public WebElement subPoena() {
		
		WaitforElementToBeVisible(By.xpath("//input[@id='claimformns_actiontypeApp' and @value='Subpoena']"));
		return driver.findElement(By.xpath("//input[@id='claimformns_actiontypeApp' and @value='Subpoena']"));
	}
	
	public WebElement clickNextHEalthCare() {//*[@id="claimFormGLNext"]//*[contains(@class, 'cfRBtn halfBtn' and @id="claimFormGLNext"]
		WaitforElementToBeVisible(By.xpath("//*[@class=\"cfRBtn halfBtn\" and @id=\"claimFormGLNext\"]"));
		return	driver.findElement(By.xpath("//*[@class=\"cfRBtn halfBtn\" and @id=\"claimFormGLNext\"]"));
	}
	
	public WebElement clickOnNext3() {
		WaitforElementToBeVisible(By.xpath("//section[@id='claimFormSec3']//input[@id='claimFormGLNext']"));
		return driver.findElement(By.xpath("//section[@id='claimFormSec3']//input[@id='claimFormGLNext']"));
	}
	public WebElement clickOnNex2t() {
		WaitforElementToBeVisible(By.xpath("//section[@id='claimFormSec2']//input[@id='claimFormGLNext']"));
		return driver.findElement(By.xpath("//section[@id='claimFormSec2']//input[@id='claimFormGLNext']"));
	}
	
	public WebElement claimFormWCNet(){
		WaitforElementToBeVisible(By.xpath("//section[@id='claimFormSec2']//input[@id='claimFormWCNext']"));
		return driver.findElement(By.xpath("//section[@id='claimFormSec2']//input[@id='claimFormWCNext']"));
	}
	
	public WebElement claimFormWCNext3() {
		WaitforElementToBeVisible(By.xpath("(//input[@id='claimFormWCNext'])[3]"));
		return driver.findElement(By.xpath("(//input[@id='claimFormWCNext'])[3]"));
	}
	
	public WebElement NextbuttonN() {
		WaitforElementToBeVisible(By.xpath("//*[@class='cfRBtn halfBtn']"));
		return driver.findElement(By.xpath("//*[@class='cfRBtn halfBtn']"));
	}
	
	public WebElement claimPropertyNext() {
		WaitforElementToBeVisible(By.xpath("//body/div[1]/div[3]/div[12]/div[1]/div[1]/div[1]/div[1]/form[1]/section[2]/div[15]/div[1]/input[2]"));
		return driver.findElement(By.xpath("//body/div[1]/div[3]/div[12]/div[1]/div[1]/div[1]/div[1]/form[1]/section[2]/div[15]/div[1]/input[2]"));
	}


}
