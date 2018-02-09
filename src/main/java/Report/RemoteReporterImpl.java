package Report;

import net.gpedro.integrations.slack.SlackApi;
import net.gpedro.integrations.slack.SlackMessage;

public class RemoteReporterImpl implements RemoteReporter {
    private String service;
    private String sender;
    private String channel;
    private SlackApi api;

    public RemoteReporterImpl(String service, String sender, String channel) {
        this.service = service;
        this.sender = sender;
        this.channel = channel;
        this.api = new SlackApi(service);
    }

    public void report(String message) {
        api.call(new SlackMessage(channel, sender, message));
        System.out.println(message);
    }
}
