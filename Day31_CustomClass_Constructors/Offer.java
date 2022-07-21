package Day31_CustomClass_Constructors;

public class Offer {
    /*	1. Create a custom class named Offer
Attributes:	location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime
Actions:	setInfo(): sets all the instance variables
			toString(): returns the full info of the Offer Object */

    public String location ,companyName , jobtitle ;
    public double salaries ;
    public boolean hasBenefit,hasPTO ,isFullTime ,isWFH ;

        public void setInfo(String location, String companyName, String jobtitle, double salaries, boolean hasBenefit, boolean hasPTO, boolean isFullTime, boolean isWFH) {
            this.location = location;
            this.companyName = companyName;
            this.jobtitle = jobtitle;
            this.salaries = salaries;
            this.hasBenefit = hasBenefit;
            this.hasPTO = hasPTO;
            this.isFullTime = isFullTime;
            this.isWFH = isWFH;

        }
            public String toString() {
                return "Offer{" +
                        "location='" + location + '\'' +
                        ", companyName='" + companyName + '\'' +
                        ", jobtitle='" + jobtitle + '\'' +
                        ", salary= $" + salaries +
                        ", hasBenefit=" + hasBenefit +
                        ", hasPTO=" + hasPTO +
                        ", isFullTime=" + isFullTime +
                        ", isWFH=" + isWFH +
                        '}';

    }

}
