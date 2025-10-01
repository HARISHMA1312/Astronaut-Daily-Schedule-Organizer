# Astronaut-Daily-Schedule-Organizer
# EXERCISE 1 - Problem Statement on Design patterns

Two use cases to demonstrate two **behavioural** design patterns.

* **Observer**
* **Strategy**

---

Two use cases to demonstrate two **creational** design patterns.

* **Factory**
* **Singleton**

---

Two use cases to demonstrate two **structural** design patterns.

* **Adaptor**
* **Decorator**
# EXERCISE 2: 1. Astronaut Daily Schedule Organizer Programming Exercise

The Astronaut Task Scheduling System simulates managing and scheduling astronaut tasks in space missions. Tasks can be created, prioritized, and scheduled. The system notifies astronauts if there are conflicts and ensures efficient management.

| Package | Class / Type | Description | Design Pattern |
| :--- | :--- | :--- | :--- |
| **`model/`** | **Model Classes** | Represents the core data entities for the system: <br> • **`Task`**: Represents a single astronaut task, holding details like description and priority. <br> • **`TaskPriority`** (Enum): Defines the available priority levels (**LOW**, **MEDIUM**, **HIGH**). | - |
| **`factory/`** | `TaskFactory` | Responsible for creating new `Task` objects based on input details. | **Factory Method** (Creational) |
| **`manager/`** | `ScheduleManager` | The central management class. It handles task additions, ensures no duplicates, and performs conflict checks. | **Singleton** (Creational) |
| **`observer/`** | `TaskObserver` (Interface) | Defines the contract for all classes that need to be notified of changes (e.g., conflicts). | **Observer** (Behavioral) |
| | `ConflictNotifier` | Implements `TaskObserver`. Notifies astronauts or systems when scheduling conflicts arise. | **Observer** (Behavioral) |
| **`ui/`** | `TaskInputDialog` | A Swing-based graphical user interface (GUI) component for inputting task details. | - |
| **`Main.java`** | - | The application's entry point that initializes and launches the system. | - |

---

