// Code generated by jtd-codegen for Java + Jackson v0.2.1

package Dataforged;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;

@JsonSerialize
public class OracleCollectionRendering {
    @JsonProperty("columns")
    private Map<String, OracleCollectionColumn> columns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("color")
    private Color color;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("style")
    private OracleCollectionStyle style;

    public OracleCollectionRendering() {
    }

    /**
     * Getter for columns.<p>
     */
    public Map<String, OracleCollectionColumn> getColumns() {
        return columns;
    }

    /**
     * Setter for columns.<p>
     */
    public void setColumns(Map<String, OracleCollectionColumn> columns) {
        this.columns = columns;
    }

    /**
     * Getter for color.<p>
     */
    public Color getColor() {
        return color;
    }

    /**
     * Setter for color.<p>
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Getter for style.<p>
     */
    public OracleCollectionStyle getStyle() {
        return style;
    }

    /**
     * Setter for style.<p>
     */
    public void setStyle(OracleCollectionStyle style) {
        this.style = style;
    }
}