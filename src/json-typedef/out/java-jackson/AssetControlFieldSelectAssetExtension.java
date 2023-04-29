// Code generated by jtd-codegen for Java + Jackson v0.2.1

package Dataforged;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;

@JsonSerialize
public class AssetControlFieldSelectAssetExtension extends AssetControlField {
    @JsonProperty("choices")
    private Map<String, AssetControlFieldSelectAssetExtensionChoice> choices;

    @JsonProperty("id")
    private AssetControlFieldId id;

    @JsonProperty("label")
    private Label label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("value")
    private AssetExtension value;

    public AssetControlFieldSelectAssetExtension() {
    }

    /**
     * Getter for choices.<p>
     */
    public Map<String, AssetControlFieldSelectAssetExtensionChoice> getChoices() {
        return choices;
    }

    /**
     * Setter for choices.<p>
     */
    public void setChoices(Map<String, AssetControlFieldSelectAssetExtensionChoice> choices) {
        this.choices = choices;
    }

    /**
     * Getter for id.<p>
     */
    public AssetControlFieldId getId() {
        return id;
    }

    /**
     * Setter for id.<p>
     */
    public void setId(AssetControlFieldId id) {
        this.id = id;
    }

    /**
     * Getter for label.<p>
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Setter for label.<p>
     */
    public void setLabel(Label label) {
        this.label = label;
    }

    /**
     * Getter for value.<p>
     */
    public AssetExtension getValue() {
        return value;
    }

    /**
     * Setter for value.<p>
     */
    public void setValue(AssetExtension value) {
        this.value = value;
    }
}
