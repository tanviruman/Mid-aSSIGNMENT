package healthcare;

public abstract class Person
{
    private int pid;
    private String pname;

    public Person(int pid, String pname)
    {
        this.pid = pid;
        this.pname = pname;
    }


    public int getPid()
    {
        return pid;
    }

    public void setPid(int pid)

    {
        this.pid = pid;
    }


    public String getPname()

    {
        return pname;
    }

    public void setPname(String pname)

    {
        this.pname = pname;
    }
}
