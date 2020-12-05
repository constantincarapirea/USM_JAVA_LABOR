public class Employee {
    private String first_name;
    private  String last_name;
    private String social_security_number;

    public Employee(String first_name,String last_name,String   social_security_number ){


    }
    public String getSocial_security_number(){
        return social_security_number;
    }
    public  void setSocial_security_number(String security_number){
        social_security_number=security_number;
    }
    public String getLast_name(){
        return last_name;
    }
    public void setLast_name(String last_name){

        this.last_name=last_name;
    }
    public  String getFirst_name(){
        return first_name;
    }
    public void setFirst_name(String first_name){
        this.first_name=first_name;
    }
    @Override
    public  String toString(){
        return  String.format("commision employee"+getFirst_name(),getFirst_name()+"social security number"+getSocial_security_number());
    }
}
