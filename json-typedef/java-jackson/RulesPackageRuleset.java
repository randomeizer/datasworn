// Code generated by jtd-codegen for Java + Jackson v0.2.1

package Datasworn;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * A standalone Datasworn package that describes its own ruleset.
 */
@JsonSerialize
public class RulesPackageRuleset extends RulesPackage {
    @JsonProperty("_id")
    private RulesetId id;

    @JsonProperty("assets")
    private Map<String, AssetCollection> assets;

    @JsonProperty("authors")
    private List<AuthorInfo> authors;

    @JsonProperty("datasworn_version")
    private SemanticVersion dataswornVersion;

    @JsonProperty("date")
    private OffsetDateTime date;

    @JsonProperty("license")
    private License license;

    @JsonProperty("moves")
    private Map<String, MoveCategory> moves;

    @JsonProperty("oracles")
    private Map<String, OracleTablesCollection> oracles;

    @JsonProperty("rules")
    private Rules rules;

    @JsonProperty("title")
    private String title;

    @JsonProperty("url")
    private WebUrl url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("atlas")
    private Map<String, Atlas> atlas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("delve_sites")
    private Map<String, DelveSite> delveSites;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("npcs")
    private Map<String, NpcCollection> npcs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("rarities")
    private Map<String, Rarity> rarities;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("site_domains")
    private Map<String, DelveSiteDomain> siteDomains;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("site_themes")
    private Map<String, DelveSiteTheme> siteThemes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("truths")
    private Map<String, Truth> truths;

    public RulesPackageRuleset() {
    }

    /**
     * Getter for id.<p>
     */
    public RulesetId getId() {
        return id;
    }

    /**
     * Setter for id.<p>
     */
    public void setId(RulesetId id) {
        this.id = id;
    }

    /**
     * Getter for assets.<p>
     * A dictionary object containing asset collections, which contain assets.
     */
    public Map<String, AssetCollection> getAssets() {
        return assets;
    }

    /**
     * Setter for assets.<p>
     * A dictionary object containing asset collections, which contain assets.
     */
    public void setAssets(Map<String, AssetCollection> assets) {
        this.assets = assets;
    }

    /**
     * Getter for authors.<p>
     * Lists authors credited by the source material.
     */
    public List<AuthorInfo> getAuthors() {
        return authors;
    }

    /**
     * Setter for authors.<p>
     * Lists authors credited by the source material.
     */
    public void setAuthors(List<AuthorInfo> authors) {
        this.authors = authors;
    }

    /**
     * Getter for dataswornVersion.<p>
     * The version of the Datasworn format used by this data.
     */
    public SemanticVersion getDataswornVersion() {
        return dataswornVersion;
    }

    /**
     * Setter for dataswornVersion.<p>
     * The version of the Datasworn format used by this data.
     */
    public void setDataswornVersion(SemanticVersion dataswornVersion) {
        this.dataswornVersion = dataswornVersion;
    }

    /**
     * Getter for date.<p>
     * The date of the source documents's last update, formatted YYYY-MM-DD.
     * Required because it's used to determine whether the data needs updating.
     */
    public OffsetDateTime getDate() {
        return date;
    }

    /**
     * Setter for date.<p>
     * The date of the source documents's last update, formatted YYYY-MM-DD.
     * Required because it's used to determine whether the data needs updating.
     */
    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    /**
     * Getter for license.<p>
     */
    public License getLicense() {
        return license;
    }

    /**
     * Setter for license.<p>
     */
    public void setLicense(License license) {
        this.license = license;
    }

    /**
     * Getter for moves.<p>
     * A dictionary object containing move categories, which contain moves.
     */
    public Map<String, MoveCategory> getMoves() {
        return moves;
    }

    /**
     * Setter for moves.<p>
     * A dictionary object containing move categories, which contain moves.
     */
    public void setMoves(Map<String, MoveCategory> moves) {
        this.moves = moves;
    }

