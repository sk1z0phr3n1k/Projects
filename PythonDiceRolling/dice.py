#Mark Griffiths
#Johan Vargas

import random;
class dice():
	def __init__(self, sides):
		self.sides = sides;
	
	def rollDice(self):
		roll = random.randint(1, self.sides);
		return roll;
		

class multiDice():
	def __init__(self, sides, numDice):
		self.sides = sides;
		self.numDice = numDice;
	
		
		self.diceList = list();  
		for i in range(numDice):
			myDice = dice(sides);
			self.diceList.append(myDice);
		
	def rollDice(self):
		total = 0;
		for i in range(self.numDice):
			roll = random.randint(1, self.sides);
			print(roll);
			
			total += roll;
		return total;


	
	
def main():
	count = 0;
	dieRoll = 0;
	die1 = dice(6);
	sides = int(input("How many sides?"));
	numRolls = int(input("How many times to roll the dice?: "));
	numDice = int(input("How many dice do you want to roll? "));
	
	myMultDice = multiDice(sides, numDice);
	print(myMultDice.rollDice());
	
	
	
	
	for i in range(1000):
		dieRoll = dice.rollDice(die1);
		count += dieRoll;
		print("Roll Number: " + str(i) + "\nDie Roll: " + str(dieRoll) + " \nTotal of Die Rolls: " +  str(count) + "\n======================");
	
	for i in range(numRolls):
		dieRoll = dice.rollDice(die1);
		count += dieRoll;
		print("Roll Number: " + str(i) + "\nDie Roll: " + str(dieRoll) + " \nTotal of Die Rolls: " +  str(count) + "\n======================");
		
		
	die1 = multiDice(sides, 2);
	for i in range(1000):
		dieRoll = multiDice.rollDice(die1);
		count += dieRoll;
		print("Roll Number: " + str(i) + "\nDie Roll: " + str(dieRoll) + " \nTotal of Die Rolls: " +  str(count) + "\n======================");
	
	
main();