package okay;

import io.mailtrap.client.MailtrapClient;
import io.mailtrap.config.MailtrapConfig;
import io.mailtrap.factory.MailtrapClientFactory;
import io.mailtrap.model.request.emails.Address;
import io.mailtrap.model.request.emails.MailtrapMail;

import java.util.List;

public class MailtrapJavaSDKTest {

    private static final String TOKEN = "48697a80668ff3783ac0a73f71df2bd4";

    public static void main(String[] args) {
        final MailtrapConfig config = new MailtrapConfig.Builder()
            .token(TOKEN)
            .build();

        final MailtrapClient client = MailtrapClientFactory.createMailtrapClient(config);

        final MailtrapMail mail = MailtrapMail.builder()
            .from(new Address("nonreply@holyledger.co.za", "Mailtrap Test"))
            .to(List.of(new Address("molorane91@gmail.com")))
            .subject("You are awesome!")
            .text("Congrats for sending test email with Mailtrap!")
            .category("Integration Test")
            .build();

        try {
            System.out.println(client.send(mail));
        } catch (Exception e) {
            System.out.println("Caught exception : " + e);
        }
    }
}