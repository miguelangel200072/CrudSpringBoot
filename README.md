# 🧑‍🎓 CRUD de Estudiantes con Spring Boot y MySQL

Este proyecto es una aplicación **CRUD** (Create, Read, Update, Delete) desarrollada con **Spring Boot**, que permite gestionar estudiantes almacenados en una base de datos **MySQL**.  
La aplicación permite **crear**, **listar**, **actualizar** y **eliminar** registros de estudiantes, manejando los campos: **id**, **nombre**, **apellido** y **email**.

---

## 🚀 Tecnologías utilizadas

- **Java 17**  
- **Spring Boot 3**  
  - Spring Web  
  - Spring Data JPA
  - Lombock
  - MySQL Driver
- **MySQL**  
- **Maven**  

---

## ⚙️ Configuración del proyecto

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/miguelangel200072/CrudSpringBoot.git
2. Importar el proyecto en tu IDE como proyecto Maven.
3. Crear la base de datos MySQL:
   CREATE DATABASE estudiantes_db;
4. Editar el archivo application.properties:

  spring.datasource.url=jdbc:mysql://localhost:3306/tu_baseDatos
  spring.datasource.username=root
  spring.datasource.password=tu_contraseña

  # Actualiza la tabla
  spring.jpa.hibernate.ddl-auto:update
  # Crear la tabla o hacer cambios en ella
  spring.jpa.hibernate.ddl-auto:create-drop
  spring.jpa.show-sql=true
  spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
  
  server.port=8080
  
---

### 🧩 Parte 2
```markdown
---

## 📡 Endpoints disponibles

| Método | Endpoint | Descripción |
|--------|-----------|--------------|
| **GET** | `/api/v1/student` | Obtiene todos los estudiantes |
| **GET** | `/api/v1/student/{id}` | Obtiene un estudiante por su ID |
| **POST** | `/api/v1/student` | Crea un nuevo estudiante introduciendo json en el body |
| **PUT** | `/api/v1/student` | Actualiza un estudiante existente introduciendo json con el id en el body |
| **DELETE** | `/api/v1/student/{id}` | Elimina un estudiante por su ID |

📌 **Ejemplo JSON para POST / PUT:**
```json
{
  "nombre": "Carlos",
  "apellido": "Gómez",
  "email": "carlos.gomez@correo.com"
}

