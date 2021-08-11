package com.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RuleTest {

    /*
    * A notação 'rule' quer dizer que a pasta temporária será criada antes da execução do teste...
    * */
    @Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();

    @Test
    public void shouldCreateNewFileTemporaryFolder() throws IOException{
        File created = tmpFolder.newFile("file.txt");

        // verificando se o arquivo foi criado...
        assertTrue(created.isFile());
        // verifica se o root da pasta temporária e o mesmo do arquivo criado...
        assertEquals(tmpFolder.getRoot(), created.getParentFile());
    }
}
