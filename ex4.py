#number of cars
cars = 100
#Available space in a car
space_in_a_car = 4.0
#Available drivers
drivers = 30
#All passangers
passangers = 90
#Cars with out drivers
cars_not_driven = cars - drivers
#Cars with drivers
cars_driven = drivers
#Capacity of all the cars
carpool_capacity = cars_driven * space_in_a_car
#Number of  people in each car
average_passangers_per_car = passangers / cars_driven


print("There are", cars, "cars available.")
print("There are only", drivers, "drivers available.")
print("There will be", cars_not_driven, "empty cars today.")
print("We can transport", carpool_capacity,"people today.")
print("We have", passangers, "to carpool today.")
print("We need to put about", average_passangers_per_car, "in each car.")
