package com.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {

    /*
    * Comparação entre dois arrays...
    * */
    @Test
    public void testAssertArrayEquals(){
        byte[] expected = "test".getBytes();
        byte[] current = "test".getBytes();
        assertArrayEquals(expected, current);
    }

    /*
    * Comparação entre 'Strings'...
    * */
    @Test
    public void testAssertEquals(){
        assertEquals("test", "test");
    }

    /*
    * Verificar se um objeto é falso ou verdadeiro...
    * */
    @Test
    public void testAssertFalse(){
        assertFalse(false);
    }

    /*
    * Para garantir que um objeto não retorna um valor nulo...
    * */
    @Test
    public void testAssertNotNull(){
        assertNotNull(new Object());
    }

    /*
    * Verifica se os objetos não são os mesmos...
    * */
    @Test
    public void testNotSame(){
        assertNotSame(new Object(), new Object());
    }

    /*
    * Para garantir que o objeto está nulo...
    * */
    @Test
    public void testAssertNull(){
        assertNull(null);
    }

    /*
    * Verifica se o objeto é o mesmo...
    * */
    @Test
    public void testAssertSame(){
        Integer number = Integer.valueOf(765);
        assertSame(number, number);
    }

}
