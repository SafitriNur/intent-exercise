package id.ac.polinema.intentexercise;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
    private String fullName;
    private String eMail;
    private String passWord;
    private String cPassword;
    private String homePage;
    private String aBout;

    public User(String fullName, String eMail, String passWord, String cPassword, String homePage, String aBout) {
        this.fullName = fullName;
        this.eMail = eMail;
        this.passWord = passWord;
        this.cPassword = cPassword;
        this.homePage = homePage;
        this.aBout = aBout;
    }

    protected User(Parcel in) {
        fullName = in.readString();
        eMail = in.readString();
        passWord = in.readString();
        cPassword = in.readString();
        homePage = in.readString();
        aBout = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(fullName);
        dest.writeString(eMail);
        dest.writeString(passWord);
        dest.writeString(cPassword);
        dest.writeString(homePage);
        dest.writeString(aBout);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getaBout() {
        return aBout;
    }

    public void setaBout(String aBout) {
        this.aBout = aBout;
    }
}
