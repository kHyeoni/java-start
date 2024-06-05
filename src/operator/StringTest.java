package operator;

public class StringTest {
    public static void main(String[] args) {
        String hello = """
                가
                나
                다
                라
                마
                바
                사
                <body>
                    <div id="test">
                        <a href="/hello.html">여기를 클릭하세요</a>
                    </div>
                </body>
                """;
        System.out.println("hello = " + hello);
    }
}
