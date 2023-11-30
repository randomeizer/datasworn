// Code generated by jtd-codegen for Java + Jackson v0.2.1

package Datasworn;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A unique ID for a DomainFeatureRow.
 */
public class DomainFeatureRowId {
    @JsonValue
    private String value;

    public DomainFeatureRowId() {
    }

    @JsonCreator
    public DomainFeatureRowId(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
