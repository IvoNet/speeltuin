<#import "/spring.ftl" as spring />
<#assign xhtmlCompliant = true in spring>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Answers</title>
</head>
<body>

<h1>HA HA</h1>

You didn't think it was going to be that easy?

Hints in general:
<ul>
    <li>Look at the web.xml for the spring wiring</li>
    <li>Make a form binding object when using a form</li>
    <li>Constructor injection is what we want!</li>
    <li>the messages*.property files are managed by the ResourceBundle but what manages the language? look outside your
        application
    </li>
</ul>

<a href="<@spring.url "/"/>">home</a>
</body>
</html>
