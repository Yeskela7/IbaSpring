package app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Message {

    int id;
    int user1;
    int user2;
    String text;


    public Message(int id, int user1, int user2, String text) {
        this.id = id;
        this.user1 = user1;
        this.user2 = user2;
        this.text = text;
    }
}
