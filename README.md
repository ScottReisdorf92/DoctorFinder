# Doctor Finder

## Description

The Doctor Finder is an application for doctors to post available times for appointments and patients to search by doctor specialty to find this availability and book appointments. This application allows both new patients and new doctors to sign up, login and have access to their own personal dashboard, which contains a calendar of appointments or availability times. The doctor dashboard allows doctors to see their current availability and appointments for the week and be able to add more times they are available. They can also delete availability so long as an appointment has not already been booked. The patient dashboard allows patients to see their current appointments and to book new appointments. Overall the Doctor Finder is designed to help doctors fill their schedule and for patients to get appointments at their earliest convenience.

## Technologies Used
* Java
* PostgreSQL
* Spring Boot
* Spring Data
* Spring MVC
* Spring ORM
* Hibernate
* Javascript
* HTML/CSS
* Bootstrap

## Features
* A new user may register to use the app as a patient
* Patients and Doctors may login to their account
* Patients may see their currently scheduled appointments
* Patients may schedule new appointments by viewing doctor's availabilities by specialty
* Patients may cancel appointments they have scheduled
* Doctors may view their schedule, including availabilities and appointments
* Doctors may create new availabilities to fill their schedule as they see fit
* Doctors may cancel availabilities they have created that have not been scheduled for an appointment yet.

To-Do Features
* Clean up the UI design
* Create a more succinct login page
* Print more information to the patients about their appointments
* Create and insurance compatability for patients insurance and insurances accepted by doctors

## Getting Started
* git clone https://github.com/ScottReisdorf92/DoctorFinder.git
* Set up a database through whichever is your hosting go-to, I used AWS with PostgreSQL
* make sure all the dependencies are in the pom.xml
* Run the applications backend. I used Spring Tool Suite to run the application which includes Tomcat server

## Usage
* Navigate to the login page through its file path on your computer. It should be in the DoctorFinderFrontEnd folder of the downloaded project
* Login as a patient that exists or create a new patient or login as an existing doctor in the system
* If you logged in as a patient, view your schedule, book appointments, and cancel appointments
* If you logged in as a doctor, view your schedule, create availabilities for patients to schedule appointments with, cancel any availabilities not yet scheduled for an appointment

## Contributors
Azhar Khalil
Scott Reisdorf
Steven Kanode
Sydney Preston

## License
MIT License

Copyright (c) [2019] [Sydney Preston]

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
