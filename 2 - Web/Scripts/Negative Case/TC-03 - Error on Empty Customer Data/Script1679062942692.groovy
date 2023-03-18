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

// Pastikan Muncul Error ketika semua Field Customer Kosong
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.web)

WebUI.click(findTestObject('Object Repository/EmptyData/a_BUY NOW'))

WebUI.click(findTestObject('Object Repository/EmptyData/input_email'))
WebUI.setText(findTestObject('Object Repository/EmptyData/input_email'), ' ')

WebUI.click(findTestObject('Object Repository/EmptyData/input_name'))
WebUI.setText(findTestObject('Object Repository/EmptyData/input_name'), ' ')

WebUI.click(findTestObject('Object Repository/EmptyData/input_phone'))
WebUI.setText(findTestObject('Object Repository/EmptyData/input_phone'), ' ')

WebUI.click(findTestObject('Object Repository/EmptyData/input_postal'))
WebUI.setText(findTestObject('Object Repository/EmptyData/input_postal'), ' ')

WebUI.click(findTestObject('Object Repository/EmptyData/input_city'))
WebUI.setText(findTestObject('Object Repository/EmptyData/input_city'), ' ')

WebUI.setText(findTestObject('Object Repository/EmptyData/textarea_MidPlaza 2, 4th Floor Jl.Jend.Sudi_875190'), '')

WebUI.click(findTestObject('Object Repository/EmptyData/div_CHECKOUT'))

WebUI.verifyElementText(findTestObject('Object Repository/EmptyData/span_Sorry, something went wrong'), 'Sorry, something went wrong.')

