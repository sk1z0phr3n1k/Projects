#include<iostream>
//using namespace std;

void displayArray(int array[], int size)
{
	for (int i = 0; i < size; i++)
		std::cout << array[i] << " ";
	std::cout << std::endl;

}

void bubbleSort(int array[], int size)
{
	bool swap;
	int temp;
	int pass = 0;
	do
	{
		swap = false;
		for (int count = 0; count < (size - 1); count++)
		{
			if (array[count] > array[count + 1])
			{
				temp = array[count];
				array[count] = array[count + 1];
				array[count + 1] = temp;
				swap = true;
			}
		}
		pass++;
		//display array after each pass thorugh loop
		std::cout << "After pass " << pass << ": ";
		displayArray(array, size);
	} while (swap == true);
}
const int SIZE = 6;
int main()
{
	//declare an array of integers
	int nums[SIZE] = { 1,5,3,6,2,12 };

	std::cout << "Values in array: ";
	for (int i = 0; i < SIZE; i++)
		std::cout << nums[i] << " ";

	std::cout << std::endl;

	//perform bubble sort
	bubbleSort(nums, SIZE);


	return 0;
}
