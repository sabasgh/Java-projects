public class User2 extends Participant {
    private String name;
    private Chatroom chat;

    public User2(Chatroom chat) {
        this.chat = chat;
    }

    @Override
    public void sendMsg(String msg) {
        chat.showMessage(msg, this);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
