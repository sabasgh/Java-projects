public class MediatorPatternDemo {
    // will use participants involved in chatting
    public static void main(String[] args) {
        ChatRoomImpl chat = new ChatRoomImpl();
        User1 user1 = new User1(chat);
        user1.setName("saba");
        user1.sendMsg("Hi sadaf How are you????");

        User2 user2 = new User2(chat);
        user2.setName("sadaf");
        user2.sendMsg("Hello saba I'm fine!!!");

    }
}
