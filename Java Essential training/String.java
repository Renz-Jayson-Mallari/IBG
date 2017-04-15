What to watch first:
	1. java essesntial training
	2. java advanced training
	3. xml essential training
	4. xml integration with java
	

Java esential training 

DOCUMENTATION -- http://docs.oracle.com/javase/8/docs
DOWNLOAD DOCUMENTATION -- http://www.oracle.com/technetwork/javase/downloads/index.html

welcome->configuration->project defaults->project structure-> SDK->documentation path ->+ url +paste(C:\Users\My__Boo\Downloads\PREPforDialysisTechnician)
click the name of the class (ex String) the press shift+F1

ctrl d -- duplicate a line
shift + alt up and down -- drag the item
place on top of the class and press shift+f1 for documentation
hover and ctrl+j for documentation

STRING TO CHAR

String welcome = "Welcome";
char[] char  = welcome.toCharArray();

LONG VALUE TO STRING

long longValue = 10_000_000;
// NumberFormat gaves a comma a separator , only because it is a US locale
NumberFormat formatter = NumberFormat.getNumberInstance();
String formatted = formatter.format(longValue);
System.out.println(formatted);


STRING BUILDER

StringBuilder sb  = new StringBuilder("hello");
sb.append("world");
sb.append("!");
System.out.println(sb);

OR

StringBuilder sb  = new StringBuilder("hello")
.append("world")
.append("!");
System.out.println(sb);

SCANNER

Scanner scanner = new Scanner(System.in);
System.out.println("enter a value);
String input = scanner.nextLine();
System.out.println(input);


DELETING

sb.delete(0, sb.length());// 0 is the starting point, lenght how many character do you want to delete.


COMPARING STRINGS

if(srt1.equals(str2)){
System.out.println("they match");
}

//ignore caps letter
if(srt1.equalsIgnoreCase(str2)){
System.out.println("they match");

}

SETING UP LOCALE
// da is the language and DK is the country this will change the underscore to period instead of comma.
Locale locale =  new Locale("da", "DK");

double doubleValue = 1_456_789.99

NumberFormat numF = NumberFormat.getNumberInstance();
System.out.println(numF.format(doubleValue));


PARSING STRING

String s1 = "Welcome to California"

// 22
s1.length 

//11
s1.indexOf("California");

//California
s1.substring(11);

USING TRIM TO REMOVE WHITE SPACE

String s1 = "Welcome              !"

//17
s1.length

//trim the white space
s1.trim();

//8
s1.length

api documentation f1


DATES

	// wed june 10 12:10:21  pdt 2015
	Date date = new Date();
	System.out.println(date);
	
	GregorianCalendar gc = new GregorianCalendar(2009,1,28);
	// add 1 on the date 
	gc.add(GregorianCalendar.DATE, 1);
	
	//Sun mar 01 00:00:00 pst 2009
	Date date2 = gc.getTime();
	System.out.println(date);
	
	///format to Sunday, March 1, 2009
	DateFormat df  =  new DateFormat.getDateInstance(DateFormat.FULL);
	sop(df.format(d2));
	
	//Unix time stamp for today date
	LocaleDateTime ldt = LocaleDateTime.now();
	sop (ldt);
	
	//2009-01-28
	LocaleDate ld = LocaleDate.of(2009,1,28);
	sop(ld)
	
	//1/28/2009
	DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("M/d/yyyy");
	sop(dtf.format(ld));


