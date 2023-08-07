SCHOOL ONLINE TEST SYSTEM -

Its main objectives are to centralize all exam-related activities, enhance efficiency, and improve the reliability of exam processing.
The system aims to achieve the following goals:
1) Create exams at two levels: (a) Manage a question bank for various subjects, and (b) Generate exams from the question bank.
2) Facilitate exam administration.
3) Conduct exam grading and record scores.
4) Data processing, analysis, and presentation, including generating various statistics on exams, scores, and student performance.

We utilized Java (OCSF server-clent framework, EVENTBUS), JavaFX GUI, SQL, and Git.

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
