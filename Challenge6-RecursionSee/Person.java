//UIUC CS125 FALL 2012 MP. File: Person.java, CS125 Project: Challenge6-RecursionSee, Version: 2012-11-03T10:40:30-0500.653808000
/**
 * @author aagrawl3
 *
 */
public class Person
{
private final String name;
private final int age;
private final char gender;
private final Person child1; //left child
private final Person child2; //right child

public Person(String name, int age, char gender, Person c1, Person c2)
{
    this.name=name;
    this.age=age;
    this.gender=gender;
    this.child1 = c1;
    this.child2 = c2;
}

public String toString()
{
    return name+"*"+age+"*"+gender;
}

public String getName() 
{
	return name;
}

public int getAge() 
{
	return age;
}

public char getGender() 
{
	return gender;
}

public boolean equals(Person p)
{
	return (this.name.equals(p.name)) &&
			(this.age==p.age) &&
			(this.gender==p.gender);
}


public void print() 
{
   System.out.println(this);
   if(child1 != null)
       child1.print();
   if(child2 != null)
       child2.print();
   
}

public int count() // total person count including this object
{
	int sum=1;
	if(child1!=null)
		sum+=child1.count();
	if(child2!=null)
		sum+=child2.count();
	return sum;
}
public int countGrandChildren() // but not greatGrandChildren
{
	return this.grand(2);
	
}

public int grand(int a){
	int sum=0;
	if(a==0)
		sum=1;
	else{
		if(child1!=null)
			sum+=child1.grand(a-1);
		if(child2!=null)
			sum+=child2.grand(a-1);
	}
	return sum;
}

public int countMaxGenerations()
{
	 //return this.countMax(this);
	int sum=1;
	if(child1!=null&&child2!=null){
		if(child1.countMaxGenerations()>child2.countMaxGenerations())
			sum+=child1.countMaxGenerations();
		else sum+=child2.countMaxGenerations();
	}
	else if(child2!=null)
		sum+=child2.countMaxGenerations();
	else if(child2!=null)
		sum+=child1.countMaxGenerations();
	return sum;
}

public int countGender(char gen)
{
	int sum;
	if(this.gender==gen)
		sum=1;
	else
		sum=0;
	if(child1!=null)
		sum+=child1.countGender(gen);
	if(child2!=null)
		sum+=child2.countGender(gen);
	return sum;
}


public Person search(String name, int maxGeneration)
{
	if(maxGeneration<0)
		return null;
	else{
		if(this.name.equals(name))
			return this;
		else{
			if(child1!=null && child1.search(name, maxGeneration-1)!=null)
				return child1.search(name, maxGeneration-1);
			if(child2!=null)
				return child2.search(name, maxGeneration-1);
			if(child1==null && child2==null)
				return null;
		}
	}
	//YOUR CODE HERE
	throw new IllegalArgumentException("Not Yet Implemented");
}

} // end of class
