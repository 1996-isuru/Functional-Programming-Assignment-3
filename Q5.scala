object Q5{
	def main(args:Array[String]){
		println("Enter a Number:");
		var n = scala.io.StdIn.readInt();
		var x = sumEven(n);
		println("SUM: "+x);
		
		
		

}
	def sumEven(a:Int):Int={
		if(a==1 || a==0){
		return 0;
}
		else{
		return a + sumEven(a-2);
	
}
	
}

}
