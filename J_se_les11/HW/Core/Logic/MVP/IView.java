package Java.J_se_les11.HW.Core.Logic.MVP;

public interface IView {
    String getfName();

    void setfName(String value);

    String getlName();

    void setlName(String value);

    String getOrganisation();

    void setOrganisation(String value);

    Integer getPhoneNumber();

    void setPhoneNumber(int value);

    String getNote();

    void setNote(String value);

    void showPosition(int value);

    void showAllPos(int value);

    Integer searchIndex();

    String chooseName();

    void addSuccess();
}
