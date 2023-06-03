from sys import argv
from os.path import exists

script, src, dest = argv

print(f"copying from {src} to {dest}")
#open src file and read data since open happens default with read mode
srcFile = open(src)

#read data from src file
srcData = srcFile.read()

#check size of the src data
srcSize = len(srcData)

print(f"{src} contains {srcSize} bytes of data")

#open dest file with write+ (write and read) mode
destFile = open(dest,'w+')

print(f"Removing any data in {dest}")
#remove anydata in dest file
destFile.truncate()

print(f"coping ..")
#write srcData to destFile
destFile.write(srcData)

#close destFile after copying
destFile.close()

#open destFile again to read its data
destFile = open(dest, 'r')

#read dest file
destData = destFile.read()
#check size of data in destfile
destSize = len(destData)

if srcSize == destSize :
	print(f"Data copied sucessfull: {src} has {srcSize} bytes -> {dest} has {destSize} bytes ")
else:
	print("Coping failed")

#close the two files
srcFile.close()
destFile.close()
