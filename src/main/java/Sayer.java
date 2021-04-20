package main.java;

public class Sayer{
    private String saying;

    public Sayer(String saying){
        this.saying=saying;
    }

    public void say(){
        if (saying !=null) {
            if (saying.equals("")){
                setSaying("I am a silent sayer");
            }
            System.out.println(saying);
        }else throw new NullPointerException("I cannot say 'null'");
    }

    public void setSaying(String saying){
        this.saying = saying;
    }

    public String getSaying() {

        return saying;
    }
}
