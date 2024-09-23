package patients;

import healthcare.Person;

public class Patient extends Person

{
    private String history;
    private String medicines;


    public Patient(int pid, String pname)

    {
        super(pid, pname);
    }


    public Patient(int pid, String pname, String history)
    {
        super(pid, pname);
        this.history = history;
    }


    public String getHistory()
    {
        return history;
    }

    public void setHistory(String history)

    {
        this.history = history;
    }


    public String getMedicines()

    {
        return medicines;
    }

    public void setMedicines(String medicines)

    {
        this.medicines = medicines;
    }
}
