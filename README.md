# Reto Tecnico IZIPAY | Frank Laura Borja

**Herramientas Aplicadas :**
```sh
>Spring Data JPA
>H2 Database
>Spring Web
>Lombok
>Hibernate
>Java 8
>Maven
```
**Consideraciones:**
>Se realizo un Crud de Alumnos y se realizo una carga previa de registros.
>La app corre en el **puerto 9091**

**Postman**

>http://localhost:9091/api/v1/alumno | Method: GET
>http://localhost:9091/api/v1/alumno/1 | Method: GET
>http://localhost:9091/api/v1/alumno | Method: POST
```sh
{
    "nombre" : "Frank",
    "apellido" : "Laura Borja",
    "email" : "frank.cg9@gmail.com",
    "dni" : "73191639"
}
```
>http://localhost:9091/api/v1/alumno/1 | Method: PUT
```sh
{
    "nombre" : "Naysha Lucia",
    "apellido" : "Ayala Gomero",
    "email" : "ayalagomeron@gmail.com",
    "dni" : "78595748"
}
```
>http://localhost:9091/api/v1/alumno/1 | Method: DELETE
