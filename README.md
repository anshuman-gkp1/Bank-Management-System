# 🏦 Bank Management System

A desktop **ATM simulation application** built with **Java Swing** and **MySQL**, providing a full-featured banking experience through a graphical user interface.

## 📌 Features

- 🔐 **User Authentication** — Secure login with PIN verification
- 📝 **Multi-step Signup** — Three-stage account creation collecting personal & banking details
- 💰 **Deposit** — Add funds to the account
- 💸 **Cash Withdrawal** — Withdraw specific amounts
- ⚡ **Fast Cash** — Quick withdrawal with preset amounts
- 📊 **Balance Enquiry** — View current account balance
- 🧾 **Mini Statement** — Review recent transactions
- 🔑 **PIN Change** — Update account PIN securely
- 🖼️ **Graphical ATM UI** — Realistic ATM screen using `javax.swing`

## 🛠️ Tech Stack

| Layer | Technology |
|-------|------------|
| Language | Java (JDK 8+) |
| GUI Framework | Java Swing / AWT |
| Database | MySQL |
| JDBC Driver | `mysql-connector-java-8.0.28` |

## 📁 Project Structure

```
Bank-Management-System/
├── main_Class.java       # ATM main dashboard
├── Login.java            # PIN-based login screen
├── Signup.java           # Account creation (Step 1)
├── Signup2.java          # Account creation (Step 2)
├── Signup3.java          # Account creation (Step 3)
├── Deposit.java          # Deposit functionality
├── Withdrawl.java        # Cash withdrawal
├── FastCash.java         # Quick preset withdrawals
├── BalanceEnquiry.java   # Balance check
├── mini.java             # Mini statement
├── Pin.java              # PIN change
├── ConFile.java          # Database connection helper
└── icon/                 # ATM background images
```

## ⚙️ Getting Started

### Prerequisites

- Java JDK 8 or higher
- MySQL Server running locally
- An IDE like IntelliJ IDEA or Eclipse (or use CLI)

### Database Setup

1. Create a MySQL database (e.g., `bankmanagement`)
2. Create the required tables for users and transactions
3. Update the connection credentials in `ConFile.java`:
   ```java
   Connection con = DriverManager.getConnection(
       "jdbc:mysql://localhost:3306/bankmanagement",
       "your_username",
       "your_password"
   );
   ```

### Run the Application

```bash
# Compile all Java files
javac -cp .;mysql-connector-java-8.0.28.jar *.java

# Run the main class
java -cp .;mysql-connector-java-8.0.28.jar main_Class
```

> On Linux/macOS, replace `;` with `:` in the classpath.

## 📸 Screens

| Screen | Description |
|--------|-------------|
| Login | Enter card number and PIN |
| Dashboard | Select transaction type |
| Deposit / Withdraw | Perform fund operations |
| Mini Statement | View recent 5 transactions |

## 🔮 Future Improvements

- Add fund transfer between accounts
- Add transaction history with date filters
- Encrypt stored PINs using hashing (BCrypt)
- Add admin panel for account management
