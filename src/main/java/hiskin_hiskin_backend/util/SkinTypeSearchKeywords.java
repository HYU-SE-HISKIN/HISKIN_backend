package hiskin_hiskin_backend.util;

public enum SkinTypeSearchKeywords {
    ORPT("미백"),
    ORPW("안티에이징"),
    ORNT("피지"),
    ORNW("보습주름"),
    OSPT("민감"),
    OSPW("예민"),
    OSNT("여드름"),
    OSNW("항산화성분"),
    DRPT("보습"),
    DRPW("주름"),
    DRNT("히알루론산"),
    DRNW("피부탄력"),
    DSPT("색소침착"),
    DSPW("감초 추출물"),
    DSNT("콜레스테롤"),
    DSNW("각질");

    private final String keyword;

    SkinTypeSearchKeywords(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }
}
