// Code generated by jtd-codegen for Java + Jackson v0.2.1

package Datasworn;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;

/**
 * Represents a single Feature entry from a delve site Domain card.
 */
@JsonSerialize
public class DelveSiteDomainFeatureRow {
    @JsonProperty("_id")
    private DomainFeatureRowId id;

    @JsonProperty("max")
    private Short max;

    @JsonProperty("min")
    private Short min;

    @JsonProperty("result")
    private MarkdownString result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("_i18n")
    private I18nHints i18n;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("embed_table")
    private OracleRollableId embedTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("icon")
    private SvgImageUrl icon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("oracle_rolls")
    private List<OracleRoll> oracleRolls;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("suggestions")
    private Suggestions suggestions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("template")
    private OracleRollTemplate template;

    public DelveSiteDomainFeatureRow() {
    }

    /**
     * Getter for id.<p>
     * The unique Datasworn ID for this item.
     */
    public DomainFeatureRowId getId() {
        return id;
    }

    /**
     * Setter for id.<p>
     * The unique Datasworn ID for this item.
     */
    public void setId(DomainFeatureRowId id) {
        this.id = id;
    }

    /**
     * Getter for max.<p>
     * High end of the dice range for this table row.
     */
    public Short getMax() {
        return max;
    }

    /**
     * Setter for max.<p>
     * High end of the dice range for this table row.
     */
    public void setMax(Short max) {
        this.max = max;
    }

    /**
     * Getter for min.<p>
     * Low end of the dice range for this table row.
     */
    public Short getMin() {
        return min;
    }

    /**
     * Setter for min.<p>
     * Low end of the dice range for this table row.
     */
    public void setMin(Short min) {
        this.min = min;
    }

    /**
     * Getter for result.<p>
     * The primary text content of this row.
     */
    public MarkdownString getResult() {
        return result;
    }

    /**
     * Setter for result.<p>
     * The primary text content of this row.
     */
    public void setResult(MarkdownString result) {
        this.result = result;
    }

    /**
     * Getter for i18n.<p>
     */
    public I18nHints getI18n() {
        return i18n;
    }

    /**
     * Setter for i18n.<p>
     */
    public void setI18n(I18nHints i18n) {
        this.i18n = i18n;
    }

    /**
     * Getter for embedTable.<p>
     * Hints that the identified table should be rendered inside this table row.
     */
    public OracleRollableId getEmbedTable() {
        return embedTable;
    }

    /**
     * Setter for embedTable.<p>
     * Hints that the identified table should be rendered inside this table row.
     */
    public void setEmbedTable(OracleRollableId embedTable) {
        this.embedTable = embedTable;
    }

    /**
     * Getter for icon.<p>
     */
    public SvgImageUrl getIcon() {
        return icon;
    }

    /**
     * Setter for icon.<p>
     */
    public void setIcon(SvgImageUrl icon) {
        this.icon = icon;
    }

    /**
     * Getter for oracleRolls.<p>
     * Further oracle rolls prompted by this table row.
     */
    public List<OracleRoll> getOracleRolls() {
        return oracleRolls;
    }

    /**
     * Setter for oracleRolls.<p>
     * Further oracle rolls prompted by this table row.
     */
    public void setOracleRolls(List<OracleRoll> oracleRolls) {
        this.oracleRolls = oracleRolls;
    }

    /**
     * Getter for suggestions.<p>
     */
    public Suggestions getSuggestions() {
        return suggestions;
    }

    /**
     * Setter for suggestions.<p>
     */
    public void setSuggestions(Suggestions suggestions) {
        this.suggestions = suggestions;
    }

    /**
     * Getter for template.<p>
     */
    public OracleRollTemplate getTemplate() {
        return template;
    }

    /**
     * Setter for template.<p>
     */
    public void setTemplate(OracleRollTemplate template) {
        this.template = template;
    }
}
