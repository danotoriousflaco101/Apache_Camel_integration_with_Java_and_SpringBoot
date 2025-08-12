package com.flaco.joke_gateway.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * L'annotazione va qui, sulla sua riga,
 * per indicare che si applica all'elemento successivo (la classe).
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Joke {
    private String setup;
    private String punchline;

    // Getter e Setter...
    public String getSetup() { return setup; }
    public void setSetup(String setup) { this.setup = setup; }
    public String getPunchline() { return punchline; }
    public void setPunchline(String punchline) { this.punchline = punchline; }
}