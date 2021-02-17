package com.example.task15;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Tests {

    private void check(int input) {
        Assertions.assertThat(task15.GetHundred(input)).isEqualTo(100);
    }

    @Test
    public void test() throws Exception {
        check(98765432);
        check(421);
    }

}