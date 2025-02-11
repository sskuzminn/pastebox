
# Pastebox - простая реализация тестового задания

Нужно спроектировать и реализовать бэкенд (REST API) для сервиса аналогичного pastebin.com - сервис позволяет заливать куски текста/кода и получать на них короткую ссылку, которую можно отправить другим людям.

При загрузке "пасты" пользователь указывает:
1. Срок в течение которого "паста" будет доступна по ссылке (expiration time) 10 мин, 1 час, 3 часа, 1 день, 1 неделя, 1 месяц, без ограничения после окончания срока получить доступ к "пасте" нельзя, в том числе и автору.

2. Ограничение доступа:
   public - доступна всем
   unlisted - доступна только по ссылке

Для загруженной пасты выдается короткая ссылка вида:
 http://my-awesome-pastebin.tld/{какой-то-рандомный-хэш}, например   
 http://my-awesome-pastebin.tld/ab12cd34

Пользователи могут получить информацию о последних 10 загруженных публичных "пастах". 

Pastebox - это простое веб-приложение, позволяющее пользователям сохранять текстовые фрагменты и делиться ими через уникальные URL. Пользователи могут создавать "пасты", которые могут быть публичными или скрытыми, а также устанавливать время жизни для каждой пасты.

## Стек технологий

- Java
- Spring Boot
- Lombok

## Установка

### Предварительные требования

- Java 17 или выше
- Maven

### Клонирование репозитория

```bash
git clone https://github.com/yourusername/pastebox.git
cd pastebox
```

### Сборка проекта

```bash
mvn clean install
```

### Запуск приложения

```bash
mvn spring-boot:run
```

После запуска приложение будет доступно по адресу `http://localhost:8080`.

## Использование

### Создание пасты

Чтобы создать новую пасту, отправьте POST-запрос на корневой URL (`/`) с JSON-телом, содержащим данные пасты:

```json
{
  "data": "Ваш текст здесь",
  "expirationTimeSeconds": 3600,
  "publicStatus": "PUBLIC"
}
```

### Получение пасты по хешу

Чтобы получить пасту по её хешу, отправьте GET-запрос на URL `/{hash}`, где `{hash}` - это уникальный идентификатор пасты.

### Получение списка публичных паст

Чтобы получить список первых публичных паст, отправьте GET-запрос на корневой URL (`/`).

## API

### Эндпоинты

- `POST /` - Создает новую пасту.
- `GET /{hash}` - Получает пасту по хешу.
- `GET /` - Получает список первых публичных паст.

## Структура проекта

- `org.example.pastebox` - Основной пакет приложения.
  - `PasteboxApplication` - Главный класс приложения.
  - `controller` - Контроллеры для обработки HTTP-запросов.
  - `service` - Сервисы для бизнес-логики.
  - `repository` - Репозитории для работы с данными.
  - `entity` - Сущности, представляющие данные.
  - `api` - Запросы и ответы API.
  - `exception` - Исключения приложения.



