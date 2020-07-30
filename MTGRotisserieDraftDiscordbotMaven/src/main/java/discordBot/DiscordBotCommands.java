package discordBot;

public enum DiscordBotCommands {
    cardImg ("!cardImg"),



    ;
    private String command;

    private DiscordBotCommands(String command){
        this.command = command;
    }

    public String getCommand(){
        return command;
    }
}
