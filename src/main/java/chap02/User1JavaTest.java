package chap02;
//修正完了
public class User1JavaTest {
    public static void main(String[] args) {
        User1 user = new User1();
//        user.name = "Nakasone"
        // ↑ name フィールドに直接アクセスできない
        user.setName("名無し");
        System.out.println(user.getName());
    }
}