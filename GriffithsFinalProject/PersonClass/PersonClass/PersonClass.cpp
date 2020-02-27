//PersonMain.cpp
//October 13, 2015


#include "Person.h"
#include "Professor.h"
#include<string>

int main()
{
	Person person1;

	Professor prof1;

	std::cout << "\nperson1 info:\n";

	person1.Display();

	std::cout << "\nprof1 info:\n";
	prof1.Display();

	prof1.SetName("George Cooke");

	std::cout << "\nprof1 info:\n";
	prof1.Display();
	return 0;
}
