public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Coral Crown", "Darren Korb", 4.07);
        Song song2 = new Song("CASANOVE POSSE", "ALI", 4.00);
        Song song3 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);

        //test with AList
        System.out.println("Testing AList:");
        AList<Song> songsAList = new AList<>();
        System.out.println(songsAList.toString());

        songsAList.addy(song1);
        songsAList.addy(song2);
        songsAList.addy(song3);
        songsAList.addy(song1);

        System.out.println(songsAList.toString());

        songsAList.removy(1);
        System.out.println(songsAList.toString());

        //test with SLList
        System.out.println("\nTesting SLList:");
        SLList<Song> songsSLList = new SLList<>();
        System.out.println(songsSLList.toString());

        songsSLList.addy(song1);
        songsSLList.addy(song2);
        songsSLList.addy(song3);
        songsSLList.addy(song1);

        System.out.println(songsSLList.toString());

        songsSLList.removy(1);
        System.out.println(songsSLList.toString());

        //test with DLList
        System.out.println("\nTesting DLList:");
        DLList<Song> songsDLList = new DLList<>();
        System.out.println(songsDLList.toString());

        songsDLList.addy(song1);
        songsDLList.addy(song2);
        songsDLList.addy(song3);
        songsDLList.addy(song1);

        System.out.println(songsDLList.toString());

        songsDLList.removy(1);
        System.out.println(songsDLList.toString());
    }
}