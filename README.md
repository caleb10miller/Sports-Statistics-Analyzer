# Sports-Statistics-Analyzer
I completed this java project for my CS501 class at Drexel University. I created a way to input sports statistics for multiple types of athletes: Football and Basketball Players. This project showcases an understanding of classes and how they interact with each other (is-a / has-a relationships) and data input validation.

## Overview
This program is designed for basketball fans and data scientists who wish to create instances of players and interact with their statistics. It allows users to add, set, and display statistics for basketball and football players, ensuring flexibility for future expansions, including additional player types and statistics analysis features.

## Features
- Add and manage basketball and football players.
- Display statistics for each player.
- Interface StatsDisplayable for consistent statistics display across different player types.
- Extendable design for future expansions such as more detailed analytics, player comparisons, and data export.

## How to Run
Ensure you have Java installed on your system to compile and run this program. To start the application, navigate to the project directory in your terminal and run:

```bash
java Driver.java
Follow the on-screen prompts to add players and view statistics.
```

Classes and Interfaces
Player (Abstract Class): The base class for all player types, providing common attributes and methods.
FootballPlayer and BasketballPlayer (Classes): Extend Player to represent specific sports players with unique statistics.
StatsDisplayable (Interface): Implemented by player classes to ensure they provide a method for statistics display.
Driver (Class): Contains the main method and the user interface for interacting with the program.
WhiteBoxTesting (Class): Provides testing examples and validation for the program's functionality.
Future Expansion
The program is designed with expansion in mind. Future updates can include:

Additional player types (e.g., Baseball, Soccer).
Enhanced statistical analysis methods.
Data export options for analysis in external tools (e.g., CSV export).
White Box Testing
Refer to WhiteBoxTesting.java for test cases and validation of program functionalities. This file demonstrates the robustness of the program's error handling and polymorphism capabilities.

Contributing
Feel free to contribute to this project by submitting pull requests or reporting issues. Your feedback and contributions are welcome to help improve this program further.

License
This project is open-source and available under [license name]. For more details, see the LICENSE file.

Contact
For any inquiries or contributions, please contact [Your Name] at [Your Email].
