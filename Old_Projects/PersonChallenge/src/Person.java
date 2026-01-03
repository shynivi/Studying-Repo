public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person()
    {
        System.out.println("Empty constructor called");
    }

//    public Person()

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0 || age > 100)
        {
            this.age = 0;
        }else {
            this.age = age;
        }
    }
    public boolean isTeen()
    {
        if(this.age >= 12 && this.age <= 20) {
            return true;
        }
        else {
            return false;
        }
    }
    public String getFullName()
    {
        if(this.firstName == "" && this.lastName == "")
        {
            return "";
        }
        else if(this.lastName == "")
        {
            return firstName;
        }
        else if(this.firstName == "")
        {
            return this.lastName;
        }
        else {
            return this.firstName.concat(" ").concat(this.lastName);
        }
    }

}
