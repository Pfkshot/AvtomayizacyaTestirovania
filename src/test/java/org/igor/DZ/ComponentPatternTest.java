package org.igor.DZ;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComponentPatternTest {

    @Test
    void onePortfolioTest() {
        //given
        Portfolio portfolio = new Portfolio();
        portfolio.add(new Account(100L));
        portfolio.add(new Account(200L));
        portfolio.add(new Account(300L));
        //when
        Long result = portfolio.getSum();
        //then
        Assertions.assertEquals(600L, result);
    }

    @Test
    void complexPortfolioTest() {
        //given
        Portfolio portfolioFirstLevel = new Portfolio();
        Portfolio portfolioNextLevelOne = new Portfolio();
        Portfolio portfolioNextLevelTwo = new Portfolio();

        portfolioFirstLevel.add(portfolioNextLevelOne);
        portfolioFirstLevel.add(portfolioNextLevelTwo);

        portfolioNextLevelOne.add(new Account(100L));
        portfolioNextLevelOne.add(new Account(200L));
        portfolioNextLevelOne.add(new Account(300L));

        portfolioNextLevelTwo.add(new Account(100L));
        portfolioNextLevelTwo.add(new Account(200L));
        portfolioNextLevelTwo.add(new Account(300L));
        //when
        Long result = portfolioFirstLevel.getSum();
        //then
        Assertions.assertEquals(1200L, result);
    }

    @Test
    void complexDeeperPortfolioTest() {
        //given
        Portfolio baseLevel = new Portfolio();
        Portfolio portfolioFirstLevel = new Portfolio();
        Portfolio portfolioSecondLevel = new Portfolio();
        Portfolio portfolioNextLevelOne = new Portfolio();
        Portfolio portfolioNextLevelTwo = new Portfolio();
        Portfolio portfolioNextLevelThree = new Portfolio();
        Portfolio portfolioNextLevelFour = new Portfolio();


        baseLevel.add(portfolioFirstLevel);
        baseLevel.add(portfolioSecondLevel);
        portfolioFirstLevel.add(portfolioNextLevelOne);
        portfolioFirstLevel.add(portfolioNextLevelTwo);
        portfolioSecondLevel.add(portfolioNextLevelThree);
        portfolioSecondLevel.add(portfolioNextLevelFour);

        portfolioNextLevelOne.add(new Account(100L));
        portfolioNextLevelOne.add(new Account(200L));
        portfolioNextLevelOne.add(new Account(300L));

        portfolioNextLevelTwo.add(new Account(100L));
        portfolioNextLevelTwo.add(new Account(200L));
        portfolioNextLevelTwo.add(new Account(300L));

        portfolioNextLevelThree.add(new Account(150L));
        portfolioNextLevelThree.add(new Account(250L));
        portfolioNextLevelThree.add(new Account(350L));

        portfolioNextLevelFour.add(new Account(4000L));
        portfolioNextLevelFour.add(new Account(2000L));
        portfolioNextLevelFour.add(new Account(3000L));
        //when
        Long result = baseLevel.getSum();
        //then
        Assertions.assertEquals(10950L, result);
    }
}