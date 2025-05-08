# Biblioteca-Universitaria

Comencé creando la clase pública Biblioteca1, ya que el nombre Biblioteca ya estaba ocupado.
Creé las clases nombreLibro, nombreUsuario, numeroLibro, numeroUsuario para luego poner los getters y setters de cada una de estas. Luego, importé el java.util.Scanner para poder leer el input del usuario desde el terminal.
Luego de esto, incialicé el main para ahí utilizar el Scanner que importé. Con esta herramienta le pregunto al usuario por el nombre del libro, su nombre, el número ISBN del libro, y el número de identificación del usuario, y luego de que el usuario de toda la información solicitada, se imprime lo que el usuario puso en la terminal. Finalmente cierro el scanner para no gastar recursos.
Al terminar esto, corrí el programa, pero este generó el siguiente error, ya que el ISBN del libro es demasiado grande para guardar como un int sencillo. 

![441898540-ebbeb4e3-ecb9-4b3c-b512-895a36b7e659](https://github.com/user-attachments/assets/1a43a268-bb5e-42a5-a326-50fe7d70abff)
Luego de preguntarle al profesor cómo solucionar este problema, me sugirió usar long en vez de int, con lo cual logré poner el ISBN del libro, y ejecutar el código correctamente.
![image](https://github.com/user-attachments/assets/b9c888cf-b5d0-4d24-ac8e-245800f688c5)

Luego, para crear un archivo con los registros de libros, números de ISBN y que libros registró cada usuario usé java.io.FileWriter y java.io.IOException, con los cuales se crea el archivo (FileWriter) y se para programa si se encuentran errores al escribir el archivo (IOException).
Volviendo a leer los requisitos para la tarea, me dí cuenta de que no había cumplido con el requisito de categorías, entonces me devolví y creé una nueva clase llamada catLibro. Para esto, creé un while loop en el que doy las opciones de categorías. Luego, con el scanner veo qué opción eligió el usuario, y con esta información, implementé un switch para cada uno de los 6 casos implementados (5 categorías y uno en caso de que el usuario eliga una opción inválida).
Luego de esto, corrí el programa, y logré el siguiente resultado:
![image](https://github.com/user-attachments/assets/3f06e268-3cd8-4594-a78b-5f901d674f0b)
