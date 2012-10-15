String binary=""
int decimal=38
int temp=decimal

boolean stop=false

while(stop==false)
{
	int quotient=decimal/2
	int remainder=decimal%2
	
	if(quotient==0)
	{
		stop=true
	}
	else
	{
		decimal=quotient
	}
	
	binary=remainder+binary
}

println "binary: " + binary
println "decimal: " + temp