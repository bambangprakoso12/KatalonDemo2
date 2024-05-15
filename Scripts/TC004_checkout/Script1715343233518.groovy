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

WebUI.setText(findTestObject('login_page/username_editText'), 'standard_user')

WebUI.setText(findTestObject('login_page/password_editText'), 'secret_sauce')

WebUI.click(findTestObject('login_page/login_button'))

WebUI.click(findTestObject('checkout_page/button_Add to cart'))

WebUI.click(findTestObject('checkout_page/button_Shopping cart'))

WebUI.click(findTestObject('checkout_page/button_checkout'))

WebUI.setText(findTestObject('checkout_page/input_firstname'), 'Bams')

WebUI.setText(findTestObject('checkout_page/input_lastname'), 'Prakoso')

WebUI.setText(findTestObject('checkout_page/input_Checkout Your Information_postal code'), '15810')

WebUI.click(findTestObject('checkout_page/button_continue'))

WebUI.click(findTestObject('checkout_page/button_finish'))

WebUI.click(findTestObject('checkout_page/button_BackHome'))

WebUI.click(findTestObject('checkout_page/burger_menu'))

WebUI.click(findTestObject('checkout_page/logout'))

