# Ejercicio IOET
La empresa ACME ofrece a sus empleados la flexibilidad de trabajar las horas que deseen. Pero debido a algunas circunstancias externas, necesitan saber qué empleados han estado en la oficiona en el mismo período de tiempo.

El objetivo del ejercicio es generar una tabla que contenga pares de empleados y la frecuencia con la que han coincidido en la oficina

***Entrada:** nombre de un empleado y el horario que trabajó, indicando el tiempo y las horas. Este debe ser un archivo .txt con al menos cinco conjuntos de datos. Puede incluir los datos de ejemplo presentes a continuación:*

## Ejemplo 1:

**ENTRADA:**

RENE=MO10:00-12:00,TU10:00-12:00,TH01:00-03:00,SA14:00-18:00,SU20:00- 21:00
ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00
ANDRES=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00

**SALIDA:**

ASTRID-RENE: 2
ASTRID-ANDRES: 3
RENE-ANDRES: 2

## Ejemplo 2:

**ENTRADA:**

RENE=MO10:15-12:00,TU10:00-12:00,TH13:00-13:15,SA14:00-18:00,SU20:00-21:00
ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00

**SALIDA:**

RENE-ASTRID: 3