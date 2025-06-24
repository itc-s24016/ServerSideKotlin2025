package chap03;
//Java のインターフェースを Kotlin で実装する(特殊)
@FunctionalInterface
//関数のように動くインターフェース
public interface CalcJava {
    //メソッドは一個まで！
    Integer calc(Integer num1, Integer num2);
    //※２つの引数でなにか処理をする、というインターフェース
}
