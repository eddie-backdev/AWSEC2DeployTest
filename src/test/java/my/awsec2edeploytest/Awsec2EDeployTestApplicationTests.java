package my.awsec2edeploytest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Awsec2EDeployTestApplicationTests {

    String str1 = "hello";

    @Test
    void test() {
        assertEquals("hello", str1);
    }

}
