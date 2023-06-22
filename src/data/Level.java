package data;

public enum Level
{
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP LEVEL");

    private String description;

    Level (String description)
    {
        this.description = description;
    }
    public String getDescription()
    {
        return description;
    }

}
