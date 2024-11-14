public class Driver extends EmailStore {

    public static void main(String[] args) {

        EmailStore emailStore = new EmailStore();

        emailStore.addEmail("harrykane16@gmail.com");
        emailStore.addEmail("lukeskywalker64@gmail.com");
        emailStore.addEmail("nuketown@gmail.com");

        emailStore.addEmail("harrykane16@gmail.com");
        emailStore.hasEmail("harrykane16@gmail.com");

        emailStore.displayEmails();



    }
}
