#asign 4  placeholders to formatter variable
formatter = "{} {} {} {}"

#Asign int value to the placeholders n print them
print(formatter.format(1, 2, 3, 4))

#Assign strings to the placeholders n print them
print(formatter.format("one", "two", "three", "four"))

#Assign boolean to the placeholder and print them
print(formatter.format(True, False, False, True))

#Assign the placeholders to themselves and print them
print(formatter.format(formatter, formatter, formatter, formatter))

#Assign strings to the placeholder and print them
print(formatter.format(
"Try your",
"Own text here",
"Mybe a poem",
"Or a song about fear"
))
