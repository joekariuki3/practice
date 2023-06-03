from sys import argv

script, filename = argv
print(f"Opening {filename} ... ")
target = open(filename, 'r')

print(f"Reading from {filename}")

message = target.read()

print(message)

print(f"Now closing {filename}")
target.close()


