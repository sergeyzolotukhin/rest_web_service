package ua.in.szolotukhin.rest.ws.group;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Member {
    private Long id;
    private String name;

    public Member(String name) {
        this.name = name;
    }
}
