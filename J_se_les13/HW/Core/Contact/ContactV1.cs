namespace HW.Core.Contact
{
    public class ContactV1
    {
        private string fName;
        private string lName;
        private string organisation;
        private int phoneNumber;
        private string note;

        public ContactV1(string fName, string lName, string organisation, int phoneNumber, string note)
        {
            this.fName = fName;
            this.lName = lName;
            this.organisation = organisation;
            this.phoneNumber = phoneNumber;
            this.note = note;
        }

        public Boolean Compare(ContactV1 contact)
        {
            if (this.fName == contact.fName)
            {
                if (this.lName == contact.lName)
                {
                    if (this.phoneNumber == contact.phoneNumber)
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }

        public void SetfName(string value)
        {
            this.fName = value;
        }

        public void SetlName(string value)
        {
            this.lName = value;
        }

        public void SetOrganisation(string value)
        {
            this.organisation = value;
        }

        public void SetPhoneNumber(int value)
        {
            this.phoneNumber = value;
        }

        public void SetNote(string value)
        {
            this.note = value;
        }

        public string GetfName()
        {
            return this.fName;
        }

        public string GetlName()
        {
            return this.lName;
        }

        public string GetOrganisation()
        {
            return this.organisation;
        }

        public int GetPhoneNumber()
        {
            return this.phoneNumber;
        }

        public string GetNote()
        {
            return this.note;
        }

    }
}