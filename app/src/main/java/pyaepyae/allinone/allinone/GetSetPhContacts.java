package pyaepyae.allinone.allinone;

public class GetSetPhContacts {
    String Name,Phno;
    int pic;

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public GetSetPhContacts(int pic, String name, String phno) {
        this.Name = name;
        this.Phno = phno;
        this.pic = pic;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhno() {
        return Phno;
    }

    public void setPhno(String phno) {
        Phno = phno;
    }

//    public int[] getPic(int position) {
//        return pic;
//    }
//
//    public void setPic(int[] pic) {
//        this.pic = pic;
//    }
}
