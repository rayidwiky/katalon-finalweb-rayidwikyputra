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

WebUI.navigateToUrl('https://advantageonlineshopping.com/')

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Homepage/Logo'), 0)

WebUI.click(findTestObject('Homepage/Mn_Usr'))

WebUI.waitForElementVisible(findTestObject('Login/Pg_Login'), 0)

WebUI.click(findTestObject('Object Repository/SignUp/btn_CreateAcc'))

WebUI.waitForElementVisible(findTestObject('SignUp/Pg_register'), 0)

WebUI.setText(findTestObject('Object Repository/SignUp/inpt_UserNm'), 'rayidwi014')

WebUI.setText(findTestObject('Object Repository/SignUp/inpt_Email'), 'rayidwiiiii@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/inpt_Pwd'), 'CcY3C8ez4dcPTAH5wSRG6A==')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/inpt_PwdConfirm'), 'CcY3C8ez4dcPTAH5wSRG6A==')

WebUI.click(findTestObject('Object Repository/SignUp/btn_Agree'))

WebUI.click(findTestObject('Object Repository/SignUp/btn_register'))

