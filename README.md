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

---
The Astronaut Task Scheduling System simulates managing and scheduling astronaut tasks in space missions. Tasks can be created, prioritized, and scheduled. The system notifies astronauts if there are conflicts and ensures efficient management.

Classes
•	model/
o	Task → Represents a single astronaut task
o	TaskPriority → Enum for task priority (LOW, MEDIUM, HIGH)
•	factory/
o	TaskFactory → Creates Task objects with given details
•	manager/
o	ScheduleManager → Singleton class that manages all tasks, ensures no duplicates, checks conflicts
•	observer/
o	TaskObserver → Interface for observers
o	ConflictNotifier → Implements TaskObserver, notifies astronauts of scheduling conflicts
•	ui/
o	TaskInputDialog → Swing UI for inputting astronaut tasks
•	Main.java
o	Entry point that launches the system

