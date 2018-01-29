package Main;

import Main.Contractor.ContractEmployee;

public class Main2
{

    public static void main(String[] args)
    {
	Contractor newContractor = new Contractor(8.5);
	
	ContractEmployee empA =  newContractor. new TechAssoicateContract(0, "abc", "def", 'a', 10, "01/01/2019");
	ContractEmployee empB =  newContractor. new TechAssoicateContract(0, "zxc", "bvc", 'a', 10, "01/01/2019");
	
	newContractor.addContractEmployee(empA);
	newContractor.addContractEmployee(empB);
	
	ContractEmployee empC =  newContractor. new TechAssoicateContract(0, "abc", "def", 'a', 10, "01/01/2019");
	ContractEmployee empD =  newContractor. new TechAssoicateContract(0, "pou", "ief", 'a', 10, "01/01/2019");
	
	if(newContractor.ifContractEmployeeExists(empC))
	{
	    System.out.println("empC exists....");
	}
	else
	{
	    System.out.println("empC not exists....");
	}
	
	if(newContractor.ifContractEmployeeExists(empD))
	{
	    System.out.println("empD exists....");
	}
	else
	{
	    System.out.println("empD not exists....");
	}
	
    }

}
