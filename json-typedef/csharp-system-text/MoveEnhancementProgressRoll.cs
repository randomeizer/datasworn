// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Datasworn
{
    /// <summary>
    /// An object that describes changes to a move. These changes should be
    /// applied recursively, altering only the specified properties; enhanced
    /// arrays should be concatencated with the original array value.
    /// </summary>
    public class MoveEnhancementProgressRoll : MoveEnhancement
    {
        [JsonPropertyName("roll_type")]
        public string RollType { get => "progress_roll"; }

        [JsonPropertyName("enhances")]
        public IList<MoveIdWildcard> Enhances { get; set; }

        [JsonPropertyName("trigger")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public TriggerProgressRollEnhancement? Trigger { get; set; }
    }
}
