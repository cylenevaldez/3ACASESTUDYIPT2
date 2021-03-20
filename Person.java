package PersonInformation;

public class PersonInformation {
    
    private String Fname;
    private String Lname;
    private String Mname;

    //Method 1:
    public void get(String Fname)
    {
        this.Fname = Fname;
    }
 
    public String showFname()
    {
        return Fname;
    }
    
    //Method 2: 
    public void getLname(String Lname)
    {
        this.Lname = Lname;
    }
    
    public String showLname()
    {
        return Lname;
    }
    
    //Method 3:
     public void getMname(String Mname)
    {
        this.Mname = Mname;
    }
    
    public String showMname()
    {
        return Mname;
    }



private String cz;
private String gn;
private String add;

//Method 1:
public void getCitizen(String cz)
{
    this.cz = cz;
}

public String showCitizen()
{
    return cz;
}

//Method 2: 
public void getGender(String gn)
{
    this.gn = gn;
}

public String showGender()
{
    return gn;
}

//Method 3:
 public void getAddress(String add)
{
    this.add = add;
}

public String showAddress()
{
    return add;
}

private int cn;
    private String em;
    private String cs;

    //Method 1:
    public void getContactNo(int cn)
    {
        this.cn = cn;
    }
 
    public int showContactNo()
    {
        return cn;
    }
    
    //Method 2: 
    public void getEmail(String em)
    {
        this.em = em;
    }
    
    public String showEmail()
    {
        return em;
    }
    
    //Method 3:
     public void getCivil(String cs)
    {
        this.cs = cs;
    }
    
    public String showCivil()
    {
        return cs;
    }
}