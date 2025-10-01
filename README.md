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
| **`model/`** | `Task` | Represents a single astronaut task, holding details like description, duration, and priority. | - |
| | `TaskPriority` (Enum) | Defines the available priority levels for a task: **LOW**, **MEDIUM**, **HIGH**. | - |
| **`factory/`** | `TaskFactory` | Responsible for creating new `Task` objects based on input details. | **Factory Method** (Creational) |
| **`manager/`** | `ScheduleManager` | The central management class. It handles task additions, ensures no duplicates, and performs conflict checks. | **Singleton** (Creational) |
| **`observer/`** | `TaskObserver` (Interface) | Defines the contract for all classes that need to be notified of changes (e.g., conflicts). | **Observer** (Behavioral) |
| | `ConflictNotifier` | Implements `TaskObserver`. Notifies astronauts or systems when scheduling conflicts arise. | **Observer** (Behavioral) |
| **`ui/`** | `TaskInputDialog` | A Swing-based graphical user interface (GUI) component for inputting task details. | - |
| **`Main.java`** | - | The application's entry point that initializes and launches the system. | - |

---
# Design Patterns Implemented

This system leverages three foundational design patterns to manage complexity and maintain flexibility:

1.  **Singleton Pattern**
    * **Applied to:** `ScheduleManager`
    * **Purpose:** Ensures only **one instance** of the scheduler exists across the system, providing a single, authoritative point for task management and conflict resolution.

2.  **Factory Pattern**
    * **Applied to:** `TaskFactory`
    * **Purpose:** Centralizes the creation of **`Task`** objects, decoupling the client code from the specific instantiation logic.

3.  **Observer Pattern**
    * **Applied to:** `TaskObserver` and `ConflictNotifier` observing `ScheduleManager`
    * **Purpose:** Establishes a one-to-many relationship, allowing the **`ScheduleManager`** to automatically notify the **`ConflictNotifier`** when a relevant state change (like a scheduling conflict) occurs.

## 🌟 Core Features

This Astronaut Task Scheduling System provides the following functionalities:

* **Add** astronaut tasks
* **Remove** tasks
* **View** all tasks sorted by start time
* **Prioritize** tasks (High / Medium / Low)
* **Detect and notify conflicts**
* Simple **Swing UI** for adding and managing tasks



