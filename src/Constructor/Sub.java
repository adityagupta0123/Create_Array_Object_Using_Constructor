package Constructor;
class subject{
   final private String subID;
   final private String name;
    private int maxMarks;
    private int marksObtain;

    public subject(String subID, String name, int maxMarks){
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String getSubID() {
        return subID;
    }
    public String getName() {
        return name;
    }
    public int getMaxMarks() {
        return maxMarks;
    }
    public int getMarksObtain() {
        return marksObtain;
    }
    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }
    public void setMarksObtain(int marksObtain) {
        this.marksObtain = marksObtain;
    }
    boolean isQualified(int m){
        return m>= maxMarks;
    }
    public String toString(){
        return "\nsubject ID:"+subID+"\nName :" + name +"\nMarks Obtained: "+marksObtain;
    }
}

public class Sub {
    public static void main(String[] args) {
        subject sub[] = new subject[3];
        sub[0] = new subject("s101","DS",100);
        sub[1] = new subject("s102","Algorithm",100);
        sub[2] = new subject("s103","Operating System",100);

        for (subject s: sub)
            System.out.println(s);
    }
}
