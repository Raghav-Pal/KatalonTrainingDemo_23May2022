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

WebUI.navigateToUrl('http://the-internet.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/WEB/Page_The Internet/li_Context Menu'))

WebUI.click(findTestObject('Object Repository/WEB/Page_The Internet/a_JavaScript Alerts'))

WebUI.click(findTestObject('Object Repository/WEB/Page_The Internet/button_Click for JS Alert'))

WebUI.waitForAlert(4)

WebUI.verifyAlertPresent(4)

WebUI.delay(4)

WebUI.acceptAlert()

WebUI.delay(4)

WebUI.verifyTextPresent('You successfully clicked an alert', false)

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/WEB/Page_The Internet/button_Click for JS Confirm'))

WebUI.waitForAlert(4)

WebUI.verifyAlertPresent(4)

WebUI.dismissAlert()

WebUI.delay(4)

WebUI.verifyTextPresent('You clicked: Cancel', false)

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/WEB/Page_The Internet/button_Click for JS Prompt'))

WebUI.waitForAlert(4)

WebUI.verifyAlertPresent(4)

WebUI.setAlertText('')

WebUI.delay(4)

WebUI.acceptAlert()

WebUI.verifyTextPresent('You entered: Automation', false)

WebUI.delay(4)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/WEB/Page_The Internet/p_You entered null'), 'You entered: null')

WebUI.closeBrowser()

