public class GettersAndSetters {
    private int stdid;
    private String stdname;
    private String stdaddress;

    
    public int getStdid() {
        return stdid;
    }

    public void setStdid(int stdid) {
        this.stdid = stdid;
    }
    public String getStdname() {
        return stdname;
    }
    public void setStdname(String stdname) {
        this.stdname = stdname;
    }
    public String getStdaddress() {
        return stdaddress;
    }
    public void setStdaddress(String stdaddress) {
        this.stdaddress = stdaddress;
    }

    @Override
    public String toString() {
        return "GettersAndSetters {" + " stdid = " + stdid + ", stdname = '" + stdname + '\'' + ", stdaddress = '" + stdaddress + '\'' + '}';
    }
}