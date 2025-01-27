
::paramos el servidor si está corriendo haciendo uso de la variable de entorno
%TOMEE_HOME%/bin/shutdown
::borramos cualquier posible despliegue anterior, los archivos jar y/o war y la carpeta:
del %TOMEE_HOME%/webapps/EmpresaAPI-1.0-SNAPSHOT.*
del %TOMEE_HOME%/webapps/EmpresaAPI-1.0-SNAPSHOT
::copiamos el nuevo despliegue
copy C:\Users\USUARIO\IdeaProjects\EmpresaAPI\target\EmpresaAPI-1.0-SNAPSHOT.jar C:\apache-tomee-webprofile-10.0.0\webapps
copy C:\Users\USUARIO\IdeaProjects\EmpresaAPI\target\EmpresaAPI-1.0-SNAPSHOT.war C:\apache-tomee-webprofile-10.0.0\webapps
::iniciamos el servicio de nuevo
%TOMEE_HOME%/bin/startup
