""" Get the argument module from sys """
from sys import argv

""" save argv[0] to script and argv[1] to input_file"""
script, input_file = argv

""" function that recieves an opened file then reads it"""
def print_all(f):
    print(f.read())

"""
function that revieves an opened file and move
the cursor to the start of the file with seek(0)
"""
def rewind(f):
    f.seek(0)

""" 
function that recieves a line number and an opened file
then reads the line and prints it out
"""
def print_a_line(line_count, f):
    print(line_count, f.readline())

""" file is opened and asigned to current_file"""
current_file = open(input_file)

print("First let's print the wholw file:\n")

print_all(current_file)

print("Now let's rewind, kind of like a tape.")

rewind(current_file)

print("Let's print three lines:")
""" print line 1"""
current_line = 1
print_a_line(current_line, current_file)

"""print line 2"""
current_line = current_line + 1
print_a_line(current_line, current_file)

"""print line 3"""
current_line = current_line + 1
print_a_line(current_line, current_file)
