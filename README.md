# 📘 Ejercicios de Programación Dinámica

El siguiente repositorio contiene la estructura base para resolver dos retos de programación usando lenguaje Java, relacionado con el tema **Programación dinámica**:

https://github.com/estrategias-algoritmicas-iteso/programacion-dinamica-username

Pasos a seguir:

1. Clonar el repositorio en tu máquina local

```bash
root> git clone https://github.com/estrategias-algoritmicas-iteso/programacion-dinamica-username
root> cd programacion-dinamica-username
```

2. Abrir el siguiente archivo con el IDE de tu preferencia:
- `root\programacion-dinamica-username\src\main\java\ExcercisesDP.java`

3. Realizar cambios en el archivo anterior y probar su funcionamiento.

4. Subir tus cambios al repositorio origen:

```bash
root\examen-6-username>git status  # Verificar cambios
root\examen-6-username>git add .
root\examen-6-username>git commit -m "Versión recursiva de binomial"
root\examen-6-username>git push
```
5. Verificar los casos de prueba en github dentro de la sección **Actions**  - *All workflows*

---
---

## 🧩 Ejercicio 1: Coeficiente binomial

### 📝 Descripción del problema

Dados dos números enteros positivos `N`, `K`, calcula el coeficiente binomial utilizando la fórmula recursiva vista en clase.

$\binom{n}{k} = \binom{n-1}{k-1} + \binom{n-1}{k}$
---

### 📌 Prototipo del método (Java)

```java
public static long binomial(int N, int K)
```

### 📥 Entrada

- `N`: un número entero positivo que denota el número total de elementos

- `K`: un número entero positivo que denota el tamaño del subconjunto

### 📤 Salida

- Un número entero positivo de 64 bits que denota el númbero de subconjuntos de tamaño `K` que se pueden formar con `N` elementos.

### 🔒 Restricciones

- ```2 < K < N < 60```

### ✅ Ejemplos

#### Entrada
```java
1  N = 4, K = 3
2  N = 8, K = 5
```

#### Salida
```java
1  4
2  56
```
---
---

## 🧩 Ejercicio 2: Problema del Cambio

### 📝 Descripción del problema

Dado un arreglo de monedas *coins* que representa las denominaciones disponibles (algunas de ellas exóticas), y un número entero *amount* que denota el cambio a entregar, calcula **el mínimo número de monedas** que hay que utilizar para entregar el cambio exacto.

---

### 📌 Prototipo del método (Java)

```java
static int change(int[] coins, int amount)
```

### 📥 Entrada

- `coins`: un arreglo de números números enteros positivos que denota las denominaciones disponibles. Para garantizar solución, suponer: `coins[0] = 1`, existen tantas monedas disponibles como se necesiten.
- `amount`: un número entero positivo que denota el cambio a entregar.

### 📤 Salida

- Un **número entero positivo** que denota el mínimo número de monedas que se necesitan para llegar al cambio exacto. Siempre existe una solución. 

### 🔒 Restricciones

- ```3 ≤ coins.length ≤ 20```
- ```10 < budget ≤ 20000```

### ✅ Ejemplos

#### Entrada
```java
1  coins = [1, 4, 6], amount = 9
2  coins = [1, 5, 7, 10], amount = 12
```

#### Salida
```java
1  3  // monedas usadas: [1, 4, 4]
2  2  // monedas usadas: [5, 7]
```
