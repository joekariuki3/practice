numbers = []

def fill_list(lg):
    if lg > 0:
        i = 0
        while i < lg:
            print(f"At the top i is {i}")
            numbers.append(i)
            
            i = i + 1
            
            print("Numbers now: ", numbers)
            print(f"At the bottom i is {i}")
    else:
        print("Please enter a length more than 0")

length = input("Enter size of list you want:> ")
# check if input is number
if length.isdigit():
    length = int(length)
    fill_list(length)
else:
    length = input("Enter size of list you want (Number):> ")
    
print("The numbers: ")

for num in numbers:
    print(num)
