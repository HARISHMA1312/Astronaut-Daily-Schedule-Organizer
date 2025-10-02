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

| Package | Class / Type | Description | 
| :--- | :--- | :--- | 
| **`model/`** | `Task` | Represents a single astronaut task, holding details like description, duration, and priority. | - |
| | `TaskPriority` (Enum) | Defines the available priority levels for a task: **LOW**, **MEDIUM**, **HIGH**. | - |
| **`factory/`** | `TaskFactory` | Responsible for creating new `Task` objects based on input details. | 
| **`manager/`** | `ScheduleManager` | The central management class. It handles task additions, ensures no duplicates, and performs conflict checks. | 
| **`observer/`** | `TaskObserver` (Interface) | Defines the contract for all classes that need to be notified of changes (e.g., conflicts). | 
| | `ConflictNotifier` | Implements `TaskObserver`. Notifies astronauts or systems when scheduling conflicts arise. |
| **`ui/`** | `TaskInputDialog` | A Swing-based graphical user interface (GUI) component for inputting task details. | - |
| **`Main.java`** | - | The application's entry point that initializes and launches the system. | - |

---
# Design Patterns Implemented

1.  **Singleton Pattern**
    * **Applied to:** `ScheduleManager`
    * **Purpose:** Ensures only **one instance** of the scheduler exists across the system, providing a single, authoritative point for task management and conflict resolution.

2.  **Factory Pattern**
    * **Applied to:** `TaskFactory`
    * **Purpose:** Centralizes the creation of **`Task`** objects, decoupling the client code from the specific instantiation logic.

3.  **Observer Pattern**
    * **Applied to:** `TaskObserver` and `ConflictNotifier` observing `ScheduleManager`
    * **Purpose:** Establishes a one-to-many relationship, allowing the **`ScheduleManager`** to automatically notify the **`ConflictNotifier`** when a relevant state change (like a scheduling conflict) occurs.

# Core Features

This Astronaut Task Scheduling System provides the following functionalities:

* **Add** astronaut tasks
* **Remove** tasks
* **View** all tasks sorted by start time
* **Prioritize** tasks (High / Medium / Low)
* **Detect and notify conflicts**

# Output

**Add a new task with description, start time, end time, and priority level.**
<img width="924" height="360" alt="image" src="https://github.com/user-attachments/assets/5612ffe4-48ba-45bf-b7d7-b00531dc16fd" />

**Remove an existing task.**
<img width="940" height="302" alt="image" src="https://github.com/user-attachments/assets/8bec6c48-cb6f-4cf2-8aac-9fbf8986766b" />


**Validate that new tasks do not overlap with existing tasks.**
<img width="940" height="359" alt="image" src="https://github.com/user-attachments/assets/98ffecd9-9709-485b-a3b6-cc7c9edd2e4e" />


**Provide appropriate error messages for invalid operations.**
<img width="940" height="365" alt="image" src="https://github.com/user-attachments/assets/34a2ee66-ca38-4d8e-8e77-7dae1be63384" />


**Invalid time format**
<img width="940" height="348" alt="image" src="https://github.com/user-attachments/assets/6f1ca24d-0d63-4797-939e-a1c2dd4fe062" />


**Mark as completed**
<img width="940" height="357" alt="image" src="https://github.com/user-attachments/assets/b9aed32f-bf25-4bf0-b2f0-43eb0bbba511" />



 




