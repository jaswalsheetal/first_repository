Feature: check the login functionallity
@smoke
Scenario Outline: login the application with valid credtionals
Given user is onn login page
Then user enter "<surname>" in username feild and "<password>" in password feild
Then clicks on the login button
Examples:
|surname | password |
|admin | admin |
|ad | ad|
|Admin | admin123|
