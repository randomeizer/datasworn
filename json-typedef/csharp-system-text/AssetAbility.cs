// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Datasworn
{
    public class AssetAbility
    {
        /// <summary>
        /// Is this asset ability enabled?
        /// </summary>
        [JsonPropertyName("enabled")]
        public bool Enabled { get; set; }

        /// <summary>
        /// The unique Datasworn ID for this item.
        /// </summary>
        [JsonPropertyName("id")]
        public AssetAbilityId Id { get; set; }

        [JsonPropertyName("text")]
        public MarkdownString Text { get; set; }

        /// <summary>
        /// Fields whose values are expected to change over the life of the
        /// asset.
        /// </summary>
        [JsonPropertyName("controls")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public IDictionary<string, AssetAbilityControlField> Controls { get; set; }

        /// <summary>
        /// Changes made to the asset, when this ability is enabled.
        /// </summary>
        [JsonPropertyName("enhance_asset")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public AssetEnhancement? EnhanceAsset { get; set; }

        /// <summary>
        /// Describes changes made to various moves by this asset ability.
        /// Usually these require specific trigger conditions.
        /// </summary>
        [JsonPropertyName("enhance_moves")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public IList<MoveEnhancement> EnhanceMoves { get; set; }

        /// <summary>
        /// Unique moves added by this asset ability.
        /// </summary>
        [JsonPropertyName("moves")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public IDictionary<string, Move> Moves { get; set; }

        [JsonPropertyName("name")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public Label? Name { get; set; }

        /// <summary>
        /// Fields that are expected to be set once and remain the same through
        /// the life of the asset.
        /// </summary>
        [JsonPropertyName("options")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public IDictionary<string, AssetAbilityOptionField> Options { get; set; }
    }
}