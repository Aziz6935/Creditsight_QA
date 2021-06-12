import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://www-qa.staging.creditsights.com/login/')

WebUI.setText(findTestObject('Object Repository/Page_CreditSights (QA) - Login/input_username_username'), 'a.higherpower')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CreditSights (QA) - Login/input_password_password'), 'BHDR9pWVXLG0HNOBuHCiHw==')

WebUI.click(findTestObject('Object Repository/Page_CreditSights (QA) - Login/button_Log In'))

/*
 * WebUI.click(findTestObject('Object Repository/Page_CreditSights (QA) - My
 * CS/span_a.higherpower'))
 * 
 * WebUI.click(findTestObject('Object Repository/Page_CreditSights (QA) - My
 * CS/span_Member Admin'))
 */
WebUI.navigateToUrl('https://admin-qa.staging.creditsights.com/admin/member/lookup/draft')
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CreditSights - Member Lookup/canvas'), 20)

WebUI.click(findTestObject('Object Repository/Page_CreditSights - Member Lookup/a_ New'))

WebUI.click(findTestObject('Object Repository/Page_CreditSights - Member Lookup/a_Snippet'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CreditSights - Snippet title/input_a.higherpower_ctl00ctl00ctl00ContentP_75c7b8'), 
    20)

WebUI.clearText(findTestObject('Object Repository/Page_CreditSights - Snippet title/input_a.higherpower_ctl00ctl00ctl00ContentP_75c7b8'))

WebUI.setText(findTestObject('Object Repository/Page_CreditSights - Snippet title/input_a.higherpower_ctl00ctl00ctl00ContentP_75c7b8'), 
    'US Marketing Consent')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CreditSights - Snippet title/select_NoneIn The NewsPerson BioEventChart _7d5653'), 
    'Boilerplate', true)

WebUI.setText(findTestObject('Object Repository/Page_CreditSights - Snippet title/input_Key_ctl00ctl00ctl00ContentPlaceHolder_42cd71'), 
    'Marketing_Consent')

WebUI.setText(findTestObject('Object Repository/Page_CreditSights - Snippet title/div_ajjjjjjjjjjjjjjjjjjjjnsxjakc dhhhhhhhhh_3e41fe'), 
    '<p style="">ajjjjjjjjjjjjjjjjjjjjnsxjakc dhhhhhhhhhhhhhhhhhhhhhhhhhhhhh&nbsp;</p>')

WebUI.click(findTestObject('Object Repository/Page_CreditSights - Snippet title/div_Countries'))

WebUI.setText(findTestObject('Object Repository/Page_CreditSights - Snippet title/input_Countries_ctl00ctl00ctl00ContentPlace_53ae1b'), 
    'US')

WebUI.click(findTestObject('Object Repository/Page_CreditSights - Snippet title/div_United States'))

WebUI.click(findTestObject('Object Repository/Page_CreditSights - Snippet title/input_UBS_ctl00ctl00ctl00ContentPlaceHolder_fa524b'))

/*
 * WebUI.click(findTestObject('Object Repository/Page_CreditSights - Snippet
 * title/a_Member Admin'))
 * 
 * WebUI.click(findTestObject('Object Repository/Page_CreditSights - Snippet
 * title/input_UBS_ctl00ctl00ctl00ContentPlaceHolder_316454'))
 * 
 * WebUI.click(findTestObject('Object Repository/Page_CreditSights - Snippet
 * title/input_UBS_ctl00ctl00ctl00ContentPlaceHolder_fa524b'))
 */
WebUI.acceptAlert()

