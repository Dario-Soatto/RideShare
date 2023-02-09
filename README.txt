Program Description:
The RideShare project simulates a 31-mile length of road with stations located at each mile (32 stations in total).
A certain number of cars and passengers with random starting locations and destinations are generated.
If a traveling car at a given station has at least one of its three seats available, then it picks up passengers who need to move in the same direction.
The car moves and if a passenger reaches its destination, it is dropped off.
The car continues to travel until the car reaches its destination, at which point it ejects all remaining passengers.
Drivers of the car earn $1 for each mile that they take a passenger.

The Results:
After completing the RideShare project, we simulated the 31-mile length of road with the following configurations:
    A: 50 passengers and 20 cars
    B: 30 passengers and 10 cars

For each of the scenarios, we calculated the average revenue per driver and ran 100,000 trials with the following outcomes:
    A: $16.521645 per driver
    B: $14.902878999999999 per driver

Based on these results, we can conclude that configuration A results in marginally higher revenue per driver.

Key Components and Challenges:
The method to move the cars posed the most significant challenge: in tracking the direction and destination of each passenger and car,
the position of each car, and the capacity of each car while attempting to move cars in two directions, we faced countless errors.
However, we managed to work through these difficulties and successfully complete the move method.
In particular, we split the move method into two different for loops, one that iterated up the stations to move the cars backward
and another that iterated down the stations to move the cars forward, in order to avoid moving a car multiple times at once.
This modification greatly facilitated the workings of the code, and we are proud of how we managed to innovate in this fashion
to create a working method.

More broadly, we are proud of how we were able to break down the complex project into multiple smaller classes
that interact with each other. By compartmentalizing the project into smaller chunks and tying them together at the end,
we made the seemingly daunting project more manageable and created an intuitive program.
