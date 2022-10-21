package main

import (
"authing-go-sdk/client"
"authing-go-sdk/dto"
"fmt"
)

func main() {
    options := client.ManagementClientOptions{
        AccessKeyId:     "AUTHING_USERPOOL_ID",
        AccessKeySecret: "AUTHING_USERPOOL_SECRET",
    }
    var err error
    client, err := client.NewClient(&options)
    if err != nil {
        panic(err)
    }
    request := dto.FreeMarker template error (DEBUG mode; use RETHROW in production!):
The following has evaluated to null or missing:
==> firstParameter  [in template "getUserBaseFields" at line 19, column 22]

----
Tip: If the failing expression is known to legally refer to something that's sometimes null or missing, either specify a default value like myOptionalVar!myDefault, or use <#if myOptionalVar??>when-present<#else>when-missing</#if>. (These only cover the last step of the expression; to cover the whole expression, use parenthesis: (myOptionalVar.foo)!myDefault, (myOptionalVar.foo)??
----

----
FTL stack trace ("~" means nesting-related):
	- Failed at: ${firstParameter.className?cap_first}  [in template "getUserBaseFields" at line 19, column 20]
----

Java stack trace (for programmers):
----
freemarker.core.InvalidReferenceException: [... Exception message was already printed; see it above ...]
	at freemarker.core.InvalidReferenceException.getInstance(InvalidReferenceException.java:134)
	at freemarker.core.UnexpectedTypeException.newDescriptionBuilder(UnexpectedTypeException.java:85)
	at freemarker.core.UnexpectedTypeException.<init>(UnexpectedTypeException.java:48)
	at freemarker.core.NonHashException.<init>(NonHashException.java:49)
	at freemarker.core.Dot._eval(Dot.java:48)
	at freemarker.core.Expression.eval(Expression.java:101)
	at freemarker.core.Expression.evalAndCoerceToStringOrUnsupportedMarkup(Expression.java:139)
	at freemarker.core.BuiltInForString.getTargetString(BuiltInForString.java:34)
	at freemarker.core.BuiltInForString._eval(BuiltInForString.java:29)
	at freemarker.core.Expression.eval(Expression.java:101)
	at freemarker.core.DollarVariable.calculateInterpolatedStringOrMarkup(DollarVariable.java:100)
	at freemarker.core.DollarVariable.accept(DollarVariable.java:63)
	at freemarker.core.Environment.visit(Environment.java:347)
	at freemarker.core.Environment.visit(Environment.java:353)
	at freemarker.core.Environment.process(Environment.java:326)
	at freemarker.template.Template.process(Template.java:383)
	at FreeMarkerUtils.process(FreeMarkerUtils.java:34)
	at GoTestGenerator2.main(GoTestGenerator2.java:80)
