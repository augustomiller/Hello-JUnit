package com.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

public class ExceptionTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void empty(){
        new ArrayList<>().get(0);
    }

    /*
    * Nesse exemplo a lista não está vazia, como ela não está vazia não retorna a exception esperada...
    * Dessa forma é esperado que este teste falhe...
    * */
    @Test(expected = IndexOutOfBoundsException.class)
    public void notEmpty(){
        List<String> list = new ArrayList<String>();
        list.add("Maic Miller");

        list.get(0);
    }

    /*
    * Nesse teste é esperado uma exception e uma mensagem específica...
    * */
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void shouldTestExceptionMessage() throws IndexOutOfBoundsException{
        List<Object> list = new ArrayList<>();

        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Index: 0, Size: 0");
        list.get(0);
    }

    /*
     * Nesse teste é esperado uma exception e uma mensagem específica...
     * Mesma ideia da anterior, mas, com uma abordagem diferente...
     * */
    @Test
    public void testExceptionMessage(){
        try {
            new ArrayList<Object>().get(0);
            fail("Espected IndexOutBoundsException is lanced!");
        }catch (IndexOutOfBoundsException ex){
            assertThat(ex.getMessage(), is("Index: 0, Size: 0"));
        }
    }
}
