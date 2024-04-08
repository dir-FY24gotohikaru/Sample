package sample;

public class ForSample {

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                // 現在の処理をスキップし、次の繰り返しに進む
                continue;
            }
            System.out.println(i);
        }
        //「++」は「x++」のような場合にxを1増加させる複合代入演算子
        

    

}
}