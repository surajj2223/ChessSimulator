## Chess Movement Simulator

### Overview

This project simulates an empty chessboard and helps you find the possible movements for three chess pieces: King, Pawn, and Queen.
Each piece adheres to its respective movement rules:

1. King: Can move one square in any direction (horizontal, vertical, diagonal).
2. Pawn: Can move one square forward vertically
3. Queen: Can move any number of squares in all 8 directions (horizontal, vertical, diagonal).

The implementation uses an `OOP` paradigm strongly showcasing the implementation of `IS-A` relationship using an `abstract class ChessPiece` and its real-world implementations such as `King, Queen & Pawn`.


### Features of the simulator
- Simulates the chessboard using standard coordinates (e.g., D5, A1, etc.).
- Abstract class for shared logic, ensuring code reusability.
- Unit tests for verifying correctness of movement logic.
- Supports edge cases with meaningful exceptions (e.g., pieces on corners/edges of the board, invalid input validation).

### Prerequisites

- Java Development Kit (JDK) 8+: Ensure javac and java are available in your PATH. Check with below command - 
````
  java -version
````
- Gradle Build Tool: Either install Gradle globally or use the Gradle wrapper included in this project. Check with below command - 
````
./gradlew --version
````

### Run the application

- Use the `org.example.Main` class to execute the code.
- The application will wait for the input to be fed in `Piece, Position` format such as `King,D5`.
- Once the input is fed, the application will return back with appropriate output.

### Run tests

````
./gradlew :test
````
<br>

That's it for this simulator.
<br>
Happy Coding!