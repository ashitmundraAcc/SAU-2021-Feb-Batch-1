function Pattern_check(k){
	pattern_a = new RegExp("^lion");
	pattern_b = new RegExp("cat$");
	pattern_c = new RegExp("ab+c");
	var ln= k.length;
	
	if(pattern_a.exec(k)){
		console.log("Condition met with index 0");
	}
	
	else if(pattern_b.exec(k)){
		console.log("Condition met with index "+(ln-3));
	}
	
	else if(pattern_c.exec(k)){
		loc=pattern_c.exec(k).index;
		console.log("Condition met with index "+ loc);
	}

	else{
		console.log("condition not met");
	}
}




Pattern_check("lion roars");
Pattern_check("There is a black cat");
Pattern_check("Its just abc of this subject");
Pattern_check("the lion is abc of cat family");
Pattern_check("lion belongs to family cat");
Pattern_check("bye bye");


