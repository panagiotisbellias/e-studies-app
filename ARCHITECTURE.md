# Architecture Overview

This document describes the high-level architecture of the **e-studies-app** project.

---

## 🧩 Overview

The project is a **Java backend application** built using **Maven**
and follows a **package-by-feature / layered architecture** approach.

The goals are:
- Simplicity
- Clear separation of responsibilities
- Ease of testing and maintenance

---

## 🏗 Project Structure

The project follows the standard Maven layout:

```text
.
├── .github/                # GitHub workflows & templates
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── gr.panagiotisbellias.e.studies.app
│   │   │       ├── models/ # Domain models / DTOs
│   │   │       └── util/   # Utility & helper classes
│   │   └── resources/     # Configuration & resources
│   └── test/
│       └── java/
│           └── gr.panagiotisbellias.e.studies.app
├── target/                 # Build output (generated)
└── pom.xml
