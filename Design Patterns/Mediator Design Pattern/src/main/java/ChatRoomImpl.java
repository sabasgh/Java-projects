import java.time.LocalDateTime;

public class ChatRoomImpl implements Chatroom {

    // implements the operations defined by the Chatroom interface.
    // The operations are managing the interactions between the objects:
    // when one participant sends a message, the message is sent to the other participants.
    LocalDateTime dateTime = LocalDateTime.now();

    @Override
    public void showMessage(String message, Participant p) {
        System.out.println(p.getName() + " gets message: " + message);
        System.out.println(dateTime.toString());
    }
}
