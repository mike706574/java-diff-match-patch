package fun.mike.dmp;

import java.util.List;

/**
 * Internal class for returning results from diff_linesToChars().
 * Other less paranoid languages just use a three-element array.
 */
public class LinesToCharsResult {
    public String chars1;
    public String chars2;
    public List<String> lineArray;

    public LinesToCharsResult(String chars1, String chars2,
            List<String> lineArray) {
        this.chars1 = chars1;
        this.chars2 = chars2;
        this.lineArray = lineArray;
    }
}
