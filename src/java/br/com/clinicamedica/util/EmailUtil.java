package br.com.clinicamedica.util;

import br.com.clinicamedica.model.Email;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailUtil {

    public boolean enviarNotificaoCadastro(Email email) {

        try {
            Properties props = System.getProperties();

            String from = "projClinica4b@gmail.com";
            String host = "smtp.gmail.com";
            String pass = "pc20184B";
            String nome = "Projeto Clinica";

            String to = email.getEmail();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.user", from);
            props.put("mail.smtp.password", pass);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);
            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(from));

            InternetAddress obj = new InternetAddress(email.getEmail());

            message.addRecipient(Message.RecipientType.TO, obj);

            message.setSubject("Bem vindo");

            message.setContent("<html><body><h1>Olá," + email.getNome() + "</h1><h2>Seja bem vindo(a) ao nosso sistema...</h2><p><a href='http://www.uol.com.br'> clique aqui </a></p></body></html>", "text/html; charset=utf-8");

            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro(EmailUtil): "+ e.getMessage());
            return false;
        }
    }

    public boolean enviarNotificacaoAgendamento(Email email) {

        try {
            Properties props = System.getProperties();

            String from = "testetads2@gmail.com";
            String host = "smtp.gmail.com";
            String pass = "senhasenha";
            String nome = email.getNome();

            String to = email.getEmail(); //aqui sera o email para quem vc vai enviar a mensagem

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.user", from);
            props.put("mail.smtp.password", pass);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);
            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(from));

            // To get the array of addresses
            InternetAddress obj = new InternetAddress(to);

            message.addRecipient(Message.RecipientType.TO, obj);

            message.setSubject("Bem vindo");

            message.setContent("<html><body><h1>Olá," + nome + "</h1><h2>Seja bem vindo(a) ao nosso sistema...</h2><p><a href='http://www.uol.com.br'> clique aqui </a></p></body></html>", "text/html; charset=utf-8");

            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            return true;
        } catch (Exception e) {
           System.out.println("Erro(EmailUtil): "+ e.getMessage());
            return false;
        }
    }
}
