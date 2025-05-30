# Métodos Numéricos para Solución de Ecuaciones No Lineales

## 📘 Introducción

En el análisis numérico, resolver ecuaciones no lineales es una necesidad frecuente en distintas áreas de la ingeniería y las ciencias. Existen varios métodos para encontrar raíces aproximadas de funciones, entre los más conocidos están: el método de Newton-Raphson, el de bisección, el de falsa posición y el de la secante. Este repositorio presenta implementaciones y explicaciones claras de cada uno.

## 🎯 Objetivo

El objetivo de este repositorio es proporcionar ejemplos prácticos de métodos numéricos para encontrar raíces de funciones no lineales, acompañados de su explicación teórica, aplicaciones y código fuente para su estudio y análisis.

---

## 🔹 Método de Newton-Raphson

### ¿Qué es?
Es un método iterativo que utiliza la derivada de una función para encontrar una mejor aproximación de una raíz real de dicha función.

### ¿Dónde se aplica?
- Ingeniería eléctrica (circuitos no lineales)
- Optimización de funciones
- Cálculo estructural
- Modelos físicos complejos

---

## 🔹 Método de Bisección

### ¿Qué es?
Es un método cerrado que busca la raíz de una función en un intervalo \[a, b\], donde la función cambia de signo, dividiendo repetidamente el intervalo a la mitad.

### ¿Dónde se aplica?
- Problemas donde se garantiza una raíz real
- Procesos con restricciones o límites conocidos
- Control de calidad
- Análisis económico

---

## 🔹 Método de Falsa Posición (Regla Falsa)

### ¿Qué es?
Similar al de bisección, pero en lugar de usar el punto medio, usa una interpolación lineal para estimar mejor la raíz.

### ¿Dónde se aplica?
- Cuando se necesita convergencia más rápida que la bisección
- Problemas de mecánica
- Hidráulica computacional
- Simulación de sistemas físicos

---

## 🔹 Método de la Secante

### ¿Qué es?
Un método iterativo como Newton-Raphson, pero no requiere la derivada de la función. Utiliza dos aproximaciones anteriores para construir una secante.

### ¿Dónde se aplica?
- Situaciones donde la derivada es difícil de calcular
- Sistemas dinámicos complejos
- Optimización sin gradiente
- Análisis financiero y modelos predictivos

---

## 💻 Tecnologías

- Lenguaje: Python / Java / C++
- Librerías: Math, NumPy (según el lenguaje)

## 📂 Estructura del proyecto

```plaintext
├── newton_raphson/
├── biseccion/
├── falsa_posicion/
├── secante/
├── README.md

