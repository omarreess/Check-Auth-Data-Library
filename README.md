# Check-Auth-Data-Library
Android Library for Checking Authentication Data before use it .

## Features 

 - Simple Library for Checking Data got from user in Right form or not before Using it in authentication Requests.
 - Library Tested using Unit test expecting worst scenario  cases CheckAuthDataTest Class in Test Package.
## Installation



Add this Maven  in your build.gradle Project level.

  
      maven {        
       url  "https://dl.bintray.com/omarreess/CheckAuthDataLibrary"
            }
            
Then add this dependency to your app module build.gradle file.

      dependencies {
	         implementation 'com.omaressam:CheckAuthData:1.0'
	                 }

## Usage
Getting an Instance 

  ``` 
   CheckAuthData checkAuthData = new CheckAuthData();
   
```
Then use  whatever you want from Methods 

```
checkAuthData.usernameIsEmpty("omarreess");

checkAuthData.usernameIsEmpty("");

checkAuthData.passwordIsLessThanDigits("1234567",7);

checkAuthData.PasswordIsEmpty(" ");


```








 
 
 
 
 
