package Report;

/*
*
* SlackApi api = new SlackApi("https://hooks.slack.com/services/id_1/id_2/token");
* api.call(new SlackMessage("#general", "Mafagafo", "my message"));
*
* */
public interface RemoteReporter {
    void report(String message);
}
