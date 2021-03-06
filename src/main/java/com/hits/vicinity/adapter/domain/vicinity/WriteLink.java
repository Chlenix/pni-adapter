package com.hits.vicinity.adapter.domain.vicinity;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "href",
        "input",
        "output"
})
public class WriteLink {

    @JsonProperty("href")
    private String href;
    @JsonProperty("input")
    private OutputInputSchema input;
    @JsonProperty("output")
    private OutputInputSchema output;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("input")
    public OutputInputSchema getInput() {
        return input;
    }

    @JsonProperty("input")
    public void setInput(OutputInputSchema input) {
        this.input = input;
    }

    @JsonProperty("output")
    public OutputInputSchema getOutput() {
        return output;
    }

    @JsonProperty("output")
    public void setOutput(OutputInputSchema output) {
        this.output = output;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}