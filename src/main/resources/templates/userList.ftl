<#import "parts/common.ftl" as c>

<@c.page>
    Список користувачів
    <table>
        <thead>
        <tr>
            <th>Ім'я</th>
            <th>Роль</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <#list users as user>
            <tr>
                <td>${user.username}</td>
                <td><#list user.roles as role>${role}<#sep>,</#list></td>
                <#if user.id != 0>
                    <td><a href="/user/${user.id}">Редагувати</a></td>
                </#if>
            </tr>
        </#list>
        </tbody>
    </table>
</@c.page>