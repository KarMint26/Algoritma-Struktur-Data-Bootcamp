package Java.Karel.Latihan.Entity;

import java.util.ArrayList;

public class EventOrganiser {
    private String CUSTID;
    private String CUSTNAME;
    private String CUSTADDR;
    private String CUSTEMAIL;
    private int CUSTPHONE;

    public EventOrganiser(String CUSTID, String CUSTNAME, String CUSTADDR, String CUSTEMAIL, int CUSTPHONE) {
        this.CUSTID = CUSTID;
        this.CUSTNAME = CUSTNAME;
        this.CUSTADDR = CUSTADDR;
        this.CUSTEMAIL = CUSTEMAIL;
        this.CUSTPHONE = CUSTPHONE;
    }

    public EventOrganiser(String CUSTNAME) {
        this.CUSTNAME = CUSTNAME;
    }

    public EventOrganiser(){

    }

    public String getCUSTID() {
        return CUSTID;
    }

    public void setCUSTID(String CUSTID) {
        this.CUSTID = CUSTID;
    }

    public String getCUSTNAME() {
        return CUSTNAME;
    }

    public void setCUSTNAME(String CUSTNAME) {
        this.CUSTNAME = CUSTNAME;
    }

    public String getCUSTADDR() {
        return CUSTADDR;
    }

    public void setCUSTADDR(String CUSTADDR) {
        this.CUSTADDR = CUSTADDR;
    }

    public String getCUSTEMAIL() {
        return CUSTEMAIL;
    }

    public void setCUSTEMAIL(String CUSTEMAIL) {
        this.CUSTEMAIL = CUSTEMAIL;
    }

    public int getCUSTPHONE() {
        return CUSTPHONE;
    }

    public void setCUSTPHONE(int CUSTPHONE) {
        this.CUSTPHONE = CUSTPHONE;
    }

    public void PrintGuests(ArrayList<EventOrganiser> eventOrganisers){
        for (int i = 0; i < eventOrganisers.size(); i++) {
            if (eventOrganisers.get(i) != null){
                System.out.println((i+1) + ". Tamu Yang Terdaftar : " + eventOrganisers.get(i));
            } else {
                System.out.println("Belum Ada Tamu Yang Terdaftar");
            }
        }
    }
}
