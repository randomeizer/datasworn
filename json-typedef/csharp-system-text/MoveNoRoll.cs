// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Datasworn
{
    /// <summary>
    /// A move that makes no progress rolls or action rolls.
    /// </summary>
    public class MoveNoRoll : Move
    {
        [JsonPropertyName("roll_type")]
        public string RollType { get => "no_roll"; }

        /// <summary>
        /// The unique Datasworn ID for this item.
        /// </summary>
        [JsonPropertyName("_id")]
        public MoveId Id { get; set; }

        /// <summary>
        /// The primary name/label for this item.
        /// </summary>
        [JsonPropertyName("name")]
        public Label Name { get; set; }

        /// <summary>
        /// Attribution for the original source (such as a book or website) of
        /// this item, including the author and licensing information.
        /// </summary>
        [JsonPropertyName("source")]
        public SourceInfo Source { get; set; }

        /// <summary>
        /// The complete rules text of the move.
        /// </summary>
        [JsonPropertyName("text")]
        public MarkdownString Text { get; set; }

        /// <summary>
        /// Trigger conditions for this move.
        /// </summary>
        [JsonPropertyName("trigger")]
        public TriggerNoRoll Trigger { get; set; }

        /// <summary>
        /// The name of this item as it appears on the page in the book, if it's
        /// different from `name`.
        /// </summary>
        [JsonPropertyName("canonical_name")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public Label? CanonicalName { get; set; }

        /// <summary>
        /// Oracles associated with this move. It's not recommended to roll
        /// these automatically, as almost all moves present them as an option,
        /// not a requirement.
        /// </summary>
        [JsonPropertyName("oracles")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public IList<OracleRollableId> Oracles { get; set; }

        /// <summary>
        /// Indicates that this move replaces the identified move. References to
        /// the replaced move can be considered equivalent to this move.
        /// </summary>
        [JsonPropertyName("replaces")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public MoveId? Replaces { get; set; }

        [JsonPropertyName("suggestions")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public Suggestions? Suggestions { get; set; }

        [JsonPropertyName("tags")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public IDictionary<string, IDictionary<string, Tag>> Tags { get; set; }
    }
}
