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

WebUI.maximizeWindow()

//WebUI.setText(findTestObject('login_page/username_editText'), findTestData('user').getValue(1, 2))
//
//WebUI.setText(findTestObject('login_page/password_editText'), findTestData('user').getValue(2, 1))
//
//WebUI.click(findTestObject('login_page/login_button'))
//
//WebUI.verifyElementText(findTestObject('errorLoginInvalid_label'), 'Epic sadface: Sorry, this user has been locked out.')
for (def rowNum = 2; rowNum <= 3; rowNum++) {
    WebUI.setText(findTestObject('login_page/username_editText'), findTestData('user').getValue(1, rowNum))

    WebUI.setText(findTestObject('login_page/password_editText'), findTestData('user').getValue(2, rowNum))

    WebUI.click(findTestObject('login_page/login_button'))

    WebUI.verifyElementText(findTestObject('errorLoginInvalid_label'), findTestData('user').getValue(3, rowNum))
}

