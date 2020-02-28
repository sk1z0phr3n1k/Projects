#Mark Griffiths
#CSC 121
#10.16.2019
#Generate a list of random numbers and process it by ordering and looking through the list

import random;

def generate_random_numbers():
	randomList = list();
	for i in range(1, 21):
		randomList.append(random.randint(0,100));
	return randomList;


def show_list_statistics(list):
	print("Highest:", (max(list)));
	print("Lowest:", (min(list)));
	print("Sum:", sum(list));
	print("Average:",  (sum(list)/len(list)));
	
		
		
def main():
	randoms = generate_random_numbers();
	
	print(randoms);
	show_list_statistics(randoms);
	
main();