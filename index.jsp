<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="botDetect" uri="https://captcha.com/java/jsp"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>BotDetect Java CAPTCHA Validation: JSP CAPTCHA Tag Code Example</title>
  <link rel="stylesheet" href="stylesheet.css" type="text/css" />
</head>
<body>
  <form method="post" action="captchaTagAction" class="column" id="form1">
    <h1>BotDetect Java CAPTCHA Validation: <br /> JSP CAPTCHA Tag Code Example</h1>
    <fieldset>
      <legend>Java CAPTCHA validation</legend>
      <label for="captchaCode">Retype the characters from the picture:</label>

      <!-- Adding BotDetect Captcha to the page -->
      <botDetect:captcha id="exampleCaptchaTag" userInputID="captchaCode" />

      <div class="validationDiv">
        <input name="captchaCode" type="text" id="captchaCode" />
        <input type="submit" name="validateCaptchaButton" value="Validate" id="validateCaptchaButton" />
        <span class="correct">${messages.captchaCorrect}</span>
        <span class="incorrect">${messages.captchaIncorrect}</span>
      </div>
    </fieldset>
  </form>
</body>
</html>