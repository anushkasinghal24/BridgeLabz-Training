package music_playlist_manager;

import java.util.*;
public class MusicManager{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        PlaylistManager manager = new PlaylistManager();

        while(true){

            System.out.println("\n----Music Playlist Manager----");
            System.out.println("1. Add Song");
            System.out.println("2. Play Song");
            System.out.println("3. Show PlayList");
            System.out.println("4. Recently Played Song");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int choice=sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter song title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter artist name: ");
                    String artist = sc.nextLine();

                    Song song = new Song(title,artist);
                    try{
                        manager.addSong(song);
                    }catch(SongAlreadyExistException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                    break;

                case 2:

                System.out.print("Enter song to play: ");
                String playTitle = sc.nextLine();
                manager.playSong(playTitle);
                break;

                case 3:
                    manager.showPlaylist();
                    break;
                case 4:
                    manager.showRecentlyPlayed();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice");            
                    
                

            }



        }
    }
}