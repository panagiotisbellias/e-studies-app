# e-Studies App

A lightweight desktop application to help manage and track your personal studies and learning progress.

## Features

- Track study sessions and progress
- Export and backup data
- Generate automated summaries

## Installation

### Prerequisites
- Java 17+
- Maven 3.8+

1. Clone the repository:
   ```bash
   git clone https://github.com/panagiotisbellias/e-studies-app.git
   ```
2. Open the project in your preferred IDE or run the executable (if available).
   ```bash
   # Package application
   mvn clean package

   # Run application
   java -cp target/e-studies-app-1.0.0.jar gr.panagiotisbellias.e.studies.app.EStudiesApp
   ```
3. Run the application and follow the on-screen instructions to start managing your studies.

## Development

- Source code: `src/main/java`
- Tests: `src/test/java`

## Contributing

Found a bug or want to add a feature? Please open an issue or submit a pull request.

1. Fork the repository
2. Create a feature branch (git checkout -b feature/my-feature)
3. Commit changes (git commit -m 'Add my feature')
4. Push branch (git push origin feature/my-feature)
5. Open a Pull Request

## License

This project is licensed under the [Apache License 2.0](LICENSE).
See the [NOTICE](NOTICE) file for details.
