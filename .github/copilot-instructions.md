# Copilot Instructions for AED-2026

## Project shape
- This repository is a collection of Java exercises, not a single application. Folders like `260514/`, `260515/`, `260603/`, `260812/` are assignment folders, each containing standalone console programs.
- Most files are self-contained: they define one public class, a `main` method, and helper methods in the same file. There is no package structure, service layer, or shared application runtime.
- The usual pattern is `public class Nome` with the filename matching the class name, e.g. `260515/AT02.java` defines `AT02`, `260812/At11.java` defines `At11`, and `260819/Aula02.java` defines `Aula02`.

## Code patterns to preserve
- Input-heavy examples use `Scanner` and static helpers such as `LerInt`, `LerSenha`, `LerChar`, or `entrada` fields, as seen in `AT01.java`, `AT02.java`, and `AT04.java`.
- Several exercises use procedural Java: simple static methods, loops, conditionals, and console output instead of OO abstractions or frameworks.
- Utility methods are often defined in the same class, e.g. `valorIgual` in `260812/At11.java` and `contarVogal`/`removerEspacos`/`testarPalindromo` in `260819/Aula02.java`.
- Keep the educational style readable and direct; do not introduce packages, dependency injection, or multi-file architecture unless the task explicitly requires it.

## Build and run workflow
- There is no Gradle/Maven build. Compile from the exercise folder: `cd <folder> && javac *.java`.
- Run the target class from the same folder: `java NomeDaClasse` (for example, `cd 260515 && javac *.java && java AT02`).
- For single-file edits, validate by recompiling only that folder, not the whole repo.

## Integration boundaries and dependencies
- Cross-folder communication is effectively nonexistent; treat each assignment as isolated.
- External libraries are not used. Imports are usually limited to `java.util.Scanner` and standard JDK features such as `Math` and `String`.
- Do not assume a shared database, API, or config layer; these are local exercises built around console I/O and algorithm practice.

## Practical guidance for AI agents
- When asked to change code, prefer local edits inside the relevant folder and keep method names consistent with the existing assignment naming style.
- If you add helper methods, make them static and keep them inside the same class unless the task clearly indicates otherwise.
- Examples from this repo show the dominant style: simple interactive programs, validation loops, arrays/strings utilities, and direct terminal output.
- Before finishing, compile and run the affected class in its folder to confirm the behavior matches the exercise's expected console flow.
