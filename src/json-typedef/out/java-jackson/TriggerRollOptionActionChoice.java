// Code generated by jtd-codegen for Java + Jackson v0.2.1

package Dataforged;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "using")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "custom_value", value = TriggerRollOptionActionChoiceCustomValue.class),
    @JsonSubTypes.Type(name = "edge", value = TriggerRollOptionActionChoiceEdge.class),
    @JsonSubTypes.Type(name = "health", value = TriggerRollOptionActionChoiceHealth.class),
    @JsonSubTypes.Type(name = "heart", value = TriggerRollOptionActionChoiceHeart.class),
    @JsonSubTypes.Type(name = "iron", value = TriggerRollOptionActionChoiceIron.class),
    @JsonSubTypes.Type(name = "ref", value = TriggerRollOptionActionChoiceRef.class),
    @JsonSubTypes.Type(name = "shadow", value = TriggerRollOptionActionChoiceShadow.class),
    @JsonSubTypes.Type(name = "spirit", value = TriggerRollOptionActionChoiceSpirit.class),
    @JsonSubTypes.Type(name = "supply", value = TriggerRollOptionActionChoiceSupply.class),
    @JsonSubTypes.Type(name = "wits", value = TriggerRollOptionActionChoiceWits.class),
})
public abstract class TriggerRollOptionActionChoice {
}
