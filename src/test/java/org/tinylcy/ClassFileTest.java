package org.tinylcy;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by chenyangli.
 */
public class ClassFileTest {

    @Test
    public void classfile() throws Exception {
        File file = new File("D:\\Code\\IdeaProjects\\ClassAnalyzer\\target\\test-classes\\org\\tinylcy\\TestClass.class");
        FileInputStream inputStream = new FileInputStream(file);
        ClassReader.read(inputStream);
    }

}
