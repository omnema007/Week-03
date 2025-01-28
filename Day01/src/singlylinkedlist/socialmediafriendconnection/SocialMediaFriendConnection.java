package singlylinkedlist.socialmediafriendconnection;

public class SocialMediaFriendConnection {
    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();

        // Add users
        socialMedia.addUser(1, "Ravi", 25);
        socialMedia.addUser(2, "Deepak", 27);
        socialMedia.addUser(3, "Amit", 22);

        // Add friends
        socialMedia.addFriend(1, 2);
        socialMedia.addFriend(1, 3);

        // Display all users
        socialMedia.displayUsers();

        // Display friends
        socialMedia.displayFriends(1);

        // Find mutual friends
        socialMedia.findMutualFriends(1, 2);

        // Search users
        socialMedia.searchUser(2);
        socialMedia.searchUser("Charlie");

        // Count friends
        socialMedia.countFriends();

        // Remove a friend
        socialMedia.removeFriend(1, 2);

        // Display friends
        socialMedia.displayFriends(1);
    }
}
