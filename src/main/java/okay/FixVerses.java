package okay;

import java.sql.*;

public class FixVerses {

    public static void main(String[] args) throws Exception {

        Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/mothusi/workspace/bible-data/CSB.db");

        String selectSql = """
            SELECT rowid, book, chapter, verse
            FROM bible
            ORDER BY book, chapter, rowid
        """;

        String updateSql = """
            UPDATE bible
            SET verse = ?
            WHERE rowid = ?
        """;

        PreparedStatement selectStmt = conn.prepareStatement(selectSql);
        PreparedStatement updateStmt = conn.prepareStatement(updateSql);

        ResultSet rs = selectStmt.executeQuery();

        int currentBook = -1;
        int currentChapter = -1;
        int expectedVerse = 1;

        while (rs.next()) {

            int rowId = rs.getInt("rowid");
            int book = rs.getInt("book");
            int chapter = rs.getInt("chapter");

            if (book != currentBook || chapter != currentChapter) {
                currentBook = book;
                currentChapter = chapter;
                expectedVerse = 1;
            }

            updateStmt.setInt(1, expectedVerse);
            updateStmt.setInt(2, rowId);
            updateStmt.executeUpdate();

            expectedVerse++;
        }

        conn.close();
        System.out.println("Verses corrected successfully ✅");
    }
}