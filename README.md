# Principios SOLID - Ejemplos Prácticos en Java

Este proyecto demuestra la implementación de los principios SOLID mediante ejemplos prácticos en Java, enfocándose específicamente en el **Principio de Responsabilidad Única (SRP)** y el **Principio Abierto/Cerrado (OCP)**.

## 📋 Tabla de Contenidos

- [Estructura del Proyecto](#estructura-del-proyecto)
- [SRP - Principio de Responsabilidad Única](#srp---principio-de-responsabilidad-única)
- [OCP - Principio Abierto/Cerrado](#ocp---principio-abiertocerrado)
- [Requisitos](#requisitos)
- [Compilación y Ejecución](#compilación-y-ejecución)
- [Conceptos Clave](#conceptos-clave)

## 📁 Estructura del Proyecto

```
SEMANA 7/
├── SRP/                          # Ejemplos del Principio de Responsabilidad Única
│   ├── ValidadorUsuario.java     # Clase responsable únicamente de validaciones
│   ├── RegistroUsuario.java      # Clase responsable del proceso de registro
│   ├── AutenticadorUsuario.java  # Clase responsable de la autenticación
│   └── GestionarUsuarioApp.java  # Aplicación principal que coordina las operaciones
│
└── OCP/                          # Ejemplos del Principio Abierto/Cerrado
    ├── Forma.java                # Clase abstracta base para formas geométricas
    ├── Rectangulo.java           # Implementación específica para rectángulos
    ├── Circulo.java              # Implementación específica para círculos
    ├── Triangulo.java            # Nueva forma agregada sin modificar código existente
    └── CalculadoraFormas.java    # Calculadora que usa polimorfismo
```

## 🎯 SRP - Principio de Responsabilidad Única

> *"Una clase debe tener una sola razón para cambiar"*

### Ejemplo: Sistema de Gestión de Usuarios

El ejemplo en la carpeta `SRP/` demuestra cómo separar responsabilidades en un sistema de usuarios:

#### 📋 Clases y Responsabilidades

| Clase | Responsabilidad Única |
|-------|----------------------|
| `ValidadorUsuario` | Validar formato y requisitos de usuarios y contraseñas |
| `RegistroUsuario` | Gestionar el proceso de registro de nuevos usuarios |
| `AutenticadorUsuario` | Manejar la autenticación de usuarios existentes |
| `GestionarUsuarioApp` | Coordinar y demostrar el uso de todas las clases |

#### 🔧 Características Implementadas

- **Validación de Usuario**: Mínimo 5 caracteres, solo letras, números y guiones bajos
- **Validación de Contraseña**: Mínimo 8 caracteres, al menos una mayúscula, minúscula y número
- **Separación clara de responsabilidades**: Cada clase tiene un propósito específico
- **Reutilización de código**: Las validaciones se reutilizan en registro y autenticación

#### 💻 Ejecución del Ejemplo SRP

```bash
cd SRP
javac *.java
java GestionarUsuarioApp
```

**Salida esperada:**
```
Usuario registrado exitosamente.
El usuario ha iniciado sesión correctamente.

--- Pruebas de validación ---
Usuario válido 'test': false
Usuario válido 'usuario123': true
Clave válida 'abc': false
Clave válida 'Clave123': true
```

## 🔓 OCP - Principio Abierto/Cerrado

> *"Las entidades de software deben estar abiertas para extensión, pero cerradas para modificación"*

### Ejemplo: Calculadora de Formas Geométricas

El ejemplo en la carpeta `OCP/` muestra cómo diseñar un sistema extensible usando herencia y polimorfismo:

#### 🏗️ Arquitectura del Sistema

```
Forma (abstracta)
├── Rectangulo
├── Circulo
└── Triangulo (agregada posteriormente sin modificar código existente)
```

#### 📐 Formas Implementadas

| Forma | Fórmula del Área | Parámetros |
|-------|------------------|------------|
| **Rectángulo** | `ancho × alto` | ancho, alto |
| **Círculo** | `π × radio²` | radio |
| **Triángulo** | `(base × altura) ÷ 2` | base, altura |

#### ✨ Características del Diseño

- **Extensibilidad**: Agregar nuevas formas sin modificar código existente
- **Polimorfismo**: `CalculadoraFormas` trabaja con cualquier tipo de `Forma`
- **Validación centralizada**: Método común para validar dimensiones positivas
- **Manejo de errores**: Excepciones descriptivas para valores inválidos

#### 💻 Ejecución del Ejemplo OCP

```bash
cd OCP
javac *.java
java CalculadoraFormas
```

**Salida esperada:**
```
Área total de todas las formas: 90.27

Áreas individuales:
Rectangulo: 50.00
Circulo: 28.27
Triangulo: 12.00

Validación funcionando: La dimensión 'ancho' debe ser mayor a cero. Valor recibido: -5.00
```

## 📋 Requisitos

- **Java**: JDK 8 o superior
- **Sistema Operativo**: Windows, macOS, o Linux
- **IDE recomendado**: VS Code con extensión Java

## 🚀 Compilación y Ejecución

### Compilar todos los archivos

```bash
# Para SRP
cd SRP
javac *.java

# Para OCP
cd OCP
javac *.java
```

### Ejecutar aplicaciones principales

```bash
# Ejecutar ejemplo SRP
java GestionarUsuarioApp

# Ejecutar ejemplo OCP
java CalculadoraFormas
```

## 💡 Conceptos Clave

### 🎯 SRP - Beneficios

- **Mantenibilidad**: Cambios en validación no afectan autenticación
- **Testabilidad**: Cada clase se puede probar independientemente
- **Reutilización**: Las validaciones se usan en múltiples contextos
- **Claridad**: Cada clase tiene un propósito claro y específico

### 🔓 OCP - Beneficios

- **Extensibilidad**: Nuevas formas se agregan fácilmente
- **Estabilidad**: Código existente no se modifica
- **Polimorfismo**: Algoritmos genéricos trabajan con especializaciones
- **Escalabilidad**: El sistema crece sin complicar el código base

## 🧪 Casos de Prueba

### SRP - Validaciones
- ✅ Usuario válido: `"usuario123"` (≥5 chars, alfanumérico)
- ❌ Usuario inválido: `"test"` (<5 caracteres)
- ✅ Contraseña válida: `"Clave123"` (≥8 chars, mayús, minús, número)
- ❌ Contraseña inválida: `"abc"` (muy corta, sin mayúsculas ni números)

### OCP - Cálculos de Área
- **Rectángulo (5×10)**: 50.00 unidades²
- **Círculo (radio=3)**: 28.27 unidades²
- **Triángulo (base=4, altura=6)**: 12.00 unidades²
- **Total**: 90.27 unidades²

## 📚 Referencias

- [Principios SOLID](https://en.wikipedia.org/wiki/SOLID)
- [Clean Code by Robert C. Martin](https://www.amazon.com/Clean-Code-Handbook-Software-Craftsmanship/dp/0132350882)
- [Design Patterns: Elements of Reusable Object-Oriented Software](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)

---

## 👨‍💻 Autor

**Noe Santiago**  
Proyecto educativo - Principios SOLID en Java

---

*Este proyecto fue desarrollado con fines educativos para demostrar la aplicación práctica de los principios SOLID en el desarrollo de software.*