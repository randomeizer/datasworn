// Code generated by jtd-codegen for Java + Jackson v0.2.1

package Datasworn;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;

@JsonSerialize
public class OracleCollectionRendering {
    @JsonProperty("columns")
    private Map<String, OracleCollectionTableColumn> columns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("color")
    private CssColor color;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("table_style")
    private OracleCollectionStyle tableStyle;

    public OracleCollectionRendering() {
    }

    /**
     * Getter for columns.<p>
     */
    public Map<String, OracleCollectionTableColumn> getColumns() {
        return columns;
    }

    /**
     * Setter for columns.<p>
     */
    public void setColumns(Map<String, OracleCollectionTableColumn> columns) {
        this.columns = columns;
    }

    /**
     * Getter for color.<p>
     */
    public CssColor getColor() {
        return color;
    }

    /**
     * Setter for color.<p>
     */
    public void setColor(CssColor color) {
        this.color = color;
    }

    /**
     * Getter for tableStyle.<p>
     */
    public OracleCollectionStyle getTableStyle() {
        return tableStyle;
    }

    /**
     * Setter for tableStyle.<p>
     */
    public void setTableStyle(OracleCollectionStyle tableStyle) {
        this.tableStyle = tableStyle;
    }
}
