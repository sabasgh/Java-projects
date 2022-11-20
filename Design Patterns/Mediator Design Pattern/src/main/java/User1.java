public class User1 extends Participant {
    private String name;
    private Chatroom chatroom;

    public User1(Chatroom chatroom) {
        this.chatroom = chatroom;
    }

    @Override
    public void sendMsg(String msg) {
        chatroom.showMessage(msg, this);
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
