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
