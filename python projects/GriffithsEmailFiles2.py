#Mark Griffiths
#Date: 11/10/2019
#CSC121
#File Python Dictionaries and file writing



import mbox	
def writeMboxReport(mydict):
	str1 = "";
	for day,count in mydict.items():
		str1 = str1 + day + " " + str(count) + "\n";
	emailinfo = str1;
	fhand = open('report.txt', 'w');
	fhand.write(emailinfo)
	fhand.close();	
	
def main():
	days = {};
	fname = input('Enter the name of the file: ');
	try:
		fhand = open(fname);
	except:
		print('File cannot be opened:', fname);
		quit();
	for line in fhand:
		clean_line = line.rstrip();
		if clean_line.startswith('From '):	
			day = mbox.get_mbox_day(clean_line);
			days[day] = days.get(day, 0) + 1;
	for key in days:
		print(key, days[key]);		
	writeMboxReport(days);
	
main();