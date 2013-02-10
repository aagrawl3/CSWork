import java.util.*;
public class molecule
{
	private int numofatoms = 0;
	private String[] atomnames;
	private double[][] coordinates;
	private String moleculename;
	private double mass;
	private double[] atommass;
	
	public String[] atomicMassNames = new String[] 
	{
		"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si",
		"P", "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni",
		"Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb",
		"Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", 
		"Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho",
		"Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", 
		"Tl", "Pb", "Bi", "Po", "At","Rn", "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np",
		"Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg",
		"Bh", "Hs", "Mt", "Ds", "Rg", "Cn"
	};
		
	public double[] atomicMass = new double[]
	{
		1.0079, 4.0026, 6.941, 9.0122, 10.811, 12.0011, 14.007, 15.999, 18.998, 20.180, 22.990, 24.305, 26.982, 28.086,
		30.974, 32.065, 35.453, 39.948, 39.098, 40.078, 44.956, 47.867, 50.942, 51.996, 54.938, 55.845, 58.933, 58.693,
		63.546, 65.39, 69.723, 72.61, 74.922, 78.96, 79.904, 83.80, 85.468, 87.62, 88.906, 91.224, 92.906, 95.94, 98, 
		101.07, 102.91, 106.42, 107.87, 112.41, 114.82, 118.71, 121.76, 127.60, 126.90, 131.29, 132.91, 137.33, 138.91,
		140.12, 140.91, 144.24, 145, 150.36, 151.96, 157.25, 158.93, 162.50, 164.93, 167.26, 168.93, 173.04, 174.97, 
		178.49, 180.95, 183.84, 186.21, 190.23, 192.22, 196.08, 196.97, 200.59, 204.38, 207.2, 208.98, 209.0, 210.0,
		222.0, 223.0, 226.0, 227.0, 232.04, 231.04, 238.03, 237.0, 244.0, 243.0, 247.0, 247.0, 251.0, 252.0, 257.0,
		258.0, 259.0, 260.0, 267, 268, 271, 272, 270, 281, 280, 285
	};
		
	public molecule(String inputname, int atomnumber)  //Constructor
	{
		moleculename = inputname;
		numofatoms = atomnumber;
		String[] atomnames = new String[atomnumber];
		double[][] coordinates = new double[atomnumber][3];
	}
	
	public molecule ()  //Default Constructor
	{
		moleculename = "";
		numofatoms = 0;
		atomnames = null;
		coordinates = null;
	}

	public molecule(molecule x)  //Copy Constructor
	{
		moleculename = x.getmoleculename();
		numofatoms = x.getatomnum();
		atomnames = x.getatomnames();
		coordinates = x.getcoordinates();
	}
	
	public int getatomnum()
	{
		return (numofatoms);
	}
	
	public string getmoleculename()
	{
		return (moleculename);
	}
	
	public String[] getatomnames()
	{
		return(atomnames);
	}
	
	public double[][] getcoordinates()
	{
		return(coordinates);
	} 
	
	public double getmass()
	{
		return (mass);
	}

	public void setnames()
	{
		Scanner inp = new Scanner(System.in);
		for(int i=0; i<numofatoms; i++)
		{
			System.out.println("Input the name of the atom:");
			atomnames[i]=inp.nextLine();
			this.setcoordinates(i);
			this.setmass(atomnames[i]);
		}	
	}
	
	public void setcoordinates(int atom)
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the x, y, and z coordinates");
		coordinates[atom][0]= inp.nextDouble();
		coordinates[atom][1]= inp.nextDouble();
		coordinates[atom][2]= inp.nextDouble();
	}
	
	public void setmass (String atomname)
	{
		int index = 0;
		for(int i=0; i<95; i++)
		{ 
			if(atomicMassNames[i].equals(atomname))
			{
				index = i;
			}
		}
	}
	
	public boolean equals(Object x)  //Equals Function
	{
		if (x == null)
		{
			return (false);
		}
		if (getClass() != x.getClass())
		{
			return (false);
		}
		molecule temp = (molecule) x;
		if (mass == temp.getmass())
		{
			return (true);
		}
		else
		{
			return (false);
		}
	}
	
	class hydrocarbon extends molecule  //file#2
	{
		Scanner inp = new Scanner(System.in);
		public double[][] coordinates;
		public String[] atomname;
		public hydrocarbon(String name, int hnumber, int cnumber)
		{
			moleculeName = name;
			total = hnumber + cnumber;
			double[][] coordinates = new double[total][3];
			String[] atomname = new String[total];
			for(int i=0; i<cnumber; i++)
			{
				atomname[i]="C";
			}
			for(int i=carbons; i<total; i++)
			{
				atomname[i]="H";
			}
			for(int i=0; i<total; i++)
			{
				System.out.println("Input the x, y, and z coordinates");
				coordinates[i][0]= inp.nextDouble();
				coordinates[i][1]= inp.nextDouble();
				coordinates[i][2]= inp.nextDouble();
			}
			mass = hnumber * 1.0079 + cnumber * 12.0011;
		}
	}

	class alkane extends hydrocarbon //file#3
	{
		public alkane(String name, int carbons)
		{
			super(name, carbons, 2*carbons + 2);
		}
	}
}	