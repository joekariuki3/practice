people = 30
cars = 40
trucks = 15

if cars > people:# checks if cars are more than people 
    print("We should take the cars.")
elif cars < people:# checks if cars are less than the people
    print("We should not take the cars.")
else:# if none of the above is true this will be executed
    print("We can't decide.")

if trucks > cars:# checks if trucks are more than the cars
    print("That's too many trucks.")
elif trucks < cars:# checks if trucks are less than the cars
    print("Maybe we could take the trucks.")
else:# if none of the above is true then this will execute
    print("We still can't decide.")

if people > trucks:# checks if people are more than the trucks
    print("Alright, let's just take the trucks.")
else:# if the above is false this will execute 
    print("Fine, let's stay home then.")
