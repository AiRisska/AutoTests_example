- Команды запуска тестов из терминала с пояснением ключей
- История со скриншотами - где что происходит, запускается
- Гифка с тестом (из видео в selenoid)
- Иконки используемого стека для красоты
- Emoji https://github.com/ikatyang/emoji-cheat-sheet/blob/master/README.md
- Маркдаун для разметки https://guides.github.com/features/mastering-markdown
- Примеры README - https://github.com/matiassingers/awesome-readme



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
<code><img height="40" src="https://starchenkov.pro/qa-guru/img/skills/Selenoid.svg"></code> Selenoid    

Report available with test details, screenshots, logs, videos

# Project in Allure TestOps with manual & automated tests
<a target="_blank" href="https://allure.autotests.cloud/project/685/dashboards"> <code><img height="30" src="https://starchenkov.pro/qa-guru/img/skills/Allure_EE.svg"></code> Project "SDvor"</a>

# Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/SDvor.com/">jenkins.autotests.cloud/job/SDvor.com/</a>


# USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* tag_test (default main_page)
* comment
* parallel_run (default false = not parallel)
* threads (number of threads, default 1)

Also, by default:

* browserSize - default 1920x1080
* browserVersion - default 91.0

Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```


###### For further development there are some example tests in src/test/java/cloud.autotests/tests/demowebshop
* remove @Disabled("...") annotation to run tests
```bash
gradle clean demowebshop
```

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>

