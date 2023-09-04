Feature: Facebook


@SignUp
Scenario: Login with invalid Credentails
When User Launch Chrome Browser
When  User open the Url as "https://www.facebook.com/"
When User Enter EmailAddress as "harshalnegi1419@gmail.com" and Password as "1234"
Then User clicks on Create new account Button
Then Close the Browser