package book.ch06.soultuon.exam15;

public class MemberService {
    String id = "hong";
    String password = "12345";

    public boolean login(String id,String password){
        if (id.equals(this.id) && password.equals(this.password)){
            return true;
        }
        else {
            return false;
        }
    }
    public void logout(String id){
        if (id.equals(this.id)){
            System.out.println(id +"님이 로그아웃 되었습니다.");
        }
        else {
            System.out.println("회원을 찾을 수 없습니다.");
        }
    }
}
