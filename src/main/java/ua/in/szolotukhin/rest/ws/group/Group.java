package ua.in.szolotukhin.rest.ws.group;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Group {
    private Long id;
    private String name;
    private String description;

    public Group(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
