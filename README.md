# LiterAlura

> Aplicación de consola para gestionar un catálogo de libros
> *Console application to manage a book catalog*

## 📖 Descripción (ES)

LiterAlura es una aplicación de consola desarrollada en **Java (versión 21)** que permite a los usuarios interactuar con un catálogo de libros utilizando datos obtenidos de la **API Gutendex**. Está diseñada para registrar libros y autores en una base de datos **PostgreSQL**, facilitando consultas y operaciones comunes del dominio literario.

## 📖 Description (EN)

LiterAlura is a console application developed in **Java (version 21)** that allows users to interact with a book catalog using data obtained from the **Gutendex API**. It is designed to register books and authors in a **PostgreSQL** database, facilitating common literary domain queries and operations.

---

## 🔧 Funcionalidades / Features

* **Buscar libro por título** / Search book by title
* **Listar libros registrados** / List registered books
* **Listar autores registrados** / List registered authors
* **Listar autores vivos en un año determinado** / List authors alive in a given year
* **Listar libros por idioma (ES, EN, FR, PT)** / List books by language
* **Manejo de errores de API y duplicados** / Error handling and duplicate protection

---

## 🚀 Tecnologías utilizadas / Technologies used

| Tecnología      | Versión / Version | Uso / Use                                |
| --------------- | ----------------- | ---------------------------------------- |
| Java            | 21                | Lenguaje principal / Main language       |
| Spring Boot     | —                 | Framework backend                        |
| Spring Data JPA | —                 | Persistencia de datos / Data persistence |
| PostgreSQL      | —                 | Base de datos / Database                 |
| Maven           | —                 | Gestión del proyecto / Build tool        |
| Gutendex API    | —                 | Fuente de datos / Data source            |

---

## ⚙️ Instalación (ES)

1. Clonar el repositorio:

   ```bash
   git clone <url-del-repo>
   ```
2. Configurar la base de datos PostgreSQL y actualizar las credenciales en `application.properties`.
3. Ejecutar el proyecto con Maven:

   ```bash
   mvn spring-boot:run
   ```

## ⚙️ Installation (EN)

1. Clone the repository:

   ```bash
   git clone <repository-url>
   ```
2. Configure PostgreSQL database and update credentials in `application.properties`.
3. Run the project with Maven:

   ```bash
   mvn spring-boot:run
   ```

---

## 📄 Licencia / License

Este proyecto se distribuye bajo la licencia MIT.
This project is licensed under the MIT license.

---

## 🤝 Autor / Author

**Pinto Juan**

¿Te gustaría contribuir con este proyecto? ¡Pull requests son bienvenidos!
Would you like to contribute? Pull requests are welcome! ✨

