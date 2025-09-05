````markdown
# scrambleString

A Java application that checks whether one string is a scrambled version of another using recursion and dynamic programming.

## 🚀 Features

- Checks if one string is a scrambled version of another
- Recursive algorithm with optional memoization (if applicable)
- Command-line interface for quick usage and testing
- Unit tests included

## 🛠️ Technologies Used

- Java 21 (or whichever version you're using)
- Maven (if using `pom.xml`) 
- JUnit for testing (if included)

## 📦 Getting Started

### Prerequisites

- Java installed (Java 11+ recommended)
- Maven installed

### Clone the Repository

```bash
git clone https://github.com/pedrohk/scrambleString.git
cd scrambleString
````

### Build & Run

Using **Maven**:

```bash
mvn clean install
mvn exec:java -Dexec.mainClass="com.pedrohk.scrambleString"
```
### Example Usage

```bash
Input: s1 = "great", s2 = "rgeat"
Output: true
```

## 🧪 Running Tests

```bash
mvn test
```

## 📂 Project Structure

```
scrambleString/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/pedrohk/scrambleString.java
│   └── test/
│       └── java/
│           └── com/pedrohk/scrambleStringTest.java
├── pom.xml 
└── README.md
```

