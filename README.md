# Transaction Management App (JavaFX, Eclipse)

A simple GUI Banking application built in JavaFX, serving as a prototype for a login and transaction management app. Users can create accounts, log in, check balances, and perform withdrawals or deposits. All data is stored in a MySQL database.

## Features

- **User Authentication:** Create new accounts and securely log in.
- **Account Management:** View account balances.
- **Transactions:** Deposit and withdraw funds.
- **Database Integration:** All user and transaction data stored in MySQL.
- **GUI:** Interactive JavaFX-based user interface.

## Getting Started

### Prerequisites

- [Eclipse IDE](https://www.eclipse.org/downloads/)
- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [MySQL Server](https://dev.mysql.com/downloads/mysql/)
- JavaFX SDK (if not bundled with your JDK)
- The following libraries:
  - [jcalendar](https://toedter.com/jcalendar/)
  - [mysql-connector-java](https://dev.mysql.com/downloads/connector/j/)

### Setup Instructions

1. **Clone or Download the Project**
   - Import the project as an Eclipse Java project.

2. **Install Dependencies**
   - Add `jcalendar` and `mysql-connector-java` JARs to your project’s build path.

3. **Configure the Database**
   - Create a MySQL database and update database connection details in the code as required (host, username, password, database name).
   - Import any provided SQL scripts to set up necessary tables.

4. **Run the Application**
   - Open the `Main` or `Login` file in Eclipse.
   - Right-click and choose `Run As > Java Application`.

## Usage

- Register a new account or log in with existing credentials.
- View your balance, deposit, or withdraw money.
- All changes are reflected in the MySQL database.

## Libraries Used

- **JavaFX:** For building the graphical user interface.
- **jcalendar:** For date selection components.
- **mysql-connector-java:** For connecting Java to MySQL databases.

## Screenshots of the application
  ![image](https://github.com/user-attachments/assets/05305dd7-d240-4ae7-882b-87aed6b5c4f4)
  ![image](https://github.com/user-attachments/assets/ef3ddeec-2260-472a-b0d0-c2288d116c38)
  ![image](https://github.com/user-attachments/assets/e87d837e-7808-45ae-aac1-5141103de59d)
  ![image](https://github.com/user-attachments/assets/a514fe51-23cd-48cd-afcd-020195858318)
  ![image](https://github.com/user-attachments/assets/1475ed50-0ee1-4503-8ad8-df50b46a7a44)
  ![image](https://github.com/user-attachments/assets/714929d7-3314-43c1-b443-92c1b67d4289)
  ![image](https://github.com/user-attachments/assets/540b12f1-5490-495d-83c5-f91a1d9baec8)
  ![image](https://github.com/user-attachments/assets/24d9a62c-858a-427d-bcbc-9cef6fa58504)
  ![image](https://github.com/user-attachments/assets/57bea594-3467-493d-b2c6-95bfe580b380)
  ![image](https://github.com/user-attachments/assets/0cdd7192-2410-4003-8b3c-56694a534405)
  ![image](https://github.com/user-attachments/assets/889fb621-4782-4206-8873-d4855807e0bf)


## Author

Made by Shivam Glotra while self-learning via the web and books.

---

*This project can be used as a learning prototype for JavaFX login and transaction apps with database integration.*
