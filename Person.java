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
}