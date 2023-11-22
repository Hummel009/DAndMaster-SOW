DAndMaster SOW - мод для Minecraft 1.19.2, базирующийся на моём моде Legendary Item. Добавляет легендарную броню и оружие из мода SOW.

## Общая информация

Этот репозиторий - проект Gradle, который должен быть открыт через IntelliJ IDEA или импортирован в Eclipse IDE.

| Технология | Версия  | Пояснение                                     |
|------------|---------|-----------------------------------------------|
| Gradle     | 8.4-bin | Версия системы автоматической сборки          |
| Gradle JVM | 17.0.9  | Версия Java, используемая для запуска Gradle  |
| JDK        | 17.0.9  | Версия Java, используемая для запуска проекта |
| Java       | 17      | Синтаксис Java, используемый в проекте        |

## Установка

Первым делом нужно скачать репозиторий и разархивировать его в любое место на диске. Если всё сделано правильно, вы должны увидеть папку, в которой находятся файлы `build.gradle.kts`, `settings.gradle.kts` и другие. Полученную папку будем называть ***папкой проекта***.

### IntelliJ IDEA

Запустите IntelliJ IDEA и откройте папку проекта: `File -> Open -> [Выбираете папку] -> OK`. Сразу после открытия начнётся установка среды. Если от вас потребуется разрешение на скачивание файлов, дайте его. Спустя некоторое время все необходимые файлы скачаются, и среда будет готова к работе.

Если на этом моменте что-то пошло не так и среда не установилась, значит, самое время проверить значения, указанные в таблице из первого раздела. Где их настроить:
* Gradle JVM: `File -> Settings -> Build -> Build Tools -> Gradle -> Gradle JVM`;
* JDK: `File -> Project Structure -> Project -> SDK`;
* Java: `File -> Project Structure -> Project -> Language Level`.

После изменения этих значений необходимо перезагрузить проект Gradle. Это можно сделать в ***меню Gradle***: `View -> Tool Windows -> Gradle`, нажав на значок перезагрузки в появившемся справа меню.

### Eclipse IDE

Запустите Eclipse IDE и импортируйте папку проекта: `File -> Import -> Gradle -> Existing Gradle Project -> Next -> [Выбираете папку] -> Finish`. Сразу после импорта начнётся установка среды. Если от вас потребуется разрешение на скачивание файлов, дайте его. Спустя некоторое время все необходимые файлы скачаются, и среда будет готова к работе.

Если на этом моменте что-то пошло не так и среда не установилась, значит, самое время проверить значения, указанные в таблице из первого раздела. Где их настроить:
* Gradle JVM: *переменные среды ОС, а именно JAVA_HOME и Path*;
* JDK: `Project -> Properties -> Java Build Path -> Libraries -> [нажимаете на JRE System Library] -> Remove -> Add Library -> JRE System Library -> Next -> Alternate JRE -> Installed JREs -> Add -> Standard VM -> Next -> [Выбираете JRE home] -> Finish -> Apply and close -> [в выпадающем меню справа от Alternate JRE выбираете нужную JRE] -> Finish -> Apply and close`;
* Java: `Project -> Properties -> Java Compiler -> [Галочка на Enable project specific settings] -> [Выставляете Compiler compliance level] -> Apply and close`.

После изменения этих значений необходимо перезагрузить проект Gradle. Это можно сделать, нажав слева (под панелью Package Explorer) ПКМ по названию проекта и выбрав `Gradle -> Refresh Gradle Project`. После перезагрузки проекта в нижней части окна появится ***меню Gradle***. 

## Основы работы

После установки среды весь необходимый инструментарий готов к работе. Вот самые важные команды, необходимые каждому разработчику:

* Генерация конфигурации запуска: `Меню Gradle -> forgegradle runs -> genIntellijRuns` (или `genEclipseRuns`).
* Запуск мода (после генерации его конфигурации) доступен в верхней панели, где находится кнопка запуска и варианты запуска рядом с ней.
* Компиляция мода в файл с расширением .jar: `Меню Gradle -> build -> build`. После компиляции ваш мод появится в папке `папка_проекта/build/libs`. 
