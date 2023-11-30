// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Datasworn
{
    /// <summary>
    /// Roll using the value of an attached asset option.
    /// </summary>
    public class ActionRollOptionAttachedAssetOption : ActionRollOption
    {
        [JsonPropertyName("using")]
        public string Using { get => "attached_asset_option"; }

        /// <summary>
        /// The dictionary key of the asset option field.
        /// </summary>
        [JsonPropertyName("option")]
        public DictKey Option { get; set; }
    }
}
