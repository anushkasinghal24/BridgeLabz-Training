package music_playlist_manager;

import java.util.*;

public class PlaylistManager{

    private LinkedList<Song> playlist = new LinkedList<>();
    private Stack<Song> recentlyPlayed = new Stack<>();
    private Set<Song> songSet = new HashSet<>();

    public void addSong(Song song) throws SongAlreadyExistException{
        if(songSet.contains(song)){
            throw new SongAlreadyExistException(song+ " already exists in playlist ");
        }

        playlist.add(song);
        songSet.add(song);
        System.out.println(song+" added successfully");
    }


    public void playSong(String title){
        for(Song song:playlist){
            if(song.getTitle().equalsIgnoreCase(title)){
                recentlyPlayed.push(song);
                System.out.println("Now playing: "+song);
                return;
            }
        }

        System.out.println("Song not found in playlist");
    }


    public void showPlaylist(){
        System.out.println("\nPlaylist");
        for(Song song:playlist){
            System.out.println(" - "+song);
        }
    }

    public void showRecentlyPlayed(){
        System.out.println("\nRecently Played: ");
        for(Song song: recentlyPlayed){
            System.out.println(" - "+song);
        }
    }

}