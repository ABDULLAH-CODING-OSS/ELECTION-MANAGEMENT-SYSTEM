🇵🇰 Election Management System

A complete Java‑based Election Management Application built with GUI, socket programming, client–server architecture, and database connectivity to simulate a secure election process for users and admins.

This project lets an administrator create/manage elections, voters register and vote once, and results display securely. It combines networking logic, database operations, and graphical interfaces to form a real‑world voting system.

📌 Project Overview

Election Management System is a desktop application that enables:

✔️ Admin to configure and monitor elections
✔️ Users to register and vote in their constituency
✔️ Only one vote allowed per user per election period
✔️ Socket‑based client–server communication
✔️ Persistent database storage for users, elections, and votes
✔️ Real‑time results for both admin and voters
✔️ Secure voting logic and controlled access

🧠 Core Features
🔐 User & Admin Roles

Admin

Setup new elections

Add, edit or remove candidates

View real‑time election results

Manage connected clients

Voter

Register with valid credentials

Login and cast vote

Only one vote per election

See results (if permitted)

🛠️ Architecture

📌 Client–Server Design

Central server manages election logic, user data, voting history and result broadcasting.

📌 Socket Programming

Java sockets are used for communication between client GUIs and the server.

📌 GUI Frontends

Admin and Voter graphical interfaces make interaction intuitive (Swing / AWT).

📌 Database Integration

User registration, votes, and election data are stored in a database (MySQL / SQLite support).

📂 What’s Inside
📦 Election‑Management‑System
├── src/
│   ├── admin/           # Admin GUI & logic
│   ├── client/          # Client / voter GUI & logic
│   ├── server/          # Server & socket handlers
│   └── database/        # DB connection classes
├── resources/           # Images, icons, config files
├── .gitignore
└── README.md
🚀 How It Works (Summary)

Server starts, loads election data from database and begins listening for connections.

Admin logs in, configures elections and candidates.

Voters connect as clients, register or login.

Voters can cast their ballot only once per election.

Server tracks votes and restricts multiple votes by the same user.

Results are shown to admin (and optionally to voters as permitted).

🛠️ Technical Stack
Component	Technology
Language	Java
Networking	Java Sockets
UI	Swing/AWT
DB	MySQL / SQLite / JDBC
Version Control	Git / GitHub
🧪 Voting Rules

✔ Only one vote per user in a given election
✔ Vote stored permanently in database
✔ Admin has full oversight and controls phase of election

📌 Getting Started (Dev Setup)

Clone the Repo

git clone https://github.com/ABDULLAH-CODING-OSS/ELECTION-MANAGEMENT-SYSTEM.git

Configure Database

Create database

Run provided SQL schema (if included)

Update DBConfig.java/JDBC connection settings

Compile & Run

Start the server (ServerMain.java)

Start Admin GUI

Start one or more voter clients

📈 Future Enhancements

📍 Encrypted communication (SSL/TLS)
📍 Role‑based security and authentication
📍 Multi‑constituency support
📍 Result analytics and charts

🤝 Contribution

Contributions are welcome!
Feel free to open issues, suggest features or send pull requests.
