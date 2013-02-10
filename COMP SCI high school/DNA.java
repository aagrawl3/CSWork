public class DNA
{
  private String DNAstrand;
  private int strandLength;
  private String[] DNAcodon;
  private String[] mRNAstrand;
  private String[] protein;
  
  
public DNAtranslator(String inpStrand)	//DNAtranslator Constructor
{
  DNAstrand = DNAtranslator.spaceRemover(inpStrand.toUpperCase());
  strandLength = DNAstrand.length();
  DNAcodon = this.toDNAcodon();
  mRNAstrand = this.transcription();
  protein = this.translation();
}


public DNAtranslator(DNAtranslator A)	//Copy Constructor
{
  strandLength = A.getLength();
  DNAstrand = A.getStrand();
  DNAcodon = A.getDNAcodon();
  mRNAstrand = A.getmRNAstrand();
  protein = A.getProtein();
}

  
public String getStrand()	//getStrand functiion: returns the String of DNA
{
  return DNAstrand;
}


public int getLength()	//getLength function: returns the length of the String of DNA
{
  return strandLength;
}


public String[] getDNAcodon()	//getDNAcodon function: returns DNAcodon
{
  return DNAcodon;
}

public String[] getmRNAstrand()	//getmRNAstrand function: returns mRNAstrand
{
  return mRNAstrand;
}


public String[] getProtein()	//getProtein function: returns protein
{
  return protein;
}

public void printDNAcodon()	//printProtein function: prints out DNAcodon
{
  for(int i=0; i<6; i++)
   {
    if(DNAcodon[i].length() > 3){
    System.out.print("\nDNA Strand "+(i+1)+": "+DNAcodon[i].substring(0,3));
    for(int k=3; k<DNAcodon[i].length(); k+=3)
     {
     System.out.print(" - "+DNAcodon[i].substring(k,k+3));
 	 }
    }
	else if(DNAcodon[i].length()==3) {System.out.print("\nDNA Strand "+(i+1)+": "+DNAcodon[i]);}
	else {System.out.print("\nDNA Strand "+(i+1)+": None");}
   }
  System.out.println();
}


public void printmRNAstrand()	//printProtein function: prints out mRNAstrand
{
  for(int i=0; i<6; i++)
   {
    if(mRNAstrand[i].length() > 3){
    System.out.print("\nmRNA Strand "+(i+1)+": "+mRNAstrand[i].substring(0,3));
    for(int k=3; k<mRNAstrand[i].length(); k+=3)
     {
     System.out.print(" - "+mRNAstrand[i].substring(k,k+3));
 	 }
    }
	else if(mRNAstrand[i].length()==3) {System.out.print("\nmRNA Strand "+(i+1)+": "+mRNAstrand[i]);}
	else {System.out.print("\nmRNA Strand "+(i+1)+": None");}
   }
  System.out.println();
}


public void printProtein()	//printProtein function: prints out protein
{
  for(int i=0; i<6; i++)
   {
   if(protein[i].length()>3)
    {
    System.out.print("\nProtein Strand "+(i+1)+": "+protein[i].substring(0,3));
    for(int k=3; k<protein[i].length(); k+=3)
     {
     System.out.print(" - "+protein[i].substring(k,k+3));
	 }
    }
   else if(protein[i].length()==3) {System.out.print("\nProtein Strand "+(i+1)+": "+protein[i]);}
   else {System.out.print("\nProtein Strand "+(i+1)+": None");}
   }
  System.out.println();
}


public void printAll()	//printAll function: runs all print functions
{
  this.printDNAcodon();
  this.printmRNAstrand();
  this.printProtein();
}
 
public String toString()	//toString function
{
  String retStr = "";
  retStr = DNAcodon[0].substring(0,3);
   for(int k=3; k<DNAcodon[0].length(); k+=3)
    {
    retStr += " - "+DNAcodon[0].substring(k,k+3);
	}
  return retStr;
}


public String[] toDNAcodon()	//toDNAcodon: breaks the DNA String into 6 possibilities for reading
{
  if(strandLength>=5){
  String[] retStr = new String[6];
  int count = strandLength-2;
  for(int k=0; k<3; k++)
  {
   String store = "";
   for(int i=k; i<count; i+=3)
   {
    store += DNAstrand.substring(i,i+3);	//can add space
   }
   retStr[k] = store;
  }

  String revStr = DNAtranslator.reverse(DNAstrand);
  for(int k=0; k<3; k++)
  {
   String store = "";
   for(int i=k; i<count; i+=3)
   {
    store += revStr.substring(i,i+3);	//can add space
   }
   retStr[k+3] = store;
  }
  return retStr;
  }
  
  else if(strandLength==4){
  String[] retStr = new String[] {"", "", "", "", "", ""};
  String revStr = DNAtranslator.reverse(DNAstrand);
  retStr[0] = DNAstrand.substring(0,3);
  retStr[1] = DNAstrand.substring(1,4);
  retStr[3] = revStr.substring(0,3);
  retStr[4] = revStr.substring(1,4);
  return retStr;
  }

  else if(strandLength==3){
  String[] retStr = new String[] {"", "", "", "", "", ""};
  String revStr = DNAtranslator.reverse(DNAstrand);
  retStr[0] = DNAstrand.substring(0,3);
  retStr[3] = revStr.substring(0,3);
  return retStr;
  }
  
  else{
  String[] retStr = new String[] {"", "", "", "", "", ""};
  System.out.println("Please enter a DNA sequence of length 3 or more");
  return retStr;
  }
}


public static String reverse(String A)	//reverse function: reverse DNA String to account for various ways that the DNA can be read
{
  int strlen = A.length();
  String strret="";   //empty string
  for(int i=strlen-1; i>=0; i--)
   {
   strret += A.substring(i,i+1);
   }
  return strret;
}


public static String spaceRemover(String A)	//spaceRemover function: removes spaces from user input of DNA sequence
{
  String retStr = "";
  for(int i=0; i<A.length(); i++)
   {
   char tester = A.charAt(i);
   if(tester!=' ')
    {retStr += tester;}
   }
  return retStr;
}


public String[] transcription()	//transcription function: converts DNA to mRNA
{
  String[] starter = new String[6];
  String[] retStr = new String[] {"", "", "", "", "", ""};
  starter = this.getDNAcodon();
  for(int i=0; i<6; i++)
   {
   for(int k=0; k<starter[i].length(); k++)
    {
	char tester = starter[i].charAt(k);
	if(tester=='A')
	 {retStr[i] += "U";}
	else if(tester=='T')
	 {retStr[i] += "A";}
	else if(tester=='C')
	 {retStr[i] += "G";}
	else if(tester=='G')
	 {retStr[i] += "C";}
	else
	 {
	 System.out.println("Please enter a valid DNA sequence");
	 break;
	 }
    }
   }
  return retStr;
}


public static String findAminoAcid(String A)	//findAminoAcid function: finds index of codon and uses that to determine and return the Amino Acid
{
  String[] codons = new String[] {"UUU", "UUC", "UUA", "UUG", "CUU", "CUC", "CUA", "CUG", "AUU", "AUC", "AUA", "AUG", "GUU", "GUC", "GUA", "GUG", "UCU", "UCC", "UCA", "UCG", "CCU", "CCC", "CCA", "CCG", "ACU", "ACC", "ACA", "ACG", "GCU", "GCC", "GCA", "GCG", "UAU", "UAC", "UAA", "UAG", "CAU", "CAC", "CAA", "CAG", "AAU", "AAC", "AAA", "AAG", "GAU", "GAC", "GAA", "GAG", "UGU", "UGC", "UGA", "UGG", "CGU", "CGC", "CGA", "CGG", "AGU", "AGC", "AGA", "AGG", "GGU", "GGC", "GGA", "GGG"};
  String[] proteins = new String[] {"Phe", "Leu", "Ile", "Met", "Val", "Ser", "Pro", "Thr", "Ala", "Tyr", "STOP", "His", "Gln", "Asn", "Lys", "Asp", "Glu", "Cys", "STOP", "Trp", "Arg", "Ser", "Arg", "Gly"};
  int index1 = 0;
  int index2 = 0;
  for(int i=0; i<64; i++)	//finds index
  {
   if(A.equals(codons[i]))
    {
    index1 = i+1;
	break;
	}
  }
  
  if(index1<=2) {index2 = 0;}	//finds corresponding Amino Acid
  else if(index1<=8) {index2 = 1;}
  else if(index1<=11) {index2 = 2;}
  else if(index1<=12) {index2 = 3;}
  else if(index1<=16) {index2 = 4;}
  else if(index1<=20) {index2 = 5;}
  else if(index1<=24) {index2 = 6;}
  else if(index1<=28) {index2 = 7;}
  else if(index1<=32) {index2 = 8;}
  else if(index1<=34) {index2 = 9;}
  else if(index1<=36) {index2 = 10;}
  else if(index1<=38) {index2 = 11;}
  else if(index1<=40) {index2 = 12;}
  else if(index1<=42) {index2 = 13;}
  else if(index1<=44) {index2 = 14;}
  else if(index1<=46) {index2 = 15;}
  else if(index1<=48) {index2 = 16;}
  else if(index1<=50) {index2 = 17;}
  else if(index1<=51) {index2 = 18;}
  else if(index1<=52) {index2 = 19;}
  else if(index1<=56) {index2 = 20;}
  else if(index1<=58) {index2 = 21;}
  else if(index1<=60) {index2 = 22;}
  else {index2 = 23;}
  return proteins[index2];
}


public String[] translation()	//translation function: converts mRNA to proteins
{
  String[] retStr = new String[] {"", "", "", "", "", ""};
  for(int i=0; i<6; i++)
   {
   for(int k=0; k<mRNAstrand[i].length(); k+=3)
    {
	String tester = mRNAstrand[i].substring(k,k+3);
	String tester2 = DNAtranslator.findAminoAcid(tester);
	if(tester2.equals("STOP"))
	 {break;}
	else
	 {retStr[i] += tester2;}
	}
   }
  return retStr;
}

}