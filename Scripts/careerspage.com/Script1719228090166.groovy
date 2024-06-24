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

WebUI.navigateToUrl('https://www.careers-page.com/newjobs4u-careers')

WebUI.click(findTestObject('Object Repository/Page_- NewJobs4u  Career Page/h5_Procurement Officer'))

WebUI.click(findTestObject('Object Repository/Page_Procurement Officer - NewJobs4u  Career Page/button_Apply for Position'))

WebUI.setText(findTestObject('Object Repository/Page_Procurement Officer - NewJobs4u  Career Page/input__1203007'), 'Paul')

WebUI.setText(findTestObject('Object Repository/Page_Procurement Officer - NewJobs4u  Career Page/input__1203008'), 'paulvj@iafrica.com')

WebUI.setText(findTestObject('Object Repository/Page_Procurement Officer - NewJobs4u  Career Page/input__1203009'), '0834443608')

WebUI.setText(findTestObject('Object Repository/Page_Procurement Officer - NewJobs4u  Career Page/textarea_Cover Letter_1203010'), 
    'testing')

WebUI.setText(findTestObject('Object Repository/Page_Procurement Officer - NewJobs4u  Career Page/input_Expected Salary_1233026'), 
    '10000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Procurement Officer - NewJobs4u  Career Page/select_Barbados dollar                     _e5a74f'), 
    '95', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Procurement Officer - NewJobs4u  Career Page/select_Barbados dollar                     _e5a74f'), 
    '15', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Procurement Officer - NewJobs4u  Career Page/select_Select Notice Period Immediately10 d_2a7051'), 
    '30 00:00:00', true)

WebUI.click(findTestObject('Object Repository/Page_Procurement Officer - NewJobs4u  Career Page/input_Notice Period_terms_and_condition'))

WebUI.click(findTestObject('Object Repository/Page_Procurement Officer - NewJobs4u  Career Page/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Procurement Officer - NewJobs4u  Career Page/a_Job Openings'))

WebUI.closeBrowser()

