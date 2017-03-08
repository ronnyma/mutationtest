package no.transfinite;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by romandal on 20.02.2017.
 */
@Ignore
@RunWith(Parameterized.class)
public class KillMutantTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 1, 0}, {2, 1, 1}, {2, 1, 1}, {1, 2, 1}, {0, 1, 0}, {0, 0, 0}
        });
    }

    public KillMutantTest(int input1, int input2, int expected) {
        this.input1 = input1;
        this.input2 = input2;
        this.expected = expected;
    }

    @org.junit.Test
    public void min() throws Exception {
        assertEquals(this.expected, cl.min(input1, input2));
    }

    private int input1, input2, expected;
    Calculate cl = new Calculate();
}
