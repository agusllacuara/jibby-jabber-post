# JibberJabberBackendPost

## Database

Para correr la aplicacion es necesario tener una base de datos. 
Utilizamos postgres como base de datos. Utilizamos el siguiente comando para correr el container de docker con la bdd

```bash
docker run -p 5432:5432 --name postgresPosts -v /Users/nicolefox/Projects/Facultad/ingSis/JibbeJabber/volumenes/postgresPost:/var/lib/postgresql/data -e POSTGRES_PASSWORD=password -d postgres:9.6
```
El argumento despues de -v es el local path donde va a estar el volumen.
Podemos acceder a la base de datos por el puerto 5432

Despues de crear el container correr los siguientes comandos para crear la base de datos:

```bash
docker exec -it postgresPosts psql -U postgres
CREATE DATABASE post;
```