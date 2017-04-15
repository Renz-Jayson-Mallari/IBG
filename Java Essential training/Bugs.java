Bugs

F2 -> to jump on the next error.

ON DEBUG MODE
-setup a breakpoint then run debug
right-click to the variable and add to watches

ADDING EXPRESION TO THE BREAK POINT
-- right click then type then right the expressions to the popup

IDE -- Integrated Developement Environments

HANDLING EXEPTIONS WITH TRY/CATCH

	//wrap the line of code 
	char lastChar  = char[char.length];
	System.out.println(lastChar);
	
	//generate the right code automatically
	wrap the code above ->code ->surround with ->6. try/catch
	
	try{
		char lastChar  = char[char.length];
		System.out.println(lastChar);
	}catch (Exception e){ // Exception is datatype and e is the variable name
		//e.printStackTrace();
		//customize the error message
		System.out.println("Array Index Problem");
	}
	
	// comment using ctrl + /
	
	
// MULTIPLE ERRORS WITH MULTIPLE CATCH BLOCK

try{
		char lastChar  = char[char.length];
		System.out.println(lastChar);
		String sub  = welcome.substring(10);
	}catch (Exception e){ // Exception is datatype and e is the variable name
		//e.printStackTrace();
		//customize the error message
		System.out.println("Array Index Problem");
	}catch (ArrayIndexOutOfBoundsException e){ // copy and paste the error
		System.out.println("Array Index Problem 02");
	}
	
	
//	USING THROW METHOD

try{
	
	if (char.length <  10 ){
		
		throw(new Exception("My custom Message");
	}
		char lastChar  = char[char.length];
		System.out.println(lastChar);
		String sub  = welcome.substring(10);
	}catch (Exception e){ // Exception is datatype and e is the variable name
		//e.printStackTrace();
		//customize the error message
		System.out.println("Array Index Problem");
	}catch (ArrayIndexOutOfBoundsException e){ // copy and paste the error
		System.out.println("Array Index Problem 02");
	}catch (Exception e){ // throw method exeptions
		System.out.println(e.getMessage());
	}
	
	
	
	
		
		
		
		