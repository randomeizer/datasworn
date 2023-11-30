// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Datasworn
{
    /// <summary>
    /// A unique ID for an ImpactRuleCollection.
    /// </summary>
    [JsonConverter(typeof(ImpactRuleCollectionIdJsonConverter))]
    public class ImpactRuleCollectionId
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public string Value { get; set; }
    }

    public class ImpactRuleCollectionIdJsonConverter : JsonConverter<ImpactRuleCollectionId>
    {
        public override ImpactRuleCollectionId Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new ImpactRuleCollectionId { Value = JsonSerializer.Deserialize<string>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, ImpactRuleCollectionId value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<string>(writer, value.Value, options);
        }
    }
}
