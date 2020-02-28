#Mark Griffiths
#Date: 11/5/2019
#CSC121
#File Reading and Writing
#Parses number of emails on given days of the week and writes to txt file


import mbox


	
def get_mbox_day(line):
	
	if 'Sun' in line:
		return 'Sun';
	elif 'Mon' in line:
		return 'Mon';
	elif 'Tue' in line:
		return 'Tue';
	elif 'Wed' in line:
		return 'Wed';
	elif 'Thu' in line:
		return 'Thu';
	elif 'Fri' in line:
		return 'Fri';
	elif 'Sat' in line:
		return 'Sat';
		




def main():
	
	sun = 0;
	mon = 0;
	tue = 0;
	wed = 0;
	thu = 0;
	fri = 0;
	sat = 0;
	total = 0;
	
	fname = input('Enter the name of the file: ');
	try:
		fhand = open(fname);
	except:
		print('File cannot be opened:', fname);
		quit();
	for line in fhand:
		if line.startswith('From '):
			total += 1;
			if get_mbox_day(line) == 'Sun':
				sun += 1;
			if get_mbox_day(line) == 'Mon':
				mon += 1;
			if get_mbox_day(line) == 'Tue':
				tue +=1;
			if get_mbox_day(line) == 'Wed':
				wed += 1;
			if get_mbox_day(line) == 'Thu':
				thu += 1;
			if get_mbox_day(line) == 'Fri':
				fri += 1;
			if get_mbox_day(line) == 'Sat':
				sat += 1;
	fhand.close();
	fhand = open('report.txt', 'w');
	emailinfo = 'Sunday Emails:' + str(sun) + '\nMonday Emails:' + str(mon) + '\nTuesday Emails:' + str(tue) + '\nWednesday Emails:' + str(wed) + '\nThursday Emails:' + str(thu) + '\nFriday Emails:' + str(fri) +	'\nSaturday Emails:' + str(sat) + '\nTotal Emails:' + str(total);
	fhand.write(emailinfo);
	fhand.close();
	
main();