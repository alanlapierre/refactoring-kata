# KATA DE REFACTORING - IMPRESIÓN DE RECIBOS
En este ejercicio tomamos como base la generación de recibos para la renta de películas. Se parte de un ejemplo en donde todo se 
realiza en un único método, y por lo tanto, se tiene **baja cohesión** y **alto acoplamiento**. Por otro lado, 
no se respetan los principios **SOLID** y **GRASP**.

## Nuestro objetivo
Se pretende mejorar la calidad, de forma que podamos incluir futuras modificaciones sin que esto suponga un gran costo de desarrollo. Esto implica 
que nuestro resultado final sea un **código limpio**, con buena **separación de responsabilidades** y lo **suficientemente flexible** como para reducir 
el impacto de los cambios y mejoras.

## Situación inicial

### Diagrama de Secuencia

<p align="center">
  <img src="https://github.com/alanlapierre/refactoring-kata/blob/master/images/kata_refactoring_inicial_secuencia.jpg" alt="Diagrama de secuencia inicial"/>
</p>

## Situación final

### Diagrama de Clases

<p align="center">
  <img src="https://github.com/alanlapierre/refactoring-kata/blob/master/images/kata_refactoring_final_clases.jpg" alt="Diagrama de clases final"/>
</p>

## Notas
* Cada commit representa un paso en la refactorización.
* El commit inicial es el ejemplo del cual partimos.
* El enum MovieType actua como un Factory de alguna manera, nos permite setear a la clase Movie el MoviePrice y el LoyaltyCalculator que corresponda.
* Si bien podria haberse mejorado mucho más el diseño, creo que es una aproximación bastante buena para la complejidad del ejercicio.
* Las técnicas usadas son simples, el ejemplo no requería el uso de patrones muy complejos.

## Licencia MIT
**Para uso totalmente libre.**
