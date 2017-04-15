CHANGING MULTIPLE SAME STRING WITH NEW SAME STRING

Edit ->Find->Replace
 popup
	->lugurian
	->Olive.LIGURIAN
	
	click replace All
	
	
	USINg ENUM
	
	to jump onto the enum -> ctrl+click then name of the enum
	
	USING ABSTRACT
	USING FileReader
	''    BufferedReader 
	''    FileWriter
	
	
	example
	
	
	String sourceFile = "files/renzdocument.txt"
	String targetFile = "files/target.txt"
	
	
	try{
		FileReader fR = new FileReader(sourceFile);
		BufferedReader bR = new BufferedReader(fR);
		FileWriter fW = new FileWriter(targetFile);
		
	}while(true){
		String line  =  bR.readLine();
		if(line == null){
			break;
		}else{
			fW.write(line + "\n");
		}
	}catch(Exeption e){
		e.printStackTrace();
		
	}
	
	
	Using Path
	Using FileUtils
	FileUtils.copyFile(soureFile,TargetFile);
	
	Using URL
	
	Creating a jar file 
	file -> project structures -> artifacts -> + choose jars-> form modules with dependencies ->ok
	
	menu->build->buld artifacts
	
	Building web services with javaee
	Developing Android Apps  Essential Training
	Android Studio Essential Training
	Building a Note-Taking App for Android
	Android SDK: Local Data Storage
	Building Mobile Apps  with Google Maps Android API v2