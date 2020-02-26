#Mark Griffiths
#Date: 10/30/2019
#CSC121
#File Reading and Writing



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
	fhand = open('mbox.txt');
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
	
	print('Sunday Emails:', sun);
	print('Monday Emails:',  mon);
	print('Tuesday Emails:', tue);
	print('Wednesday Emails:', wed);
	print('Thursday Emails:', thu);
	print('Friday Emails:', fri);
	print('Saturday Emails:', sat);
	print('Total Emails:', total);
	
main();