package br.com.patterns.structural.adapter;

import br.com.patterns.structural.adapter.adapter.SlackAdapterService;
import br.com.patterns.structural.adapter.api.client.SlackApiClient;
import br.com.patterns.structural.adapter.service.EmailService;

public class App {

    public static void main(String[] args) {
        System.out.println("::: Adapter :::");

        var emailService = new EmailService();
        emailService.sendMessage("Adapter With Java", "Testing Adapter Pattern");

        var slackAdapterService = new SlackAdapterService(new SlackApiClient("rafaaalberto", "123"));
        slackAdapterService.sendMessage("Slack notification", "Sending message to Slack");
    }

}
