package com.kodilla.stream.world;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world=new World();
        Country country1=new Country(new BigDecimal("100000000"),"Country1");
        Country country2=new Country(new BigDecimal("100000000"),"Country2");
        Country country3=new Country(new BigDecimal("100000000"),"Country3");
        Continent continent1=new Continent();
        Continent continent2=new Continent();
        Continent continent3=new Continent();

        //When
        BigDecimal totalPeople=world.getPeopleQuantity();
        //Then
        BigDecimal expectedPeople = new BigDecimal("900000000");
        Assert.assertEquals(expectedPeople, totalPeople);
    }
}
