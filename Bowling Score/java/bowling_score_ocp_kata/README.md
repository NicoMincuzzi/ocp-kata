#1° Step
- write a first failing test in which zero pins are knocked down to each roll
- then write a factory `BowlingGameFactory` that returns an object `BowlingGame`
- the test pass by changing the factory (a new object `BowlingGame` is initialized) and nothing else

#2° Step
- write the second test in which one pin is knocked down to each roll
- The simplest code that makes both tests pass would be to change `BowlingGame` to accumulate rolls in a variable; :warning **our rules stop us from doing that** :warning
- we must find a way to implement the new functionality with a new object. I can think to delegate to another object the accumulation of rolls. I will call this role `Rolls`.
- In order to pass the second test, all I have to do is provide a real implementation of `Rolls` and change the factory.

#3° Step
- Add `Frame` class in order to calculate the score for each frame of the game

#4° Step
- Write the third test in which we have an only spare
- I have thought to delegate to another object for calculating of spare. I will call it `Spare`.

#5° Step
- Write the forth test in which we have the spare in the last roll
- I have thought to modify behaviour of the calculate method in `Spare` class.

#6° Step
- Write the fifth test in which we have a strike
- I have thought to delegate to another object for calculating of strike. I will call it `Strike`.

#6° Step
- Write the sixth test in which we have the strike in the last roll
- I have thought to modify behaviour of the calculate method in `Strike` class.
- Add more test cases to verify the different behaviours


#6° Step
- Use interface `Point` which is implemented by `Spare` and `Strike`
- Add `NormalPoint` class in order to handle the normal rolls in a frame
- Modify the behaviour of `calculateScore()` in Frame, which takes in input a list of `Point`
