<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
    <div class="mb-1">Авторизація</div>
    ${message?ifExists}
    <@l.login "/login" false/>
</@c.page>