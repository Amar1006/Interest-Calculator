# Interest-Calculator

# Interest Rate Calculator (Java)

## 📌 Project Description

This is a simple **Java console-based application** that calculates the **interest rate** based on user input.
The program allows users to calculate the **rate of Simple Interest** or the **annual rate of Compound Interest** by entering values such as principal, time, and interest amount or final amount.

This project demonstrates the use of:

* Java fundamentals
* User input using `Scanner`
* Conditional statements (`switch`)
* Exception handling (`try-catch`)
* Mathematical calculations

---

## ⚙️ Features

The program provides two calculation options:

### 1️⃣ Simple Interest Rate

Calculates the **interest rate** when the following values are provided:

* Principal Amount (P)
* Time in Years (T)
* Simple Interest Amount (SI)

Formula used:

R = (SI × 100) / (P × T)

---

### 2️⃣ Compound Interest Annual Rate

Calculates the **annual compound interest rate** when the following values are provided:

* Principal Amount (P)
* Time in Years (T)
* Final Amount (A)

Formula used:

A = P × (1 + r/100)^t

Derived rate formula:

r = 100 × ((A / P)^(1 / t) − 1)

---

## 🖥️ How the Program Works

1. The program displays a menu:

   * Option 1: Simple Interest Rate
   * Option 2: Compound Interest Rate
2. The user selects an option.
3. The program asks for required inputs.
4. The interest rate is calculated and displayed.

---

## 📂 Project Structure

```
interest.java
README.md
```

---

## ▶️ How to Run the Program

### Step 1: Compile the program

```bash
javac interest.java
```

### Step 2: Run the program

```bash
java interest
```

---

## 💻 Example Output

```
Interest Rate Calculator
1. Simple Interest
2. Compound Interest
Choose option (1 or 2): 1

Enter principal amount (P): 1000
Enter time in years (T): 2
Enter simple interest amount (SI): 200

Computed simple interest rate: 10.0000% per annum
```

---

## 🛠️ Technologies Used

* Java
* Java Scanner Class
* Basic Mathematical Functions (`Math.pow`)

---

## 📚 Learning Purpose

This project is useful for beginners learning:

* Java programming
* Input handling
* Mathematical calculations in Java
* Basic financial formulas

---

## 👨‍💻 Author

Amar1006

---

⭐ If you like this project, consider giving it a star on GitHub!
