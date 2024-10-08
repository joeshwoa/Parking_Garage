<img src="https://skillicons.dev/icons?i=java" />
<br>

# Parking Garage application Project

Our Project for the Introduction to Software Engineering course taken during fall 2022 semester.</br>
We Applied the <b>Object-Oriented</b> concepts (Abstraction, polymorphism, 
interfaces, packaging, …) and utilized <b>Boundary, control and entity</b> concepts as well as <b>SOLID 
Principles</b> and <b>Design patterns</b> to design the application using <b>JAVA</b> programming language.

<h2>Description: </h2>
A Parking Garage application that manages a parking space for a 
configurable maximum number of vehicles. </br>
Each parking space (slot) defined with a 
dimension (width and depth) </br></br>
The application handles the following functions:</br>
• Each vehicle is identified by a model name, unique identification number, Model 
year and vehicle dimensions (vehicle width and depth).</br>
• Park-in function that marks the arrival time of a vehicle if there is an available slot. The 
application shall capture such time automatically from the system.</br>
• During the park-in function the application picks a free slot based on the active slot 
configuration. </br>
There are two configurations : </br>
(i) first come first served slots i.e., the park-in 
function will use the first free slot available from the parking garage slots. </br>
(ii) best-fit approach where you need to find the slot with the minimum dimension to hold the vehicle.</br>
• Park-out function that marks the departure time of a vehicle from the garage. The 
application shall capture such time automatically from the system.</br>
• Calculate the parking fees during the park-out based on the time-of-stay with an hourly 
rate of 5 EGP.</br>
• Calculate the total income as well as the total number of vehicles that used the parking 
garage at any given point in time.</br>
• Display the available parking slots</br></br>
There is two modes for the application: </br>
1- <b>Driver mode</b> that can: </br>
• Park in</br>
• Park Out</br></br>

2- <b>Manager mode</b> that can: </br>
• Set slots</br>
• Display available Slots</br>
• Show Total number of vehicles (From the beginning of the execution)</br>
• Show Income</br></br>

<h2>Project Steps:</h2>
<h3>First: </h3>
We created the Use Case Diagram, the Class Diagram and the Sequence Diagarams (using Umlet extention in vs code)
<h3>Second: </h3>
We implemented the code of the system using JAVA 

<h2>Screenshots: </h2>

Choose the mode (Driver or Manager)

![image](https://user-images.githubusercontent.com/74511706/171746086-e613df69-bb87-409a-a677-14d3ed8efc91.png)

Driver mode:

![image](https://user-images.githubusercontent.com/74511706/171745335-f37549d8-4d4e-40fa-89a4-a46b165042c6.png)

Manager mode:

![image](https://user-images.githubusercontent.com/74511706/171745452-9438584e-a492-4fb2-8a96-859f640c7608.png)

