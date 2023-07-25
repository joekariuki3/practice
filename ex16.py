#import argv module from system
from sys import argv

#save 1st n 2nd argument from argv to script n filename respectively
script, filename = argv

print(f"We're going to erase {filename}")
print("If you don't want that, hit CTR-C (^C)")
print("if you want that, hit RETURN")

input("?")

print("Opening the file...")
#open the file with write mode
target = open(filename, 'w')

print("Truncating the file. Goodbay!")
#remove all the contetnts of the opened file
target.truncate()

print("Now I'm going to ask you for three lines")

#get input from user n save to variables
line1 = input("Line 1: ")
line2 = input("Line 2: ")
line3 = input("Line 3: ")

print("I'm going to write these to the file")
#write the contents of the variables to the file
target.write(f"{line1}\n{line2}\n{line3}\n")

print("And finally, we close it")
#close the file
target.close()
