# Copilot Instructions for AED-2026

## Project Overview
The AED-2026 project consists of Java files organized into directories. The main components are located in the `260514` and `260515` folders, which contain Java source files and their compiled class files. The project is structured to facilitate modular development, with each directory representing a distinct set of functionalities.

## Architecture
- **Major Components**: 
  - `260514/`: Contains `AT01.java`, which is a core component of the application.
  - `260515/`: Contains `AT02.java` and `AT03.java`, which are additional components that may interact with `AT01.java`.
  
- **Data Flow**: 
  - The components communicate through method calls and shared data structures. Understanding the interactions between these files is crucial for making effective modifications.

## Developer Workflows
- **Building the Project**: 
  - Use the command `javac *.java` in the respective directories to compile the Java files. Ensure that you are in the correct directory (`260514` or `260515`) when executing this command.

- **Running the Application**: 
  - Execute the compiled classes using `java AT02` or `java AT03` from the terminal in the `260515` directory.

- **Testing**: 
  - Currently, there are no explicit testing files or frameworks documented. Developers should consider implementing unit tests for critical methods in each Java file.

## Project-Specific Conventions
- **Naming Conventions**: 
  - Java files should be named according to the class they contain, following the `PascalCase` convention.
  
- **Code Structure**: 
  - Each Java file should contain a single public class. Private methods and variables should be prefixed with an underscore (`_`) to distinguish them from public members.

## Integration Points
- **External Dependencies**: 
  - The project does not currently utilize external libraries. Future enhancements may require the addition of libraries, which should be documented in the `README.md`.

- **Cross-Component Communication**: 
  - Components communicate primarily through method calls. Ensure that method signatures are consistent across files to avoid integration issues.

## Examples
- **Method Call Example**: 
  - In `AT02.java`, if you need to call a method from `AT01.java`, ensure that you import the class correctly and handle any exceptions that may arise.

## Conclusion
This document serves as a foundational guide for AI coding agents to navigate the AED-2026 project effectively. For any updates or additional patterns discovered, please contribute to this document to enhance its utility.
