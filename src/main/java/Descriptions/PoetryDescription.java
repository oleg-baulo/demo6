package Descriptions;

public class PoetryDescription {
    private String name;
    private String verse;

    public PoetryDescription(String name, String verse) {
        this.name = name;
        this.verse = verse;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getVerse() {return verse;}
    public void setVerse(String verse) {this.verse = verse;}
}
