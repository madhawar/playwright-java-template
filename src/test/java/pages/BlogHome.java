package pages;

import com.microsoft.playwright.Page;

public class BlogHome {
    private Page page;

    private final String url = "https://emojipedia.org/";
    private final String searchBox = "#id_q";

    public BlogHome(Page page) {
        this.page = page;
    }

    public void verifyPage() {
        assert page.url().equals(url);
    }

    public void searchKeyword(String keyword) {
        page.fill(searchBox, keyword);
        page.press(searchBox, "Enter");
    }

}
