# Command Pattern was implemented 
### Command (interface): Declares the execute() method, which encapsulates a request.
### ConcreteCommand classes (e.g., OpenCommand): Implement the Command interface and define how to execute a specific action. They hold a receiver (TextEditor) and invoke its methods.
### Receiver (TextEditor): Knows how to perform the actual work requested by the command.
### Invoker (MenuOptions): Holds and invokes Command objects. It decouples the object that invokes the operation from the one that knows how to perform it.
### Main (CommandPatternDemo): Creates ConcreteCommand objects and sets their receiver.

# SOLID Principles in the Command Pattern (Short Explanation)

### SRP: Each class has one job (e.g., OpenCommand only opens).
### OCP: Add new commands without modifying existing code.
### LSP: Any Command can be used by the Invoker.
### ISP: Command interface is simple and focused.
### DIP: Invoker depends on the Command interface, not concrete commands.





# Chain of Responsibility
# Explanation with SOLID principles

### Single Responsibility: Each class has one specific responsibility:

### Logger: Defines the logging interface.
### InfoLogger, WarningLogger, ErrorLogger: Handle specific log levels.
### ChainOfResponsibilityDemo: Sets up and uses the chain.
### Open/Closed: You can easily add new loggers (e.g., DebugLogger, FatalLogger) without modifying existing classes.

### Liskov Substitution: Any logger in the chain can be replaced with another logger that implements the Logger interface.

### Interface Segregation: The Logger interface is concise and focused on logging.

### Dependency Inversion: Loggers depend on the Logger interface, not on concrete implementations of other loggers.