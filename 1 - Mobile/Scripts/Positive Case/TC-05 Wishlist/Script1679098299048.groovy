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

WebUI.callTestCase(findTestCase('InitApp'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Wishlist/android.support.v7.app.ActionBarTab'), 0)

Mobile.tap(findTestObject('Object Repository/Wishlist/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Wishlist/android.widget.ImageView'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Wishlist/android.widget.TextView - In Wishlist'), 'In Wishlist')

Mobile.tap(findTestObject('Object Repository/Wishlist/android.widget.TextView - Add to Bag'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Wishlist/android.widget.TextView - Added'), 'Added')

Mobile.tap(findTestObject('Object Repository/Wishlist/android.widget.ImageView (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Wishlist/android.widget.TextView - 2'), '2')

Mobile.tap(findTestObject('Object Repository/Wishlist/android.widget.ImageView (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Wishlist/android.widget.TextView - 3'), '3')

Mobile.tap(findTestObject('Object Repository/Wishlist/android.widget.ImageView (2)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Wishlist/android.widget.TextView - 2'), '2')

Mobile.tap(findTestObject('Object Repository/Wishlist/android.widget.ImageView (2)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Wishlist/android.widget.TextView - 1'), '1')

Mobile.tap(findTestObject('Object Repository/Wishlist/android.widget.ImageView (2)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Wishlist/android.widget.TextView - Add to Bag'), 'Add to Bag')

Mobile.closeApplication()

