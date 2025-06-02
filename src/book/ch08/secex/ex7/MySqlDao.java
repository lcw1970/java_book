package book.ch08.secex.ex7;

public class MySqlDao implements DatatAccessObject{
    @Override
    public void select() {
        System.out.println(messageMethod()+" 검색");
    }

    @Override
    public void insert() {
        System.out.println(messageMethod()+" 삽입");
    }

    @Override
    public void update() {
        System.out.println(messageMethod()+" 수정");
    }

    @Override
    public void delete() {
        System.out.println(messageMethod()+" 삭제");
    }
    private String messageMethod() {
        String message = "Mysql DB에서";
        return message;
    }
}
