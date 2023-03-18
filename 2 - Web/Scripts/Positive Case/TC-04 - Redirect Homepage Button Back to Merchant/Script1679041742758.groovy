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

WebUI.navigateToUrl(GlobalVariable.web)

WebUI.click(findTestObject('Object Repository/BackToMerchant/a_BUY NOW'))

WebUI.click(findTestObject('Object Repository/BackToMerchant/div_CHECKOUT'))

WebUI.click(findTestObject('Object Repository/BackToMerchant/a_GoPayQRIS'))

WebUI.click(findTestObject('Object Repository/BackToMerchant/button_Back to merchant'))

WebUI.verifyElementPresent(findTestObject('Object Repository/BackToMerchant/div_Midtrans PillowRp 20,000Get cozy with o_4052a0'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/BackToMerchant/div_Midtrans PillowRp 20,000Get cozy with o_4052a0'))

