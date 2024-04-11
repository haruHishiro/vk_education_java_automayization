package tests.enums;

public enum BotValues {
    LOGIN("technopol67"),
    PASSWD("technopolisPassword"),
    FULL_NAME("technopol67 technopol67"),
    ;
    private final String value;

    BotValues(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
