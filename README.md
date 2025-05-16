# Parcial-Compiladores
## Integrantes:
- Díaz Aguirre, Milagros Gabriela (u202110587)
- Aragón Flores, María Laura (u202013882)
- Favio Enrique Arroyo Gamarra (u20222083)
  
# Problema

En los ámbitos de la educación, a menudo se requiere una solución ágil, confiable y fácil de entender para trabajar con operaciones matemáticas. Los lenguajes de programación convencionales como Python, Java o C++ pueden resultar demasiado complicados para tareas elementales como:

- Calcular el resultado de fórmulas matemáticas.
- Experimentar con diferentes valores numéricos.
- Operar con expresiones que incluyen números y letras.

Además, muchas calculadoras gráficas o científicas carecen de la capacidad de automatizar cálculos o guardar resultados para usarlos posteriormente, lo cual reduce su eficacia en situaciones que demandan la creación de pequeños programas matemáticos.

#  Motivación

El proyecto busca facilitar el procesamiento de expresiones matemáticas mediante un lenguaje diseñado exclusivamente para esta finalidad. Esta solución permitirá:

- Definir variables.
- Realizar operaciones aritméticas básicas.
- Visualizar resultados con una sintaxis simple y clara.

Esto reduce la curva de aprendizaje respecto a otros lenguajes de programación.

El lenguaje será interpretado utilizando **ANTLR4**, lo que permitirá validar su sintaxis y estructura desde las primeras fases de desarrollo. Este enfoque también servirá como base para introducir a los estudiantes en conceptos fundamentales de compilación e interpretación de lenguajes.

#  Objetivos

Diseñar e implementar un **lenguaje interpretado** para la evaluación de expresiones matemáticas básicas, utilizando **ANTLR4** como herramienta para la definición y análisis sintáctico del mismo.

## Objetivos Específicos

- ✅ Definir la gramática formal del lenguaje, permitiendo operaciones aritméticas, uso de variables, asignaciones y comandos de salida (`print`).
- ✅ Implementar los archivos fuente en ANTLR4 necesarios para generar el analizador léxico y sintáctico del lenguaje.
- ✅ Desarrollar un programa *driver* que lea instrucciones escritas en **CalcScript** y las procese mediante la gramática generada.
- ✅ Crear un *visitor* personalizado que permita evaluar las expresiones aritméticas y mantener un entorno de ejecución con almacenamiento de variables.
- ✅ Construir un caso de prueba funcional, incluyendo un archivo de entrada (`input.txt`) con instrucciones representativas del lenguaje.
- ✅ Documentar el proceso de desarrollo, incluyendo el diseño de la gramática, pruebas realizadas y resultados obtenidos.

# Gramatica en ANTLR4
![image](https://github.com/user-attachments/assets/251fb29b-fad8-4c68-bdd9-a6b25f51185c)

