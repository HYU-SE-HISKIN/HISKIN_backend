package hiskin_hiskin_backend.util;

public enum SkinTypeSearchKeywords {
    ORPT("1"),
    ORPW("2"),
    ORNT("3"),
    ORNW("4"),
    OSPT("5"),
    OSPW("6"),
    OSNT("7"),
    OSNW("8"),
    DRPT("9"),
    DRPW("10"),
    DRNT("11"),
    DRNW("12"),
    DSPT("13"),
    DSPW("14"),
    DSNT("15"),
    DSNW("16");

    private final String keyword;

    SkinTypeSearchKeywords(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }
}
