# Date Calculator and Event Management System

## 1. Project Overview

The **Date Calculator and Event Management System** is a Java-based console application developed using Object-Oriented Programming concepts.

The project provides two main functionalities:

1. **Date Calculation** — validates dates, checks leap years, and adds or subtracts days from a given date.
2. **Event Management** — allows users to add, display, search, remove, save, and load event records.

The application is divided into six Java classes, with each class having a specific responsibility. Event data is stored in a text file named `events.txt`.

---

## 2. Features

### Date Calculation

* Leap-year checking
* Days-in-month calculation
* Date validation
* Add days to a date
* Subtract days from a date
* Prevention of dates before `1/1/1`

### Event Management

* Add an event
* Display all events
* Search for an event
* Remove an event
* Store event name, date, and description

### File Handling

* Save events to `events.txt`
* Load events from `events.txt`
* Handle file-related errors
* Prevent duplicate events when the same saved file is loaded repeatedly

---

## 3. Technologies and Tools

| Technology / Tool | Purpose                   |
| ----------------- | ------------------------- |
| Java              | Main programming language |
| BlueJ             | Development environment   |
| OOP               | Application design        |
| ArrayList         | In-memory event storage   |
| Java I/O          | File reading and writing  |
| Text File         | Persistent event storage  |

### External Dependencies

No external libraries or frameworks are required.

The project uses standard Java classes only.

---

## 4. Project Structure

```text
Date-Calculator/
│
├── Date.java
├── DateCalculator.java
├── Event.java
├── EventManager.java
├── FileManager.java
├── Main.java
│
├── README.md
├── statement.md
│
└── events.txt
```

### Description of Java Files

| File                  | Responsibility                                   |
| --------------------- | ------------------------------------------------ |
| `Date.java`           | Represents a date using day, month, and year     |
| `DateCalculator.java` | Performs date validation and date calculations   |
| `Event.java`          | Represents an event                              |
| `EventManager.java`   | Manages the collection of events                 |
| `FileManager.java`    | Saves and loads events from a file               |
| `Main.java`           | Provides the menu and controls program execution |

`events.txt` is generated/used when the Save and Load features are used.

---
## 5. Installation and Setup

### Step 1: Install Java

Install a compatible Java Development Kit.

Verify the installation using:

```text
java -version
```

and:

```text
javac -version
```

### Step 2: Get the Project

Download or clone the project repository.

Place all six `.java` files in the same project folder.

### Step 3: Open the Project in BlueJ

1. Open BlueJ.
2. Select **Project → Open Project**.
3. Select the project folder.
4. Make sure all six Java classes are visible.
5. Compile all classes.

No additional libraries need to be installed.

---

## 6. Testing

The following test cases can be used to verify the application:

| Test Case                | Input            | Expected Result     |
| ------------------------ | ---------------- | ------------------- |
| Leap year                | `2028`           | Leap year           |
| Valid leap date          | `29/2/2028`      | Valid               |
| Invalid leap date        | `29/2/2027`      | Invalid             |
| Invalid month date       | `31/4/2026`      | Invalid             |
| Add across leap day      | `28/2/2028 + 1`  | `29/2/2028`         |
| Add across year          | `31/12/2026 + 1` | `1/1/2027`          |
| Subtract across leap day | `1/3/2028 - 1`   | `29/2/2028`         |
| Minimum date             | `1/1/1 - 1`      | Rejected            |
| Save and load            | Save → Load      | Events restored     |
| Repeated load            | Load twice       | No duplicate events |

---


## 7. Screenshots

### 1. Main Menu

<img width="206" height="187" alt="Screenshot 2026-09-18 113058" src="https://github.com/user-attachments/assets/11a015d4-657f-4d39-bc6a-79478b125028" />


### 2. Add an Event

<img width="220" height="215" alt="Screenshot 2026-09-18 113305" src="https://github.com/user-attachments/assets/8faf7d03-4f78-4d27-8fb5-56009c130add" />

### 3. Display Events

<img width="234" height="125" alt="Screenshot 2026-09-18 113314" src="https://github.com/user-attachments/assets/0a4f83a1-166d-4404-a268-54c2dc60559b" />

### 4. Search an event

<img width="251" height="121" alt="Screenshot 2026-09-18 113321" src="https://github.com/user-attachments/assets/a816f3b5-b5c6-4b98-9c64-9a2553e3ed42" />

### 5. Date Calculation

<img width="245" height="204" alt="Screenshot 2026-09-18 113329" src="https://github.com/user-attachments/assets/fb232c1f-7c95-4a13-8e6f-ac33fdfd4e34" />


### 6. Exit 

<img width="216" height="61" alt="Screenshot 2026-09-18 113340" src="https://github.com/user-attachments/assets/87180eeb-c23f-45b8-a6b7-d0036e567412" />

---
