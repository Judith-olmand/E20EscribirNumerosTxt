- BC3- COLECCIONES, FICHEROS Y ENTRADA/SALIDA
- LECTURA Y ESCRITURA DE FICHEROS

Escritura y Lectura de Números en Fichero

Programa en Java que automatiza la generación de una secuencia numérica, su almacenamiento en un archivo de texto y su posterior recuperación.

🚀 Funcionalidades
- Generación de Secuencia: Crea automáticamente una lista de números del 1 al 10.
- Escritura Bufferizada: Utiliza un flujo de escritura optimizado para guardar los números en el archivo numeros.txt.
- Lectura Línea a Línea: Recupera el contenido del archivo y lo muestra por consola de forma organizada.
- Cierre Automático: Implementa try-with-resources para gestionar la apertura y cierre de archivos de forma segura.

🛠️ Estructura técnica
- El código se divide en dos procesos clave:
- BufferedWriter: Mejora el rendimiento de escritura al reducir el número de accesos al disco.
- BufferedReader: Permite leer el archivo de texto eficientemente utilizando el método readLine().
- Separación de Clases: Divide la lógica de escritura (E20EscribirNumerosTxt) y lectura (E20LeerNumerosTxt) en componentes independientes.
