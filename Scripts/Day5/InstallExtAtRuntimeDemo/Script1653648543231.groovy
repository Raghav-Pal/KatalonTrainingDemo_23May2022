import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

System.setProperty("webdriver.chrome.driver", "D:/Tools/Katalon/Katalon_Studio_Windows_64-8.3.0/configuration/resources/drivers/chromedriver_win32/chromedriver.exe")
	
ChromeOptions options = new ChromeOptions()

options.addExtensions(new File("C:/Users/Administrator/Desktop/ChromeExtensions/ljdobmomdgdljniojadhoplhkpialdid/5.8.3_0.crx"))

DesiredCapabilities caps = new DesiredCapabilities()

caps.setCapability(ChromeOptions.CAPABILITY, options)

WebDriver driver = new ChromeDriver(caps)

DriverFactory.changeWebDriver(driver)

WebUI.navigateToUrl('https://google.com')

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()
