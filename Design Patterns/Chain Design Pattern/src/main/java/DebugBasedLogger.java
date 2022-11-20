public class DebugBasedLogger extends Logger {
    public DebugBasedLogger(int level) {
        this.levels = level;
    }

    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("DEBUG LOGGER INFO: " + msg);
    }
}
