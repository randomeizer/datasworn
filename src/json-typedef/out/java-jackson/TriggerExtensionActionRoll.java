// Code generated by jtd-codegen for Java + Jackson v0.2.1

package Dataforged;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;

/**
 * Extends or upgrades an existing action roll trigger.
 */
@JsonSerialize
public class TriggerExtensionActionRoll extends TriggerExtension {
    @JsonProperty("roll_options")
    private List<TriggerRollOptionAction> rollOptions;

    public TriggerExtensionActionRoll() {
    }

    /**
     * Getter for rollOptions.<p>
     */
    public List<TriggerRollOptionAction> getRollOptions() {
        return rollOptions;
    }

    /**
     * Setter for rollOptions.<p>
     */
    public void setRollOptions(List<TriggerRollOptionAction> rollOptions) {
        this.rollOptions = rollOptions;
    }
}
