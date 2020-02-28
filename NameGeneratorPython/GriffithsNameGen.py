#Author: Mark Griffiths
#Course: CSC121
#Assignment: Name Generator
#Date: 11/13/2019

import random;
def loadFile(file):
	temp = [];
	openf = open(file);
	line = openf.readline();
	while(line != ''):
		newline = line.rstrip();
		temp.append(newline);
		line = openf.readline();
	openf.close();
	return temp;

def dumpFile(names, titles, descriptors):
	dungeonNameList = [];
	for i in range(10):
		firstName = names[random.randint(0, len(names)-1)];
		lastName = names[random.randint(0,len(names)-1)];
		title = titles[random.randint(0, len(titles)-1)];
		descriptor = descriptors[random.randint(0 ,len(descriptors)-1)];
		dungeonName =  title +  " "  + firstName + " " + lastName + " the " + descriptor;
		dungeonNameList.append(dungeonName);
	fhand = open('CharacterNames.txt', 'w');
	for i in dungeonNameList:
		fhand.write(i + "\n");
	fhand.close();
	print("Character names written to CharacterNames.txt");
	return dungeonNameList;
	

def main():
	names = list(loadFile("names.txt"));
	titles = list(loadFile("titles.txt"));
	descriptors = list(loadFile("descriptors.txt"));

	firstName = names[random.randint(0, len(names)-1)];
	lastName = names[random.randint(0, len(names)-1)];
	title = titles[random.randint(0, len(titles)-1)];
	descriptor = descriptors[random.randint(0 ,len(descriptors)-1)];
	
	print("\nYour Dungeons & Dragons Character Name IS:");
	print(title + " " + firstName + " " + lastName + " the " + descriptor);
	dumpFile(names, titles, descriptors)
	
main();

