# Métodos Numéricos para Integración

## 📘 Introducción

La integración numérica permite calcular aproximaciones de integrales definidas cuando no es posible hallar la solución analítica. Esto es útil para funciones complejas o cuando se trabaja con datos discretos. Este repositorio incluye métodos clásicos como Trapecio, Simpson 1/3, Simpson 3/8 y Cuadraturas Gaussianas.

## 🎯 Objetivo

Brindar herramientas prácticas para aproximar integrales definidas mediante métodos numéricos, destacando su teoría, aplicaciones y ejemplos de implementación para su uso en problemas reales.

---

## 🔹 Cuadraturas Gaussianas

### ¿Qué es?
Es un método de integración numérica que optimiza los puntos de evaluación y pesos para lograr una mayor precisión con menos evaluaciones, usando polinomios ortogonales como los de Legendre.

### ¿Dónde se aplica?
- Integración precisa de funciones complejas
- Cálculo de energía en física cuántica
- Solución de ecuaciones integrales
- Análisis estructural en ingeniería civil

---

## 🔹 Método del Trapecio

### ¿Qué es?
Este método aproxima el área bajo la curva dividiendo el intervalo en segmentos y calculando el área de trapecios formados por los puntos de la función.

### ¿Dónde se aplica?
- Análisis de datos experimentales
- Hidráulica y mecánica de fluidos
- Finanzas (cálculo de tasas integradas)
- Ingeniería ambiental

---

## 🔹 Método de Simpson 1/3

### ¿Qué es?
Un método que aproxima la integral utilizando parábolas (polinomios de segundo grado) en cada subintervalo par. Es más preciso que el trapecio en funciones suaves.

### ¿Dónde se aplica?
- Modelado de curvas en ingeniería
- Análisis estadístico
- Procesamiento de señales
- Simulación de trayectorias físicas

---

## 🔹 Método de Simpson 3/8

### ¿Qué es?
Similar al de Simpson 1/3 pero divide el intervalo en múltiplos de 3 para aplicar polinomios cúbicos, logrando una mayor precisión en ciertas condiciones.

### ¿Dónde se aplica?
- Modelado biomecánico
- Cálculo de áreas con curvas irregulares
- Automatización de cálculos integrales
- Aplicaciones científicas en biofísica y astronomía

---

## 💻 Tecnologías

- Lenguaje: Python / Java / C++
- Librerías: NumPy, SciPy (en Python), Math

