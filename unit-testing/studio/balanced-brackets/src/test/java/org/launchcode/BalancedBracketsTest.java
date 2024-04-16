package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: Test balanced brackets in front of other characters - "[]LaunchCode"
    //TODO: Test balanced brackets around other characters - "[Launchcode]"
    //TODO: Test balanced brackets within other characters - "Launch[code]"
    //TODO: Test multiple consecutive pairs of balanced brackets - "[][]"
    //TODO: Test multiple nested balanced brackets - "[[[]]]"

    //TODO: Test single opening bracket - "["
    //TODO: Test single closing bracket - "]"
    //TODO: Test reversed bracket - "]["
    //TODO: Test single bracket with other characters - "[LaunchCode"
    //TODO: Test unbalanced brackets amoung other characters - "Launch]Code["
    //TODO: Test a series of mixed, unbalanced brackets - "[[]][]["
    @Test
    public void onlyBracketsReturnsTrue() {
        //Should return true because we have one opening and closing bracket
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[SomethingInsideBrackets]"));
    }

    @Test
    public void bracketsInTheCorrectOrderReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[SomethingElse][SomethingInsideBrackets]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[TheseAreInOrder]]]]"));
    }

    @Test
    public void bracketsInTheWrongOrderReturnsFalse() {
        String message = "Brackets in wrong order!";
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["), message);
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Something]]TheseAreInTheWrongOrder[[CorrectOrder]"), message);
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][][]][][[][][]"), message);
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Something]]WrongOrder[[][]"));
    }

    @Test
    public void singleBracketReturnsFalse() {
        String message = "Can't have an opening bracket without a closing bracket";
        assertFalse(BalancedBrackets.hasBalancedBrackets("["), message);
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"), message);
    }

    @Test
    public void emptyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void stringWithoutBracketsReturnsFalse() {
        String message = "String doesn't have brackets";
        assertFalse(BalancedBrackets.hasBalancedBrackets("StringWithoutBrackets"), message);
    }
}