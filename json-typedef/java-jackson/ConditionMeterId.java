// Code generated by jtd-codegen for Java + Jackson v0.2.1

package Datasworn;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A basic, rollable player character resource.
 */
public class ConditionMeterId {
    @JsonValue
    private DictKey value;

    public ConditionMeterId() {
    }

    @JsonCreator
    public ConditionMeterId(DictKey value) {
        this.value = value;
    }

    public DictKey getValue() {
        return value;
    }

    public void setValue(DictKey value) {
        this.value = value;
    }
}