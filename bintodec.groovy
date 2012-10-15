String binary="100110"
int decimal=0

for(int i=0;i<binary.length();i++)
{
	int position=binary.length()-i-1

	if(binary.charAt(position)=='1')
	{
		decimal+=Math.pow(2,i)
	}
}

println "binary: " + binary
println "decimal: " + decimal
