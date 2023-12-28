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

WebUI.click(findTestObject('Object Repository/Homepage/Mn_Usr'))

WebUI.waitForElementVisible(findTestObject('Login/Pg_Login'), 0)

WebUI.setText(findTestObject('Object Repository/Login/inpt_UsrNM'), User_Name)

WebUI.setText(findTestObject('Object Repository/Login/inpt_Pwd'), Password)

WebUI.click(findTestObject('Object Repository/Login/btn_SIGNIN'))

WebUI.waitForElementVisible(findTestObject('Homepage/Logo'), 0)

def Username = WebUI.getText(findTestObject('Object Repository/Login/Data_UsrNm'))

if (Username == User_Name) {
     WebUI.comment('Login successful! User is ' + Username) // Tambahkan kode atau tindakan tambahan jika login berhasil
    // Tambahkan kode atau tindakan tambahan jika login gagal
} else {
     WebUI.comment('Login failed! Expected user: rayidwi014, Actual user: ' + Username)


}

