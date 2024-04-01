package utils;

import org.simplejavamail.api.email.Email;
import org.simplejavamail.email.EmailBuilder;
import org.simplejavamail.api.mailer.Mailer;
import org.simplejavamail.mailer.MailerBuilder;

import jakarta.activation.FileDataSource;

import org.simplejavamail.api.mailer.config.TransportStrategy;
import org.simplejavamail.api.email.AttachmentResource;

import java.util.ArrayList;
import java.util.Properties;


public class EmailWithAttachment {

	public static void sendMail() {
		
		String fromName  = "CloudBank";
        String fromAddress = "ivan.manfouo@inetconsulting.cm";
        String recipient = "ange.kouomo@2026.ucac-icam.com";
        String recipientName = "maeva";
        String subject = "Testing Envois de mail  "  ;
        String message = "Test Ok";

        String hostname = "Maeva-PC";

        String smtpUrl = "netsol-smtp-oxcs.hostingplatform.com";
        Integer smtpPort = 587;
        String login = "ivan.manfouo@inetconsulting.cm";
        String password  = "lshd-joao-nijt-cfec";

        System.out.println("== Envois Email ==");

        // Créer la pièce jointe
       AttachmentResource attachment = new AttachmentResource(
                "attachment.txt",
                new FileDataSource("C:\\Users\\pc\\Documents\\testSelenium\\test.pdf"));
        ArrayList<AttachmentResource> lsAttachments = new ArrayList<AttachmentResource>();
        lsAttachments.add(attachment);

        // Construire l'email avec la pièce jointe
        Email email = EmailBuilder.startingBlank()
                .from(fromName, fromAddress)
                .to(recipientName, recipient)
                .withSubject(subject)
                .withPlainText(message)
                .withAttachments(lsAttachments)
                .buildEmail();
        
        Properties smtpProperties = new Properties();
        smtpProperties.put("mail.smtp.localhost", hostname);

        // Configurer le mailer
        Mailer mailer = MailerBuilder
                .withSMTPServer(smtpUrl, smtpPort, login, password)
                .withTransportStrategy(TransportStrategy.SMTP_TLS)
                .withDebugLogging(true)
                .withSessionTimeout(10 * 1000) // 10 secondes de délai
                .buildMailer();

        // Envoyer l'email
        mailer.sendMail(email);
	}
}
