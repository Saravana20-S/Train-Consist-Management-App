# Train Consist Management App

A Java console application that demonstrates fundamental programming concepts, data structures, algorithms, collections, streams, regular expressions, exception handling, and searching/sorting techniques through a Train Consist Management System.

## Overview

This project models various train consist management operations using Java. Each use case focuses on a specific concept and is implemented in a separate package for better organization and modularity.

## Features

- Passenger record management
- Unique bogie validation
- Train consist management using collections
- Ordered and unique bogie storage
- Bogie-capacity mapping
- Sorting using Comparator
- Stream API filtering and grouping
- Capacity aggregation using Stream reduction
- Regular expression validation
- Safety compliance checks
- Performance comparison between loops and streams
- Custom exception handling
- Runtime exception management
- Manual and library-based sorting
- Linear and Binary Search implementations
- Defensive programming using runtime exceptions

## Use Cases

| Use Case | Description | Concepts |
|----------|-------------|----------|
| UC1 | Passenger Management | ArrayList |
| UC2 | Passenger CRUD Operations | List Operations |
| UC3 | Unique Bogie IDs | HashSet |
| UC4 | Train Consist Management | LinkedList |
| UC5 | Preserve Insertion Order | LinkedHashSet |
| UC6 | Bogie Capacity Mapping | HashMap |
| UC7 | Sort Bogies by Capacity | Comparator |
| UC8 | Filter Passenger Bogies | Stream API |
| UC9 | Group Bogies by Type | Collectors.groupingBy |
| UC10 | Total Seating Capacity | Stream reduce |
| UC11 | Train ID & Cargo Validation | Regex (Pattern & Matcher) |
| UC12 | Goods Bogie Safety Compliance | Streams & allMatch |
| UC13 | Loop vs Stream Performance | System.nanoTime |
| UC14 | Invalid Capacity Handling | Custom Checked Exception |
| UC15 | Safe Cargo Assignment | try-catch-finally |
| UC16 | Bubble Sort | Sorting Algorithm |
| UC17 | Arrays.sort() | Java Arrays Utility |
| UC18 | Linear Search | Sequential Search |
| UC19 | Binary Search | Divide and Conquer |
| UC20 | Exception Handling During Search | IllegalStateException |

## Technologies Used

- Java
- Java Collections Framework
- Stream API
- Regular Expressions
- Exception Handling
- Arrays Utility
- Object-Oriented Programming

## Project Structure

```
TrainConsistManagementApp/
│── src/
│   └── main/
│       └── java/
│           └── com/
│               └── trainconsistapp/
│                   ├── passengerscrud/
│                   ├── bogieunique/
│                   ├── linkedlist/
│                   ├── linkedhashset/
│                   ├── hashmap/
│                   ├── comparator/
│                   ├── filterbogies/
│                   ├── groupbogies/
│                   ├── totalcapacity/
│                   ├── regexvalidation/
│                   ├── safetycompliance/
│                   ├── performancecomparison/
│                   ├── invalidcapacity/
│                   ├── cargosafety/
│                   ├── bubblesort/
│                   ├── arrayssort/
│                   ├── linearsearch/
│                   ├── binarysearch/
│                   └── exceptionhandling/
```

## Learning Outcomes

- Implement Java Collection Framework classes effectively.
- Understand searching and sorting algorithms.
- Apply Stream API for data processing.
- Use regular expressions for input validation.
- Implement custom and runtime exception handling.
- Compare algorithm performance using benchmarking.
- Practice defensive programming techniques.
- Strengthen object-oriented programming concepts.

## How to Run

1. Clone the repository.

```bash
git clone https://github.com/<your-username>/TrainConsistManagementApp.git
```

2. Open the project in your preferred Java IDE.

3. Navigate to the desired use case package.

4. Run the corresponding `UseCaseXTrainConsistMgmnt.java` file.

## Repository

Each use case is implemented independently, allowing concepts to be understood and executed individually.

## License

This project is intended for educational and learning purposes.