public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        int differenceYears = 0;
        if (earlier(comparedDate)) {
            differenceYears = comparedDate.year - this.year;
            if (comparedDate.month < this.month || (comparedDate.month == this.month && comparedDate.day < this.day)) {
                differenceYears--;
            }
        } else {
            differenceYears = this.year - comparedDate.year;
            if (this.month < comparedDate.month || (comparedDate.month == this.month && this.day < comparedDate.day)) {
                differenceYears--;
            }
        }
        return differenceYears;

        //return Math.abs(this.year - comparedDate.year);
    }

}
