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