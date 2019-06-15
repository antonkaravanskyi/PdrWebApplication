<#import "parts/common.ftl" as c>

<@c.page>
    <form>
        <p>
        <div>
            <ul class="list-group">
                <#list test.tasks as task>
                    <b>
                        <li class="list-group-item">${test.testName} ${task.taskName}
                    </b>
                    <br>
                    <label class="form-check-label" for="gridRadios1">${task.question}</label>
                    <fieldset class="form-group">
                        <div class="row">
                            <legend class="col-form-label col-sm-2 pt-0"></legend>
                            <div class="col-sm-10">
                                <#list task.answers as answer>
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" name="gridRadios"
                                               id="gridRadios1" value="option1" checked>
                                        <label class="form-check-label" for="gridRadios1">${answer.answerName}
                                        </label>
                                    </div>
                                </#list>
                            </div>
                        </div>
                    </fieldset>
                    </li>
                </#list>
            </ul>
        </div
        </p>
    </form>
</@c.page>