# Biblioteca-Universitaria

Comencé creando la clase pública Biblioteca1, ya que el nombre Biblioteca ya estaba ocupado.
Creé las clases nombreLibro, nombreUsuario, numeroLibro, numeroUsuario para luego poner los getters y setters de cada una de estas. Luego, importé el java.util.Scanner para poder leer el input del usuario desde el terminal.
Luego de esto, incialicé el main para ahí utilizar el Scanner que importé. Con esta herramienta le pregunto al usuario por el nombre del libro, su nombre, el número ISBN del libro, y el número de identificación del usuario, y luego de que el usuario de toda la información solicitada, se imprime lo que el usuario puso en la terminal. Finalmente cierro el scanner para no gastar recursos.
Al terminar esto, corrí el programa, pero este generó el siguiente error, ya que el ISBN del libro es demasiado grande para guardar como un int sencillo. 
![image](https://github.com/user-attachments/assets/ebbeb4e3-ecb9-4b3c-b512-895a36b7e659)
Luego de preguntarle al profesor cómo solucionar este problema, me sugirió usar long en vez de int, con lo cual logré poner el ISBN del libro, y ejecutar el código correctamente.
![image](https://github.com/user-attachments/assets/cd1a8d8a-3827-48bc-83aa-1bc658c1aa94)
Luego, para crear un archivo 
