 
# EJERCICIO PRACTICO PRINCIPIOS SOLID

==================================================================================

### Los 5 principios SOLID son:

S –  [Principio de Responsabilidad Unica](https://profile.es/blog/principios-solid-desarrollo-software-calidad/) 
O –  [Principio de Abierto/Cerrado](https://profile.es/blog/principios-solid-desarrollo-software-calidad/)
L –  [Principio de Sustitución de Liskov](https://profile.es/blog/principios-solid-desarrollo-software-calidad/)
I –  [Principio de Segregación de interfaces](https://profile.es/blog/principios-solid-desarrollo-software-calidad/)
D –  [Principio de Inversión de Dependencias](https://profile.es/blog/principios-solid-desarrollo-software-calidad/)

==================================================================================

## ERRORES

### Principio de responsabilidad única

En la clase `Directory` tiene métodos para agregar, agregar o quitar archivos y listar archivos, tiene métodos no utilizados heredados de la interfaz, l lo cual incumple el principio de segregación de interfaces. La clase de archivo contiene métodos de lectura y escritura, también puede abrir y cerrar archivos, ver el tamaño de esos archivos y convertir archivos a diferentes extensiones. En la clase `FileSystemItemBase`, tiene sus propios métodos getter y setter para las propiedades "name" y "parent", además tiene un método para obtener la ruta completa. Hay métodos con varias funcionalidades. 

### Principio open/closed

 Para realizar cualquier modificación, debe modificar todas las clases. En algunos métodos, hay muchos if anidados que dificultan la legibilidad del código. Las propiedades de clase deben ser privadas y accesibles a través de los métodos getter y setter. 

### Principio de sustitución de liskov

La interfaz `FileSystemItem` tenía muchos métodos y las clases relacionadas con ella no tiene que tener todos los métodos que tenía, ya que fabrica más excepciones de las necesarias, en relación a la interfaz se va a fraccionar en interfaces más pequeñas para que se use lo óptimo y necesario para el correcto funcionamiento. 
### Principio de Inversión de dependencias

Las clases depende unas de otras, para poder realizar una modificación en una en concreto, tienes que realizar un cambio en todas las demás clases. 

==================================================================================
