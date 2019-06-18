<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
    <div class="mb-1">
    <#if Session?? && Session.SPRING_SECURITY_LAST_EXCEPTION??>
        Неправильний логін або пароль.
    </#if>
    </div>
    <@l.login "/login" false/>
</@c.page>