    /**
     * Getter for oracles.<p>
     * A dictionary object containing oracle collections, which may contain
     * oracle tables and/or oracle collections.
     */
    public Map<String, OracleTablesCollection> getOracles() {
        return oracles;
    }

    /**
     * Setter for oracles.<p>
     * A dictionary object containing oracle collections, which may contain
     * oracle tables and/or oracle collections.
     */
    public void setOracles(Map<String, OracleTablesCollection> oracles) {
        this.oracles = oracles;
    }

    /**
     * Getter for rules.<p>
     */
    public Rules getRules() {
        return rules;
    }

    /**
     * Setter for rules.<p>
     */
    public void setRules(Rules rules) {
        this.rules = rules;
    }

    /**
     * Getter for title.<p>
     * The title of the source document.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter for title.<p>
     * The title of the source document.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for url.<p>
     * A URL where the source document is available.
     */
    public WebUrl getUrl() {
        return url;
    }

    /**
     * Setter for url.<p>
     * A URL where the source document is available.
     */
    public void setUrl(WebUrl url) {
        this.url = url;
    }

    /**
     * Getter for atlas.<p>
     * A dictionary object containing atlas collections, which contain atlas
     * entries.
     */
    public Map<String, Atlas> getAtlas() {
        return atlas;
    }

    /**
     * Setter for atlas.<p>
     * A dictionary object containing atlas collections, which contain atlas
     * entries.
     */
    public void setAtlas(Map<String, Atlas> atlas) {
        this.atlas = atlas;
    }

    /**
     * Getter for delveSites.<p>
     * A dictionary object of delve sites, like the premade delve sites
     * presented in Ironsworn: Delve
     */
    public Map<String, DelveSite> getDelveSites() {
        return delveSites;
    }

    /**
     * Setter for delveSites.<p>
     * A dictionary object of delve sites, like the premade delve sites
     * presented in Ironsworn: Delve
     */
    public void setDelveSites(Map<String, DelveSite> delveSites) {
        this.delveSites = delveSites;
    }

    /**
     * Getter for npcs.<p>
     * A dictionary object containing NPC collections, which contain NPCs.
     */
    public Map<String, NpcCollection> getNpcs() {
        return npcs;
    }

    /**
     * Setter for npcs.<p>
     * A dictionary object containing NPC collections, which contain NPCs.
     */
    public void setNpcs(Map<String, NpcCollection> npcs) {
        this.npcs = npcs;
    }

    /**
     * Getter for rarities.<p>
     * A dictionary object containing rarities, like those presented in
     * Ironsworn: Delve.
     */
    public Map<String, Rarity> getRarities() {
        return rarities;
    }

    /**
     * Setter for rarities.<p>
     * A dictionary object containing rarities, like those presented in
     * Ironsworn: Delve.
     */
    public void setRarities(Map<String, Rarity> rarities) {
        this.rarities = rarities;
    }

    /**
     * Getter for siteDomains.<p>
     * A dictionary object containing delve site domains.
     */
    public Map<String, DelveSiteDomain> getSiteDomains() {
        return siteDomains;
    }

    /**
     * Setter for siteDomains.<p>
     * A dictionary object containing delve site domains.
     */
    public void setSiteDomains(Map<String, DelveSiteDomain> siteDomains) {
        this.siteDomains = siteDomains;
    }

    /**
     * Getter for siteThemes.<p>
     * A dictionary object containing delve site themes.
     */
    public Map<String, DelveSiteTheme> getSiteThemes() {
        return siteThemes;
    }

    /**
     * Setter for siteThemes.<p>
     * A dictionary object containing delve site themes.
     */
    public void setSiteThemes(Map<String, DelveSiteTheme> siteThemes) {
        this.siteThemes = siteThemes;
    }

    /**
     * Getter for truths.<p>
     * A dictionary object of truth categories.
     */
    public Map<String, Truth> getTruths() {
        return truths;
    }

    /**
     * Setter for truths.<p>
     * A dictionary object of truth categories.
     */
    public void setTruths(Map<String, Truth> truths) {
        this.truths = truths;
    }
}
