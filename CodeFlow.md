* We will follow the MVC pattern. All the classes in the class diagram will belong to the Model.
* The user will talk to the app through the "Controller". There will be a method in the controller and there will
  be a corresponding method in the "Service" which will handle the request from the Controller.
* The service might need to talk to the database. It will talk to the database through the Repository.

* The name of the controllers is decided by the Model on which they are depending on. If a user comes in a parking lot,
  we will call a createTicket() method. This method will come under the Ticket controller class.




STEPS
1. Code the Models.
2. In controllers, we use DTO for inputs and outputs.

* In most of the tables we create, it will have some of the attributes common. For e.g. id, created by, created on etc.
  To stop duplicate code, we create a base model class with those common attributes.

* The first trivial step is to create all the Classes extending the BaseModel class following the Class Diagrams we made.
* When a car enters the parking lot, the goal is to generate a parking ticket.

WORKING ON issueTicket()
* The client will call the issueTicket() and he will be talking to the Controller. Since, this is making changes to the
  Ticket model, it will be in the TicketController. 
* But the actual logic to generate the ticket won't be present in the controller. It would be in the TicketService.
* For the fn we would need some inputs. A good practice is to allow a DTO and to return a DTO. First we will create
  a IssueTicketRequestDTO object. This will have all the attributes needed to issue a ticket. 
* DTOs are not meant to be used at the service layer.
* This is the method for issuing a ticket. We then decide on which inputs are needed to create a ticket. We need entryTime, 
  Vehicle, Gate and Operator. Every other attribute of ticket is not decided by us.
* A good practice is to not take the inputs from the user directly. We will create a DTO for that. Generally, for
  every API, we will have a DTO.
* Then we will move to the TicketService folder which will have the main logic of the issueTicket() method.
* For every model we will have its own repository.
* The client will call the issueTicket() method with the DTO and then the request will go to the Controller. From there the req
  goes to the ticket service.
* The ticket service is responsible for generating a ticket with the help of the data that is passed to it using the DTO.
* Since DTOs only contain minimal overheads like id etc., we need to retrieve the information through the repository from the
  database. 
* Here we are using the Optional<Vehicle>/<Gate> in case there is no data present in the DB for those id.
* For the vehicle, if the optional is empty then we save the vehicle to the DB(if it were present).
* After this checking and inserting it to the DB, we will have the Vehicle object we need.
  * Set it to the ticket object.

                                                          SETTING THE PARKING SPOT.
* Depending on the conditions, we will need different methods to calculate the parking spot.
* We will use the STRATEGY DESIGN PATTERN for this.


