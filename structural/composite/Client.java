package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manish.sharan on 14/09/16.
 */
public class Client {

    public static void main(String[] args) {
        SongComponent song1 = new Song("abc", 1990, "lata");
        SongComponent song2 = new Song("abs", 1991, "asha");

        List<SongComponent> ninetySongs = new ArrayList<>();
        ninetySongs.add(song1);
        ninetySongs.add(song2);
        SongComponent songComponent1 = new SongGroup("ninety's songs", ninetySongs);

        SongComponent song3 = new Song("man", 2000, "sunidhi");
        SongComponent song4 = new Song("mnq", 2007, "sonu");

        List<SongComponent> recent = new ArrayList<>();
        recent.add(song3);
        recent.add(song4);
        List<SongComponent> latestInRecentSongs = new ArrayList<>();
        latestInRecentSongs.add(new Song("hello", 2009, "shreya"));
        SongComponent latestInRecent = new SongGroup("latestInRecent", latestInRecentSongs);
        recent.add(latestInRecent);
        SongComponent songComponent2 = new SongGroup("recent songs", recent);

        List<SongComponent> allSongsList = new ArrayList<>();
        allSongsList.add(songComponent1);
        allSongsList.add(songComponent2);
        SongComponent allSongs = new SongGroup("allSongs", allSongsList);
        System.out.println(allSongs.displayInfo());
    }
}

/*
Philosophy:

This pattern assumes all classes are following a tree hierarchy. There is a parent node and all other classes are inheriting from this node. So all the
classes can be represented as the parent node. Hence we create a  composition of different modules and use the same behavior in all. The behavior when invoked
from the parent drills down recursively to all the children.

We can assume that there is a module and all other children are submodules which comprise that module.
So we can create a module by adding submodules which again are modules for its childres.

Here SongComponent is a Module which is the parent class. SongGroup is a children module of SongComponent.
 We create a group of songs which is of type SongComponent. We add Songs to its respective group which again is of type SongComponent.
 We can not just add a Song to a SongGroup, but can add a song group also it the parent song group as well. The child song group will have songs.

 Thus if we can have this model created, getting a task executed is very clean. We just call the execution from the parent module and all the submodules implicitly
  carry that task.
 */
