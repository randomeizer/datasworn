// Code generated by jtd-codegen for Java + Jackson v0.2.1

package Dataforged;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class AssetAbilityOptionFieldText extends AssetAbilityOptionField {
    @JsonProperty("id")
    private AssetOptionFieldId id;

    @JsonProperty("label")
    private Label label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("value")
    private String value;

    public AssetAbilityOptionFieldText() {
    }

    /**
     * Getter for id.<p>
     */
    public AssetOptionFieldId getId() {
        return id;
    }

    /**
     * Setter for id.<p>
     */
    public void setId(AssetOptionFieldId id) {
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
    public String getValue() {
        return value;
    }

    /**
     * Setter for value.<p>
     */
    public void setValue(String value) {
        this.value = value;
    }
}
