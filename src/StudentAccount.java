/**
 * Created by OliverW on 27/01/2016.
 */
public class StudentAccount extends BankAccount{
    public String university;
    public int yearOfStudy;

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getUniversity() {

        return university;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }
}
