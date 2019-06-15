<#import "parts/common.ftl" as c>

<@c.page>
    <form onsubmit="window.location = 'http://localhost:8080/tests/' + testId.value; return false;">
        <div class="form-group">
            <label for="exampleFormControlSelect1">Варіанти тестів</label>
            <div class="form-group">
                <select class="form-control" id="testId">
                    <option selected>Білет №...</option>
                    <#list tests as test>
                        <option value="${test.testId}">
                            ${test.testName}
                        </option>
                    </#list>
                </select>
            </div>
        </div>
        <button class="btn btn-dark" type="submit">
            Розпочати тест
        </button>
    </form>

    <#if test?has_content>
        <form>
            <div>
                <ul class="list-group">
                    <#list test.tasks as task>
                        <b>
                            <li class="list-group-item">${test.testName} ${task.taskName}
                        </b>
                        <br>
                        <label class="form-check-label" for="gridRadios1">${task.question}</label>
                        <fieldset class="form-group">
                            <div>
                                <#if task.filename != ''>
                                    <img src="/img/${task.filename}" width="258" height="193">
                                </#if>
                            </div>
                                <legend class="col-form-label col-sm-2 pt-0"></legend>
                                <div class="col-sm-10">
                                    <#list task.answers as answer>
                                        <div class="form-check">
                                            <input class="form-check-input" type="radio" id="${task.taskId}" name="${task.taskId}">
                                            <label for="${task.taskId}">
                                                ${answer.answerName}
                                            </label>
                                        </div>
                                    </#list>
                                </div>
                        </fieldset>
                        </li>
                    </#list>
                </ul>
            </div
        </form>
    </#if>
</@c.page>