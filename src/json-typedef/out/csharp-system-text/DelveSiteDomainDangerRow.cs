// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Datasworn
{
    public class DelveSiteDomainDangerRow
    {
        [JsonPropertyName("id")]
        public DomainDangerRowId Id { get; set; }

        /// <summary>
        /// High end of the dice range for this table row. `null` represents an
        /// unrollable row, included only for rendering purposes.
        /// </summary>
        [JsonPropertyName("max")]
        public short Max { get; set; }

        /// <summary>
        /// Low end of the dice range for this table row. `null` represents an
        /// unrollable row, included only for rendering purposes.
        /// </summary>
        [JsonPropertyName("min")]
        public short Min { get; set; }

        [JsonPropertyName("result")]
        public MarkdownString Result { get; set; }

        [JsonPropertyName("description")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public MarkdownString? Description { get; set; }

        [JsonPropertyName("embed_table")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public OracleTableId? EmbedTable { get; set; }

        [JsonPropertyName("i18n")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public I18nHints? I18n { get; set; }

        [JsonPropertyName("icon")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public SvgImageUrl? Icon { get; set; }

        [JsonPropertyName("rolls")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public IList<OracleTableRoll> Rolls { get; set; }

        [JsonPropertyName("suggestions")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public Suggestions? Suggestions { get; set; }

        [JsonPropertyName("summary")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public MarkdownString? Summary { get; set; }

        [JsonPropertyName("template")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public OracleRollTemplate? Template { get; set; }
    }
}
