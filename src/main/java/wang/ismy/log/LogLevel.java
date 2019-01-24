package wang.ismy.log;

public enum LogLevel {

    INFO("INFO"),WARM("WARM"),ERROR("ERROR");
    private String level;

    LogLevel(String level) {

        this.level = level;
    }

    public String getLevel() {
        return level;
    }
}
