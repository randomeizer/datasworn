// Code generated by jtd-codegen for Java + Jackson v0.2.1

package Dataforged;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class AssetConditionMeterCheckbox {
    @JsonProperty("field_type")
    private AssetConditionMeterCheckboxFieldType fieldType;

    @JsonProperty("id")
    private AssetConditionMeterControlFieldId id;

    @JsonProperty("label")
    private Label label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("value")
    private Boolean value;

    public AssetConditionMeterCheckbox() {
    }

    /**
     * Getter for fieldType.<p>
     */
    public AssetConditionMeterCheckboxFieldType getFieldType() {
        return fieldType;
    }

    /**
     * Setter for fieldType.<p>
     */
    public void setFieldType(AssetConditionMeterCheckboxFieldType fieldType) {
        this.fieldType = fieldType;
    }

    /**
     * Getter for id.<p>
     */
    public AssetConditionMeterControlFieldId getId() {
        return id;
    }

    /**
     * Setter for id.<p>
     */
    public void setId(AssetConditionMeterControlFieldId id) {
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
    public Boolean getValue() {
        return value;
    }

    /**
     * Setter for value.<p>
     */
    public void setValue(Boolean value) {
        this.value = value;
    }
}