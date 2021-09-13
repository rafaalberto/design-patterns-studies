package br.com.patterns.structural.adapter.api.client;

public class SlackApiClient {

    private final String login;
    private final String apiKey;

    public SlackApiClient(String login, String apiKey) {
        this.login = login;
        this.apiKey = apiKey;
    }

    public void sendMessage(String message) {
        System.out.println("Sending slack message: " + message);
    }

}
