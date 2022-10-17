package Java.J_se_les11.HW.Core.Logic.Contact;

public class Contact implements Comparable<Contact> {
    private String fName;
    private String lName;
    private String organisation;
    private Integer phoneNumber;
    private String note;

    public Contact(String fName, String lName, String organisation, Integer phoneNumber, String note) {
        this.fName = fName;
        this.lName = lName;
        this.organisation = organisation;
        this.phoneNumber = phoneNumber;
        this.note = note;
    }

    @Override
    public int compareTo(Contact any) {
        int res = this.fName.compareTo(any.fName);
        if (res == 0) {
            res = this.lName.compareTo(any.lName);
        }
        if (res == 0) {
            res = this.phoneNumber.compareTo(any.phoneNumber);
        }
        if (res == 0) {
            res = this.organisation.compareTo(any.organisation);
        }
        return res;
    }

    public void setfName(String any) {
        this.fName = any;
    }

    public void setlName(String any) {
        this.lName = any;
    }

    public void setOrganisation(String any) {
        this.organisation = any;
    }

    public void setPhoneNumber(Integer any) {
        this.phoneNumber = any;
    }

    public void setNote(String any) {
        this.note = any;
    }

    public String getfName() {
        return this.fName;
    }

    public String getlName() {
        return this.lName;
    }

    public String getOrganisation() {
        return this.organisation;
    }

    public Integer getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getNote() {
        return this.note;
    }

}
