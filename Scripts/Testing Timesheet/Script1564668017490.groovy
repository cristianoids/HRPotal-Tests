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

WebUI.navigateToUrl('https://internal.itup.pt/Menu_HRPortal/NoPermission.aspx')

WebUI.setText(findTestObject('Object Repository/Test_Demo/Page_Login/input_Remember login_WebPatterns_wt11blockwtUsernamewtUserNameInput'), 
    'ines.peguicha.dev')

WebUI.setEncryptedText(findTestObject('Object Repository/Test_Demo/Page_Login/input_Remember login_WebPatterns_wt11blockwtPasswordwtPasswordInput'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Test_Demo/Page_Login/input_Remember login_WebPatterns_wt11blockwtActionwtLoginButton'))

WebUI.click(findTestObject('Object Repository/Test_Demo/Page_HomePage/span_Time Sheets'))

WebUI.click(findTestObject('Object Repository/Test_Demo/Page_MyTimeSheet/span_Approve Time Sheets_fa fa-fw fa-check-circle'))

WebUI.click(findTestObject('Object Repository/Test_Demo/Page_ListOfEmployeesToApproveTS/span_Management_Menu_DropDownArrow'))

WebUI.click(findTestObject('Object Repository/Test_Demo/Page_ListOfEmployeesToApproveTS/span_RowData'))

WebUI.click(findTestObject('Object Repository/Test_Demo/Page_RowData/span_Management_Menu_DropDownArrow'))

WebUI.click(findTestObject('Object Repository/Test_Demo/Page_RowData/span_Management_Menu_DropDownArrow'))

WebUI.click(findTestObject('Object Repository/Test_Demo/Page_RowData/span_Report'))

WebUI.click(findTestObject('Object Repository/Test_Demo/Page_Report/span_Management_Menu_DropDownArrow'))

WebUI.click(findTestObject('Object Repository/Test_Demo/Page_Report/a_Management'))

WebUI.click(findTestObject('Object Repository/Test_Demo/Page_Report/a_Timesheet Approved'))

WebUI.closeBrowser()

