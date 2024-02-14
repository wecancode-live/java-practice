package in.balamt.practice.threads.runnable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Party {
    Long id;
    String partyName;
    List<Long> votes;

    public Party(){
        this.votes = new ArrayList<>();
    }

    public Party(Long id, String partyName){
        this.votes = new ArrayList<>();
        this.id = id;
        this.partyName = partyName;
    }

}
