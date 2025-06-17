package chap02;
//User2 を Java で動かしてみる
public class User2JavaTest {
    public static void main(String[] args) {
        User2 user = new User2(1);
        user.setName("名無し２");

        /*
        setName はあるけど、
        setId は id が val のためセッターが生成されず
        setId が見つからないと判定される
        */
        //user.setId(2);
    }
}
