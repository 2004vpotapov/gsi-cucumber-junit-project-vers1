@wip
Feature: User should be able to register new employer

Scenario: Verify the employer able to register new account

Given the user is on the home page
  #default page
  When user click to SignInRegister link
  #LoginIntro2 page
  And user click EmployersAndAgentsRegistration button
  #Registration/Emp/RegistrationType page
  And use click Close button on a Red banner
  And user click Direct Representative of your Organization checkBox
  And user click Next button
  #Registration/Emp/RegistrationType page
  And user click to Unemployment Tax and Benefit Services checkBox
  And user click to Continue Registration button
  #Registration/emp/TaxRegistration page
  And user select Do you have a UI EAN radioButton
  And user select Do you have a FEIN
  And user select Reason from dropDown
  And user click to Continue button
  #Registration/emp/default
  And user enter User name
  And user enter Password
  And user enter Confirm Password
  And Security Question
  And Security Question Response
  And user enter Legal Company name
  And user enter Trade Name
  And user enter ZipCode
  And user click at empty space
  And user enter Street Address One
  And user enter Mailing Address One
  And user enter Mailing ZipPostal
  And user enter Job Title
  And user enter Fist Name
  And user enter Last Name
  And user enter Primary Phone
  And user enter Contact Email Address
  And user enter Confirm Contact Email Address
  And user select a Method prefer to receive notification
  And user click to link Industry Title NAICS
  And user switch to drills-industry-inddrill window
  And user select link industries by Industry Code
  And user enter industry code into inputBox and click Search button
  And user click to link Industry code to confirm
  And user click Save and Continue button
  #Registration/emp/TaxContacts
  And use click to Use Primary CheckBox
  And user click to Continue button for Identify Contacts Page
  #Registration/Emp/Unemployment
  And user select Type of Organization
  And user select Type of Employment
  And user enter Date first Employed
  And user enter Number of Employees at Registration
  And user enter Number of Wokers
  And user enter Date of First Paid
  And user select checkBox Are you presently reporting
  And user select checkBox Will you be working in NE
  And user enter Name of Person Responsible
  And user enter Phone Number of Person Responsible
  And user select Have you previously had an account
  And user select Have you reorganized
  And use select Have you acquired another business
  And user select Are you liable under FUTA
  And user select Has your organization employed
  And user select Did you or will you have total wages paid
  And user select Earliast Quater
  And user enter Year
  And user click Add Owner link
  #Ui/tax/TaxContactAndWorksite
  And user enter First Name for Owner
  And user enter Last Name for Owner
  And user enter Job Title for Owner
  And user enter SSN for Owner
  And user enter Phone for Owner
  And use enter Email Address for Owner
  And user enter Confirm Email Address for Owner
  And user click Save and Continue button fo Owner
  #Registration/Emp/Unemployment
  And user click to Next Button
  #Registration/Emp/TaxGeneralInformation
  And user select Do you have a physical location in Nebraska YES
  And user enter Address
  And user enter Zip Code for General Employment Information
  And user select Do you have independent contractors in your business
  And user enter Describe, in detail, your business activity in NE
  And user enter Provide the goods or the services provided
  And user enter What are the most common job titles
  And user enter Full Name
  And user enter Phone Number who can provide specific information
  And user select Is the primary purpose of the employee
  And user click Next Btn for General Employment Information Page
  #Registration/emp/TaxDocumentUpload
  And user click Next Button for Unemployment Benefits Services Page
  #Registration/emp/TaxCertification
  And user select This is to certify that all of the information
  And user select person for SignIn om dropDown
  And user enter to signIn
  And user click to Save Btn for Tax Certification
  #Registration/Emp/UIRegInstructions
  And user click Continue button for Registration Complete
  #Dashboards/DefaultEmp
  And user click Close Btn
  And user click to View your Profile
  #Folders/Emp/RegFolder
















