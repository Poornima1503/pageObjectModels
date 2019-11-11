$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FacebookLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Accessing facebook page",
  "description": "",
  "id": "accessing-facebook-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3078921901,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "To verify password length error When trying to create facebook account",
  "description": "",
  "id": "accessing-facebook-page;to-verify-password-length-error-when-trying-to-create-facebook-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@SignUp"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "The facebook url",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I give first name, Sur name, mobile number, New password, birthday and gender",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I cannot signUp due to new password error",
  "keyword": "Then "
});
formatter.match({
  "location": "facebookLogin.the_facebook_url()"
});
formatter.result({
  "duration": 7674028800,
  "status": "passed"
});
formatter.match({
  "location": "facebookLogin.i_give_first_name_Sur_name_mobile_number_New_password_birthday_and_gender()"
});
formatter.result({
  "duration": 297484201,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div//h2[@class\u003d\u0027accessible_elem\u0027 and text()\u003d\u0027Find Your Account\u0027]\"}\n  (Session info: chrome\u003d77.0.3865.90)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LAPTOP-NRQKI5T4\u0027, ip: \u0027192.168.0.31\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 77.0.3865.90, chrome: {chromedriverVersion: 76.0.3809.126 (d80a294506b4..., userDataDir: C:\\Users\\poorn\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:62685}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 9e360cf8c5b024770d4ce6180605860e\n*** Element info: {Using\u003dxpath, value\u003d//div//h2[@class\u003d\u0027accessible_elem\u0027 and text()\u003d\u0027Find Your Account\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat pageObjects.FacebookLoginPage.\u003cinit\u003e(FacebookLoginPage.java:50)\r\n\tat stepDefinition.facebookLogin.i_give_first_name_Sur_name_mobile_number_New_password_birthday_and_gender(facebookLogin.java:37)\r\n\tat ✽.When I give first name, Sur name, mobile number, New password, birthday and gender(FacebookLogin.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "facebookLogin.i_cannot_signUp_due_to_new_password_error()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 717887000,
  "status": "passed"
});
});