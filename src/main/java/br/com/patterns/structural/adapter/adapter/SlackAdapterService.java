package br.com.patterns.structural.adapter.adapter;

import br.com.patterns.structural.adapter.service.NotificationService;
import br.com.patterns.structural.adapter.api.client.SlackApiClient;

public class SlackAdapterService implements NotificationService {

    private final SlackApiClient slackApiService;

    public SlackAdapterService(SlackApiClient slackApiService) {
        this.slackApiService = slackApiService;
    }

    @Override
    public void sendMessage(String title, String message) {
        slackApiService.sendMessage(message);
    }

}
