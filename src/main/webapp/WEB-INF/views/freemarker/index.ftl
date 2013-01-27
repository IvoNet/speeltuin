<#import "/spring.ftl" as spring />
<#assign xhtmlCompliant = true in spring>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Hello World</title>
</head>
<body>
<p>Hello world!</p>

<p>
    This is a fully configured springframework mvc application that uses Freemarker as its templating engine.
</p>

<h2>Play Tips:</h2>
<ul>
    <li><@spring.message "tip.1"/></li>
    <li><@spring.message "tip.2"/></li>
    <li><@spring.message "tip.3"/></li>
    <li><@spring.message "tip.4"/></li>
    <li><@spring.message "tip.5"/></li>
    <li><@spring.message "tip.6"/></li>
    <li><@spring.message "tip.7"/></li>
    <li><@spring.message "tip.8"/></li>
    <li><@spring.message "tip.9"/></li>
</ul>

<#if message??>
<p>

<div style="color: red;">${message}</div>
<br/>
The password is the answer to the following question:<br/>

<div style="color: purple; font-size: 2em;"><strong>What is the answer to life the universe and everything?</strong>
</div>

And it is NOT Siri as Apple would say!
</p>

</#if>

<form action="<@spring.url "/answers.htm"/>" method="post">
<@spring.message "enter.password"/> <@spring.formPasswordInput "password.password" />
    <input type="submit" value="Login"/>
</form>
<a href="<@spring.url "/answers2.htm?password=Wrong"/>">Answers</a><br/>
<a href="<@spring.url "/"/>">Home</a>

<p>${copyright!''}</p>
</body>
</html>

