package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manish.sharan on 14/09/16.
 */
public class SongGroup extends SongComponent {

    private List<SongComponent> songList = new ArrayList<>();
    private String groupName;

    public SongGroup(String groupName, List<SongComponent> songList){
        this.groupName = groupName;
        this.songList = songList;
    }

    @Override
    public String displayInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This is a song group. Group Name is "+ groupName+"\n");
        stringBuilder.append("Songs in this group - \n");
        for(SongComponent songComponent : songList){
            stringBuilder.append(songComponent.displayInfo());
        }
        return stringBuilder.toString();
    }
}
