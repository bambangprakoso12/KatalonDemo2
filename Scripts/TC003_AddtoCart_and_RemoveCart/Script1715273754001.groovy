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

WebUI.setText(findTestObject('Object Repository/addtocart_and_removecart/username_editTestPositive'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/addtocart_and_removecart/password_editTextPositive'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/addtocart_and_removecart/login_button'))

WebUI.click(findTestObject('Object Repository/addtocart_and_removecart/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/addtocart_and_removecart/a_1'))

WebUI.click(findTestObject('Object Repository/addtocart_and_removecart/button_Remove'))

WebUI.click(findTestObject('Object Repository/addtocart_and_removecart/button_Continue Shopping'))

WebUI.click(findTestObject('Object Repository/addtocart_and_removecart/button_Open Menu'))

WebUI.click(findTestObject('Object Repository/addtocart_and_removecart/a_Logout'))

