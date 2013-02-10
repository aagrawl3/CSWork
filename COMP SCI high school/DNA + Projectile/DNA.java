import java.util.*;

public class DNA 
{	
	public static void main(String[] Rs){
			
	Scanner console=new Scanner(System.in);
			
	System.out.println("Input the DNA Sequence: ");

	String DNA=console.nextLine();

	String DNAreverse=reverstr(DNA);

	System.out.println("The amino acid chain for the specified DNA strand:");
			
	int length= (DNA.length()-DNA.length()%3)/3;
			
	String [] DNAf1= new String [length];
			
	String [] Aminof1= new String [length];
			
	String [] DNAf2= new String [length];
			
	String [] Aminof2= new String [length];
			
	String [] DNAf3= new String [length];
			
	String [] Aminof3= new String [length];

	String [] DNAr1=new String [length];

	String [] Aminor1=new String [length];

	String[] DNAr2=new String [length];

	String[] Aminor2=new String [length];

	String[] DNAr3=new String [length];

	String[] Aminor3=new String [length];

			
	String[] dnaseg = new String[] {"TTT", "TTC", "TTA", "TTG", "CTT", "CTC", "CTA", "CTG", "ATT", "ATC", "ATA", "ATG", "GTT", "GTC", "GTA", "GTG", "TCT", "TCC", "TCA", "TCG", "CCT", "CCC", "CCA", "CCG", "ACT", "ACC", "ACA", "ACG", "GCT", "GCC", "GCA", "GCG", "TAT", "TAC", "TAA", "TAG", "CAT", "CAC", "CAA", "CAG", "AAT", "AAC", "AAA", "AAG", "GAT", "GAC", "GAA", "GAG", "TGT", "TGC", "TGA", "TGG", "CGT", "CGC", "CGA", "CGG", "AGT", "AGC", "AGA", "AGG", "GGT", "GGC", "GGA", "GGG"};

			
	String[] Amino = new String[] {"F", "F", "L", "L", "L", "L", "L", "L", "I", "I", "I", "M", "V", "V", "V", "V", "S", "S", "S", "S", "P", "P", "P", "P", "T", "T", "T", "T", "A", "A", "A", "A", "Y", "Y", "STOP", "STOP", "H", "H", "Q", "Q", "N",  "N", "K", "K", "D", "D", "E", "E", "C", "C", "STOP", "W", "R", "R", "R", "R", "S", "S", "R", "R", "G", "G", "G", "G"};

			
	for (int i=0; i<length; i++) {
			
	DNAf1[i] = DNA.substring(3*i, 3*i+3);
			
	}

			
	for (int i=0; i<length; i++){
				
	for (int j=0; j<64; j++) {
					
	if (DNAf1[i].equals(dnaseg[j])){
						
	Aminof1[i]=Amino[j];
					
	}
				
	}
			
	}
			
			
	for (int i=0; i<length; i++) 
	{			
	System.out.print(DNAf1[i]+" ");
	if (Aminof1[i].equals("STOP"))
	break;		
	}

			
	System.out.println("");
			
			
	for (int i=0; i<length; i++) 
	{
				
	System.out.print(Aminof1[i]+" ");
	if (Aminof1[i].equals("STOP"))
	break;		
	}

			
	System.out.println("");

			
	//if (DNA.length()%3 !=0) 
	//{
	String z=DNA.substring(1,DNA.length());			
	for (int i=0; i<(z.length()-z.length()%3)/3; i++) 
	{
				
	DNAf2[i] = z.substring(3*i, 3*i+3);
				
	}
				
	for (int i=0; i<(z.length()-z.length()%3)/3; i++){
					
	for (int j=0; j<64; j++) {
						
	if (DNAf2[i].equals(dnaseg[j])){
							
	Aminof2[i]=Amino[j];
						
	}
					
	}
				
	}
				
	for (int i=0; i<(z.length()-z.length()%3)/3; i++) 
	{
				
	System.out.print(DNAf2[i]+" ");
	if (Aminof2[i].equals("STOP"))
	break;
				
	}
				
	System.out.println("");
				
	for (int i=0; i<(z.length()-z.length()%3)/3; i++) {
				
	System.out.print(Aminof2[i]+" ");
	if (Aminof2[i].equals("STOP"))
	break;			
	}
				
	System.out.println("");
			
	//} 

			
	//if (DNA.length()%3 == 2) {
	String a=DNA.substring(2,DNA.length());			
	for (int i=0; i<(a.length()-a.length()%3)/3; i++) {
				
	DNAf3[i] = a.substring(3*i, 3*i+3);
				
	}
				
	for (int i=0; i<(a.length()-a.length()%3)/3; i++){
					
	for (int j=0; j<64; j++) {
						
	if (DNAf3[i].equals(dnaseg[j])){
							
	Aminof3[i]=Amino[j];
						
	}
					
	}
				
	}
				
	for (int i=0; i<(a.length()-a.length()%3)/3; i++) {
				
	System.out.print(DNAf3[i]+" ");
	if (Aminof3[i].equals("STOP"))
	break;
				
	}
				
	System.out.println("");
				
	for (int i=0; i<(a.length()-a.length()%3)/3; i++) {
				
	System.out.print(Aminof3[i]+" ");
	if (Aminof3[i].equals("STOP"))
	break;		 	
	}
				
	System.out.println("");
			
	//}
	//Reverse
	System.out.println(" ");
	System.out.println("The amino acid chain for the reverse DNA strand: ");
	for (int i=0; i<length; i++) {
			
	DNAr1[i] = DNAreverse.substring(3*i, 3*i+3);
			
	}

			
	for (int i=0; i<length; i++){
				
	for (int j=0; j<64; j++) {
					
	if (DNAr1[i].equals(dnaseg[j])){
						
	Aminor1[i]=Amino[j];
					
	}
				
	}
			
	}
			
			
	for (int i=0; i<length; i++) 
	{
				
	System.out.print(DNAr1[i]+" ");
	if (Aminor1[i].equals("STOP"))
	break;
	}

			
	System.out.println("");
			
			
	for (int i=0; i<length; i++) 
	{
				
	System.out.print(Aminor1[i]+" ");
	if (Aminor1[i].equals("STOP"))
	break;
			
	}

			
	System.out.println("");

			
	//if (DNAreverse.length()%3 !=0) 
	//{
	String b=DNAreverse.substring(1,DNAreverse.length());			
	for (int i=0; i<(b.length()-b.length()%3)/3; i++) 
	{
				
	DNAr2[i] = b.substring(3*i, 3*i+3);
				
	}
				
	for (int i=0; i<(b.length()-b.length()%3)/3; i++){
					
	for (int j=0; j<64; j++) {
						
	if (DNAr2[i].equals(dnaseg[j])){
							
	Aminor2[i]=Amino[j];
						
	}
					
	}
				
	}
				
	for (int i=0; i<(b.length()-b.length()%3)/3; i++) 
	{
				
	System.out.print(DNAr2[i]+" ");
	if (Aminor2[i].equals("STOP"))
	break;
				
	}
				
	System.out.println("");
				
	for (int i=0; i<(b.length()-b.length()%3)/3; i++) {
				
	System.out.print(Aminor2[i]+" ");
	if (Aminor2[i].equals("STOP"))
	break;		
	}
				
	System.out.println("");
			
	//} 

			
	//if (DNAreverse.length()%3 == 2) {
	String c=DNAreverse.substring(2,DNAreverse.length());
				
	for (int i=0; i<(c.length()-c.length()%3)/3; i++) {
				
	DNAr3[i] = c.substring(3*i, 3*i+3);
				
	}
				
	for (int i=0; i<(c.length()-c.length()%3)/3; i++){
					
	for (int j=0; j<64; j++) {
						
	if (DNAr3[i].equals(dnaseg[j])){
							
	Aminor3[i]=Amino[j];
						
	}
					
	}
				
	}
				
	for (int i=0; i<(c.length()-c.length()%3)/3; i++) {
				
	System.out.print(DNAr3[i]+" ");
	if (Aminor3[i].equals("STOP"))
	break;
				
	}
				
	System.out.println("");
				
	for (int i=0; i<(c.length()-c.length()%3)/3; i++) {
				
	System.out.print(Aminor3[i]+" ");
	if (Aminor3[i].equals("STOP"))
	break;
				
	}
				
	System.out.println("");
			
	}
		
	//}
	public static String reverstr(String somestring)
	{
	int strlen=somestring.length();
	String strret="";
	for (int i=strlen-1;i>=0;i--)
	{
	strret+=somestring.substring(i,i+1);}
	return(strret);
	}
}