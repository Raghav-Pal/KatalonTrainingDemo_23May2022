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

WebUI.navigateToUrl('https://katalon.com/')

WebUI.click(findTestObject('Object Repository/Page_Katalon  Simplify Web, API, Mobile, De_2f1b85/img'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Katalon  Simplify Web, API, Mobile, De_2f1b85/a_Products'))

WebUI.click(findTestObject('Object Repository/Page_Katalon  Simplify Web, API, Mobile, De_2f1b85/div_Katalon Studio'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Katalon Studio  The Best Low Code Test_fef16f/a_Resources'))

WebUI.click(findTestObject('Object Repository/Page_Katalon Studio  The Best Low Code Test_fef16f/div_Documentation'))

not_run: WebUI.switchToWindowTitle('Welcome to Katalon Docs | Katalon Docs')

WebUI.mouseOver(findTestObject('Object Repository/Page_Welcome to Katalon Docs  Katalon Docs/a_Plugins'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Welcome to Katalon Docs  Katalon Docs/a_Katalon TestOps'))

WebUI.closeBrowser()

