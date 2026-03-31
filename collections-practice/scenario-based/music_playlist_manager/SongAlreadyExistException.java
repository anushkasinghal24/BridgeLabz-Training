package music_playlist_manager;

public class SongAlreadyExistException extends Exception{
    public SongAlreadyExistException (String message){
        super(message);
    }
}