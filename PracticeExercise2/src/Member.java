class Member{
    String Name;
    int age;
    int Salary;
}
class MemberVariable{
    Member member;
    public  MemberVariable(String name,int age,int salary){
        member =new Member();
        member.Name=name;
        member.age=age;
        member.Salary=salary;
    }
    public String getMemberName(){
        return member.Name;
    }
    public int getMemberAge(){
        return member.age;
    }
    public int getMemberSalary(){
        return member.Salary;
    }
}