package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void printExampleStrings() {
        System.out.println("Expect false: " + BalancedBrackets.hasBalancedBrackets("sdg[[bd[bbd]x]]xb]b]b]b]]]"));
        System.out.println("Expect true: " + BalancedBrackets.hasBalancedBrackets("sdg[[bd[bb[[[[[[d]x]]xb]b]b]b]]]"));
        System.out.println("Expect true: " + BalancedBrackets.hasBalancedBrackets("]["));
        System.out.println("Expect true: " + BalancedBrackets.hasBalancedBrackets("]]]afd[[sdfd]asfd[[[asdf]]sfd["));
    }
}