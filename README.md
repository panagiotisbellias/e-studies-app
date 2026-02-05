# e-Studies App

A lightweight **Java desktop application** for managing, tracking, and reviewing personal study sessions and learning
progress. Designed to be simple, offline-first, and easy to extend.

---

## Table of Contents

* Overview
* Features
* Tech Stack
* Project Structure
* Setup & Installation

   * Prerequisites
   * Build from Source
   * Run the Application
* Usage Guide
* Configuration
* Development
* Testing
* Packaging & Distribution
* CI / Automation
* Contributing
* License

---

## Overview

**e-Studies App** helps you organize your learning routine by tracking study sessions, storing progress locally, and
generating summaries. It is ideal for self‑learners who want a minimal, desktop-based tool without external
dependencies or cloud services.

---

## Features

* Track study sessions and learning progress
* Store data locally
* Export and back up data
* Generate automated summaries
* Simple desktop UI
* Offline-first operation

---

## Tech Stack

* **Java 11+**
* **Maven** (build & dependency management)
* **JUnit** (testing)
* **GitHub Actions** (CI)

---

## Project Structure

```
e-studies-app/
├── .github/workflows/ci.yml   # CI pipeline
├── pom.xml                   # Maven configuration
├── README.md
├── LICENSE
├── NOTICE
└── src/
    ├── main/java/
    │   └── gr/panagiotisbellias/e/studies/app/
    │       ├── EStudiesApp.java   # Application entry point
    │       ├── models/            # Domain models
    │       ├── services/          # Business logic
    │       └── utils/             # Utilities
    └── test/java/                 # Unit tests
```

---

## Setup & Installation

### Prerequisites

Ensure the following are installed on your system:

* **Java JDK 11 or newer**
* **Maven 3.8+**
* Git (optional, for cloning)

Verify versions:

```bash
java -version
mvn -version
```

---

### Build from Source

1. Clone the repository:

```bash
git clone https://github.com/panagiotisbellias/e-studies-app.git
cd e-studies-app
```

2. Build the project:

```bash
mvn clean package
```

This produces a runnable JAR under `target/`.

---

### Run the Application

Run directly using Java:

```bash
java -cp target/e-studies-app-1.2.0.jar \
  gr.panagiotisbellias.e.studies.app.EStudiesApp
```

If a shaded or executable JAR is configured in the future, it can be launched with:

```bash
java -jar e-studies-app.jar
```

---

## Usage Guide

1. Start the application
2. Create or open your local study data
3. Add study sessions:
   * Subject
   * Duration
   * Notes
4. Review progress summaries
5. Export or back up your data when needed

All data is stored locally and remains under your control.

---

## Configuration

Currently, the application uses **default internal configuration**.

Planned / extensible configuration options:

* Custom data storage paths
* Export formats
* UI preferences

These can be added via a configuration file or CLI flags in future versions.

---

## Development

### IDE Setup

Recommended IDEs:

* IntelliJ IDEA
* Eclipse
* VS Code (Java extensions)

Open the project as a **Maven project**.

---

### Code Style

* Follow standard Java conventions
* Keep logic in services, not UI
* Prefer small, testable methods

---

## Testing

Run unit tests with:

```bash
mvn test
```

Test sources are located under:

```
src/test/java
```

---

## Packaging & Distribution

To generate a distributable JAR:

```bash
mvn clean package
```

Artifacts are generated in:

```
target/
```

Future improvements may include:

* Executable JAR
* Native installers (jpackage)

---

## CI / Automation

The project includes a **GitHub Actions** workflow:

* Triggered on push and pull requests
* Runs build and tests automatically

Workflow file:

```
.github/workflows/ci.yml
```

---

## Contributing

Contributions are welcome!

1. Fork the repository
2. Create a feature branch:
   ```bash
   git checkout -b feature/my-feature
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add my feature"
   ```
4. Push to your fork and open a Pull Request

---

## License

This project is licensed under the **Apache License 2.0**.

See:

* `LICENSE`
* `NOTICE`

for full details.
