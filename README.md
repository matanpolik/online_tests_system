SCHOOL ONLINE TEST SYSTEM -

As part of a team project in my Software Engineering course, I was actively
involved in developing an online High School Test System using a server-client architecture.
We utilized Java, JavaFX GUI, SQL, and Git.
Our team of 5 members was responsible for designing, implementing, and testing the system.
This experience enhanced my programming skills in Java and provided handson experience with server-client communication and data management using SQL.

<img width="583" alt="Screen Shot 2023-08-03 at 17 15 28" src="https://github.com/matanpolik/online_tests_system/assets/98277084/a5655487-2e90-473b-8000-d1cabd573590">

<img width="567" alt="Screen Shot 2023-08-03 at 17 16 03" src="https://github.com/matanpolik/online_tests_system/assets/98277084/94f6ccf1-c306-4a0b-9c14-245669e76c0b">

<img width="656" alt="Screen Shot 2023-08-03 at 17 16 27" src="https://github.com/matanpolik/online_tests_system/assets/98277084/3a7edaab-ed6a-449c-ba62-a14b1931d46f">





## Structure
Pay attention to the three modules:
1. **client** - a simple client built using JavaFX and OCSF. We use EventBus (which implements the mediator pattern) in order to pass events between classes (in this case: between SimpleClient and PrimaryController.
2. **server** - a simple server built using OCSF.
3. **entities** - a shared module where all the entities of the project live.

## Running
1. Run Maven install **in the parent project**.
2. Run the server using the exec:java goal in the server module.
3. Run the client using the javafx:run goal in the client module.
4. Press the button and see what happens!
