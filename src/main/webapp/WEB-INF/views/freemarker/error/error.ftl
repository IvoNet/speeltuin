<#-- @ftlvariable name="exception" type="java.lang.Throwable" -->
<#import "/spring.ftl" as spring />
<#assign xhtmlCompliant = true in spring>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Unspecified error</title>
</head>
<body>
<div id="page">
    <h1>Error</h1>

    <p>Sorry the operation you tried to do is not supported</p>

    <p>Error message:</p>

    <p><#if exception?has_content>${exception.message}</#if></p>

</div>
</body>
