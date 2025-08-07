# AnalisisdeVentas

Este proyecto analiza datos de clientes desde un archivo Excel usando Java y Apache POI.

## Requisitos

- Java 17
- Maven

## Cómo usar

1. Coloca el archivo `ventas.xlsx` en `src/main/resources/`.
2. Ejecuta el proyecto con:

```bash
mvn clean verify

---

### 2. ✅ `.gitignore`

```gitignore
# Maven
/target/
*.log

# IntelliJ
.idea/
*.iml

# Eclipse
.classpath
.project
.settings/

# VS Code
.vscode/

# Sistema
.DS_Store
Thumbs.db
