package com.tyf.demo01._static;

import org.junit.Test;

public class Court {
    @Test
    public void test() {
        // 原告永强
        Lawsuit parties = new Parties();

        // 律师
        Lawsuit lawyer = new com.tyf.demo1._static.Lawyer(parties);

        lawyer.submit();
        lawyer.defend();
    }
}
