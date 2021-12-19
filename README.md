
### :electron:  Code stack:    

<code><img height="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg"></code> Java, 
<code><img height="40" src="https://w7.pngwing.com/pngs/23/960/png-transparent-gradle-spring-framework-software-build-github-repository-github-mammal-cat-like-mammal-carnivoran.png"></code> Gradle, 
<code><img height="40" src="https://w7.pngwing.com/pngs/194/707/png-transparent-junit-test-automation-software-testing-unit-testing-software-framework-others-text-trademark-logo.png"></code> JUnit5, 
<code><img height="40" src="https://assertj.github.io/doc/images/favicon.png"></code> AssertJ, 
<code><img height="40" src="http://owner.aeonbits.org/favicon.png"></code> Owner, 
<code><img height="40" src="https://rest-assured.io/img/logo-transparent.png"></code> Rest-Assured, 
<code><img height="40" src="https://starchenkov.pro/qa-guru/img/skills/Selenide.svg"></code> Selenide,    
<code><img height="40" src="https://starchenkov.pro/qa-guru/img/skills/Allure_Report.svg"></code> Allure Reports and 
<code><img height="40" src="https://starchenkov.pro/qa-guru/img/skills/Allure_EE.svg"></code> Allure TestOps   

### :electron: Infrastructure stack:

<code><img height="40" src="https://www.clipartmax.com/png/middle/179-1799200_github-logo-icon-github-logo-png.png"></code> Github, 
<code><img height="40" src="https://i.ytimg.com/vi/XDrSzHmyCLs/hqdefault.jpg"></code> Jenkins and Docker, 
<code><img height="40" src="https://starchenkov.pro/qa-guru/img/skills/Selenoid.svg"></code> Selenoid, 
<code><img height="40" src="https://starchenkov.pro/qa-guru/img/skills/Jira.svg"></code> Jira

Report available with test details in <code><img height="30" src="https://dez-himnika.ru/files/site/images/%D1%82%D0%B5%D0%BB%D0%B5.png"></code> Telegram and screenshots, logs, videos on the link from notifications

# Project in Allure TestOps with manual & automated tests
<a target="_blank" href="https://allure.autotests.cloud/project/685/dashboards"> <code><img height="30" src="https://starchenkov.pro/qa-guru/img/skills/Allure_EE.svg"></code> Project "SDvor"</a>    

Test Plan from Allure TestOps    
<img src="https://github.com/AiRisska/AutoTests_example/blob/master/img/AllureTestPlan.png">

Test Statistics from dashbord Allure TestOps    
<img src="https://github.com/AiRisska/AutoTests_example/blob/master/img/AllureTestOps.png">

# Jenkins job    
<a target="_blank" href="https://jenkins.autotests.cloud/job/SDvor.com/"> <code><img height="30" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/jenkins/jenkins-original.svg"></code> SDvor.com </a>

Start collect with parameters    
<img src="https://github.com/AiRisska/AutoTests_example/blob/master/img/JenkinsStartJobs.png">

where {TAG_TEST} is replaced with the next value:
* test - start all tests, 
* main_page - start tests for main page, 
* search_test - start tests for search, 
* product_test - start tests for product card, 
* shopcart_test - start tests for shopping cart


Allure History Trend from Jenkins    
<img src="https://github.com/AiRisska/AutoTests_example/blob/master/img/AllureHistoryTrend.png">

# Notifications in Telegram    
<a target="_blank" href="https://t.me/+Bh5dw90nLuQzZDky"> <code><img height="30" src="https://dez-himnika.ru/files/site/images/%D1%82%D0%B5%D0%BB%D0%B5.png"></code> from Test_Reports </a> in special canal.

Demo notifications:    
<img src="https://github.com/AiRisska/AutoTests_example/blob/master/img/TelegramReport1.png"> <img src="https://github.com/AiRisska/AutoTests_example/blob/master/img/TelegramReport2.png">

# Issues in Jira    
<a target="_blank" href="https://jira.autotests.cloud/browse/AUTO-531"> <code><img height="30" src="https://starchenkov.pro/qa-guru/img/skills/Jira.svg"></code> issue in Jira </a>.

Screen from Jira    
<img src="https://github.com/AiRisska/AutoTests_example/blob/master/img/JiraCloudTask.png">

# Allure Reports    
<a target="_blank" href="https://jenkins.autotests.cloud/job/SDvor.com/34/allure/#graph"> <code><img height="30" src="https://starchenkov.pro/qa-guru/img/skills/Allure_Report.svg"></code> Allure reports </a>.

Screen from reports    
<img src="https://github.com/AiRisska/AutoTests_example/blob/master/img/AllureReports.png">

Video from report
<img src="https://github.com/AiRisska/AutoTests_example/blob/master/img/test%20results.gif">

<!--


# USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* tag_test (default main_page)
* comment
* parallel_run (default false = not parallel)
* threads (number of threads, default 1)

Also, by default:

* browserSize - default 1920x1080


Run tests with filled remote.properties:
```bash
gradle clean {TAG_TEST}
```
where {TAG_TEST} is replaced with the next value:
* test - start all tests, 
* main_page - start tests for main page, 
* search_test - start tests for search, 
* product_test - start tests for product card, 
* shopcart_test - start tests for shopping cart

Run tests with not filled remote.properties:
```bash
gradle clean {TAG_TEST} 
-Dbrowser=chrome 
-Durl=selenoid.autotests.cloud/wd/hub/
-Dlogin=%s
-Dpassword=%s
-Dthreads=1
-DparallelRun=false
```

Serve report:
```bash
allure serve build/allure-results
```

-->
