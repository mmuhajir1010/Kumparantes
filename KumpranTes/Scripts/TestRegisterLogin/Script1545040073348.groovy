import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kumparan.com/')

WebUI.click(findTestObject('Object Repository/Regis/Page_Platform Media Berita Kolabora/button_TIDAK'))

WebUI.click(findTestObject('Object Repository/Regis/Page_Platform Media Berita Kolabora/span_Masuk dengan Google'))

WebUI.switchToWindowTitle('Masuk - Akun Google')

WebUI.setText(findTestObject('Object Repository/Regis/Page_Masuk - Akun Google/input_kumparan.com_identifier'), 'mmuhajir1010')

WebUI.click(findTestObject('Object Repository/Regis/Page_Masuk - Akun Google/content_Berikutnya'))

WebUI.setEncryptedText(findTestObject('Object Repository/Regis/Page_Masuk - Akun Google/input_Terlalu sering gagal_pas'), 
    'q2Vaax88tAK0LVJENWcd0g==')

WebUI.click(findTestObject('Object Repository/Regis/Page_Masuk - Akun Google/content_Berikutnya'))

WebUI.click(findTestObject('Object Repository/Regis/Page_Sign in - Google Accounts/content_Allow'))

WebUI.closeBrowser()

