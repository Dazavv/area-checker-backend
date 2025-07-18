# Лабораторная работа №4 — Backend

### Технологии: Spring Boot (Backend) + React + Redux (Frontend)

## Описание

Этот проект представляет собой back-end часть лабораторной работы №4. Он реализован с использованием Spring Boot и обеспечивает REST API для взаимодействия с фронтендом (React + Redux). Система реализует проверку попадания точки в заданную область, авторизацию пользователей и сохранение результатов в базе данных Oracle.
## 📍 Область попадания точек

Ниже изображена область, используемая для проверки попадания точек:

![image](https://github.com/Dazavv/web_lab4_backend/assets/112805687/de6ee955-e9aa-464d-bc21-e0309549f254)

## Функциональность (Back-end)

* Аутентификация пользователей с хранением паролей в виде **хэш-сумм**
* Защита основного интерфейса от доступа неавторизованных пользователей
* Работа с координатами точки и радиусом для проверки попадания в заданную область
* Хранение результатов проверки в базе данных Oracle
* Обработка и валидация запросов от клиентского интерфейса
* Работа с СУБД через **Spring Data JPA**

## ⚙️ Технологический стек

* Java 17+
* Spring Boot

  * Spring Web
  * Spring Security
  * Spring Data JPA
* Oracle Database
* Maven

## Структура проекта

```
src/
└── main/
    ├── java/ru/web_lab4/
    │   ├── auth/                 # Модуль авторизации
    │   │   ├── AuthController.java      # REST-контроллер для логина
    │   │   ├── AuthService.java         # Сервис авторизации
    │   │   ├── User.java                # Сущность пользователя
    │   │   └── UserRepository.java      # Репозиторий пользователей
    │   ├── dots/                 # Модуль проверки попадания точки
    │   │   ├── Dot.java                 # Сущность точки
    │   │   ├── DotsController.java      # REST-контроллер для точек
    │   │   └── DotsRepository.java      # Репозиторий точек
    │   ├── ServletInitializer.java      # Инициализация приложения (для деплоя на сервер)
    │   └── WebLab4BackApplication.java  # Точка входа в приложение
    └── resources/
        └── application.properties       # Конфигурация (БД и др.)
```

## Как запустить

> ⚠️ Убедитесь, что у вас установлен и настроен Oracle Database, и вы прописали верные параметры в `application.properties`.

1. Клонируйте репозиторий:

   ```bash
   git clone https://github.com/Dazavv/web_lab4_backend.git
   cd web_lab4_backend/web_lab4_back-main
   ```

2. Соберите проект с помощью Maven:

   ```bash
   mvn clean install
   ```

3. Запустите приложение:

   ```bash
   mvn spring-boot:run
   ```

Сервер будет доступен по адресу: `http://localhost:8080`

## Безопасность

* Пароли хранятся в виде хэшей
* Доступ к REST API ограничен: только авторизованные пользователи могут взаимодействовать с основной функциональностью

## Сопутствующие страницы приложения (на фронтенде)

* Стартовая страница (вход)
* Основная страница:

  * Ввод координат
  * Рисование области
  * Проверка попадания точки
  * История результатов
  * Выход из аккаунта

## Адаптивность клиентской части (на React):

> Поддерживаются 3 режима отображения:

* Десктоп (≥ 1116px)
* Планшет (859px — 1115px)
* Мобильный (< 859px)

## Связь с клиентом

Фронтенд часть: [web\_lab4\_frontend (React + Redux)](https://github.com/Dazavv/web_lab4_frontend)

