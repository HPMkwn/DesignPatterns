package Builder;

public class Client {
    public static void main(String[] args) {

        User user = User.builder()
                .setUserName("mr.mkwn")
                .setFirstName("Herat")
                .setLastName("Makwana")
                .setMobileNumber("7874570617")
                .setEmail("heratmakwana19@gmail.com")
                .setAddressLine1("016, KeerthiFlora, ITPL Main road, Brookefield")
                .setCity("Bengaluru")
                .setState("Karnataka")
                .setPincode("560037")
                .build();

        System.out.println(user);
    }
}
