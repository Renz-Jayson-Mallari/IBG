MANAGING PROGRAM FLOW

//IF STATEMENT

//SWITCH



	switch (monthNumber){
		case 1:
			Syste.out.println("the month is january");
			break;
		case 2:
			Syste.out.println("the month is feb");
			break;
		case 3:
			Syste.out.println("the month is march");
			break;
		default
			Syste.out.println("you chose another month");
	}
	
	//USING STRINGS
		switch (monthNumber){
		case "jan":
			Syste.out.println("the month is january");
			break;
		case "feb":
			Syste.out.println("the month is feb");
			break;
		case "mar":
			Syste.out.println("the month is march");
			break;
		default
			Syste.out.println("you chose another month");
	}
	
	// MAKE A INCREMENTING LOOP
	type for i + enter
	
	// method with uncounted parametes
	
	static double addVlaues(String ... values){
		for(String value : values){
			// parse the vale to double
			double d =  Double.parseDouble(value);
			result+= d;
		}
		return result;
	}