package Java.J_se_les12.HW.Core.Contact;

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
    public int compareTo(Contact value) {
        int res = this.fName.compareTo(value.fName);
        if (res == 0) {
            res = this.lName.compareTo(value.lName);
        }
        if (res == 0) {
            res = this.phoneNumber.compareTo(value.phoneNumber);
        }
        if (res == 0) {
            res = this.organisation.compareTo(value.organisation);
        }
        return res;
    }

    public void setfName(String value) {
        this.fName = value;
    }

    public void setlName(String value) {
        this.lName = value;
    }

    public void setOrganisation(String value) {
        this.organisation = value;
    }

    public void setPhoneNumber(Integer value) {
        this.phoneNumber = value;
    }

    public void setNote(String value) {
        this.note = value;
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
