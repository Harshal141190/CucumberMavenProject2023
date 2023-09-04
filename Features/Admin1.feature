Feature: Admin1

@Smoke
Scenario: Login with Valid Credentials
Given User launch Chrome Browser  
When User open the url "https://admin-demo.nopcommerce.com/login"
When User Enter the Email as "admin@yourstore.com" and Password as "admin" 
When User click on Login Button
Then Close Browser