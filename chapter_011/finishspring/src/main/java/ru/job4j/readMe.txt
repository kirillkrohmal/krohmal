We power your mobile world
URL shortener
Assignment: Make an HTTP service that serves to shorten URLs, with the following functionalities:
 Registration Web address (API) 

 Redirect client in accordance with the shortened URL 
 Usage Statistics (API) 
Assignment description:
1. Basic architecture
The service should have two parts: configuration and user.
1.1. Configuration part
The configuration part is invoked using REST calls with JSON payload and is used for:
a) Opening of accounts
b) Registration of URLs in the 'Shortener' service
c) Displaying stats
a) Opening of accounts
HTTP method
POST
URI
/account
Request type
application/json
Request Body
JSON object with the following parameters:
 AccountId (String, mandatory)
Example: { AccountId : 'myAccountId'}
Reponse Type
application/json
Response
We distinguish the successful from the unsuccessful registration.
Unsuccessful registration occurs only if the concerned account ID
already exists. The parameters are as follows:
 success: true | false
 description: Description of status, for example: account with that
ID already exists
 password: Returns only if the account was successfully created.
Automatically generated password length of 8 alphanumeric
characters
Example {success: 'true', description: 'Your account is opened',
password: 'xC345Fc0'}

We power your mobile world
b) Registration of URLs
HTTP method
POST
URI
/register
Request type
application/json
Request Headers
Authorization header with Basic authentication token
JSON object with the following parameters:
 url (mandatory, url that needs shortening)
 redirectType : 301 | 302 (not mandatory, default 302)
Request Body
Example: {
url: 'http://stackoverflow.com/questions/1567929/website-safe-data-
access-architecture-question?rq=1',
redirectType : 301
}
Reponse Type
application/json
Response parameters in case of successful registration are as follows:
Response
 shortUrl (shortened URL)
Example: { shortUrl: 'http://short.com/xYswlE'}
c) Retrieval of statistics
HTTP metoda
GET
URI
/statistic/{AccountId}
Request Headers
Set Authorization header and authenticate user
Reponse Type
application/json
The server responds with a JSON object, key:value map, where the key
is the registered URL, and the value is the number of this URL redirects..
Example:
{
Response
'http://myweb.com/someverylongurl/thensomedirectory/: 10,
'http://myweb.com/someverylongurl2/thensomedirectory2/: 4,
'http://myweb.com/someverylongurl3/thensomedirectory3/: 91,
}
1.2. Redirecting
Redirecting the client on the configured address with the configured http status.

We power your mobile world
2. General requirements
 Use Java programming language 

 Pay attention that the response http statuses comply with the REST standards (list status http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html). 

 Service should be written as 'executable' or as 'deployable' package of your choice (eg war, jar) 

 The application should not require any additional (external) configuration, meaning it should not have dependencies that aren’t declared in POM. 

 The application should work out of the box, on first run without any aditional configuration 

 In accordance with the above claim, it is not allowed to use databases unless they are embedded, therefore, built into the application itself 

 It is allowed to use any framework 
 Make a help page (url: /help) containing instructions for installation, launching and usage 
 Deliver the source code with all dependencies for Java, preferably as a Maven project 
Important note: send your solution through a link on cloud-based sites (Drobpox, Bitbucket, GitHub, WeTransfer, etc..),
or otherwise we will not be able to receive it due to possible system safety issues

Мы приводим в движение ваш мобильный мир
Сокращение URL
Назначение: создание службы HTTP, которая служит для сокращения URL-адресов, со следующими функциями:
 Веб-адрес регистрации (API) 
 Перенаправить клиента в соответствии с сокращенным URL 
 Статистика использования (API) 
Описание назначения:

1. Базовая архитектура
Сервис должен состоять из двух частей: конфигурации и пользователя.
1.1. Конфигурационная часть
Часть конфигурации вызывается с помощью вызовов REST с полезной нагрузкой JSON и используется для

а) открытие счетов
б) Регистрация URL в сервисе «Шортенер»
в) Отображение статистики
а) открытие счетов

HTTP метод
ПОЧТА
URI
/учетная запись
Тип запроса
Применение / JSON
Тело запроса
JSON-объект со следующими параметрами:
 AccountId (String, обязательный)
Пример: {AccountId: 'myAccountId'}
Тип ответа
Применение / JSON
отклик
Мы отличаем успешную регистрацию от неудачной.
Неудачная регистрация происходит только при наличии соответствующего аккаунта. Параметры следующие:
 успех: правда | ложный
 description: описание статуса, например: учетная запись с этим ID уже существует
 пароль: возвращается только в том случае, если учетная запись была успешно создана.
Автоматически сгенерированный пароль длиной 8 буквенно-цифровой персонажи
Пример {success: 'true', описание: 'Ваш аккаунт открыт', пароль: 'xC345Fc0'}


Мы приводим в движение ваш мобильный мир
б) регистрация URL
HTTP метод
ПОЧТА
URI
/регистр
Тип запроса
Применение / JSON
Заголовки запроса
Заголовок авторизации с токеном базовой аутентификации
JSON-объект со следующими параметрами:
 URL (обязательно, URL, который нужно сократить)
 redirectType: 301 | 302 (не обязательно, по умолчанию 302)
Тело запроса
Пример: {URL: 'http://stackoverflow.com/questions/1567929/website-safe-data- доступ архитектура вопрос? RQ = 1', redirectType: 301}
Тип ответа
Применение / JSON
Параметры ответа в случае успешной регистрации следующие:
отклик
 shortUrl (сокращенный URL)
Пример: {shortUrl: 'http://short.com/xYswlE'}
в) поиск статистики
HTTP метод
ПОЛУЧИТЬ
URI
/ Статистики / {AccountId}
Заголовки запроса
Установить заголовок авторизации и аутентифицировать пользователя
Тип ответа
Применение / JSON
Сервер отвечает JSON-объектом, ключ: значение карты, где ключ является зарегистрированным URL-адресом, а значение - номером перенаправления этого URL-адреса.
Пример:
{
отклик
'http://myweb.com/someverylongurl/thensomedirectory/: 10,
'http://myweb.com/someverylongurl2/thensomedirectory2/: 4,
'http://myweb.com/someverylongurl3/thensomedirectory3/: 91,
}

1.2. Перенаправление
Перенаправление клиента на настроенный адрес с настроенным статусом http.

Мы приводим в движение ваш мобильный мир
2. Общие требования
 Используйте язык программирования Java 

 Обратите внимание, что http-статусы ответов соответствуют стандартам REST (статус списка http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html). 

 Сервис должен быть написан как «исполняемый» или как «развертываемый» пакет на ваш выбор (например, war, jar) 

 Приложение не должно требовать какой-либо дополнительной (внешней) конфигурации, то есть оно не должно иметь зависимостей, которые не объявлены в POM. 

 Приложение должно работать «из коробки» при первом запуске без дополнительной настройки 

 В соответствии с вышеуказанным требованием не разрешается использовать базы данных, если они не встроены, следовательно, встроены в само приложение 

 Разрешено использовать любые рамки 
 Создайте страницу справки (url: / help), содержащую инструкции по установке, запуску и использованию 
 Предоставить исходный код со всеми зависимостями для Java, предпочтительно как проект Maven 
Важное примечание: отправьте свое решение по ссылке на облачные сайты (Drobpox, Bitbucket, GitHub, WeTransfer и т. Д.),
Иначе мы не сможем получить его из-за возможных проблем с безопасностью системы.
