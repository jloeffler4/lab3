import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class FileTests {
    @Test
    public void testEmptyDirectory() throws IOException {        
        List<File> structure = FileExample.getFiles(new File("file-tests/empty-dir/"));
        assertEquals("[]", structure.toString());
    }

    @Test
    public void testWithFiles() throws IOException {        
        List<File> structure = FileExample.getFiles(new File("file-tests/with-files/"));
        assertEquals("[file-tests\\with-files\\a.txt, file-tests\\with-files\\b.txt, file-tests\\with-files\\c.txt]", structure.toString());
    }

    @Test
    public void testWithSubFolders() throws IOException {        
        List<File> structure = FileExample.getFiles(new File("file-tests/with-sub-folders/"));
        assertEquals("[file-tests\\with-sub-folders\\a.txt, file-tests\\with-sub-folders\\subfolder\\b.txt]", structure.toString());
    }
}