// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Datasworn
{
    /// <summary>
    /// A unique ID for a ThemeFeatureRow.
    /// </summary>
    [JsonConverter(typeof(ThemeFeatureRowIdJsonConverter))]
    public class ThemeFeatureRowId
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public string Value { get; set; }
    }

    public class ThemeFeatureRowIdJsonConverter : JsonConverter<ThemeFeatureRowId>
    {
        public override ThemeFeatureRowId Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new ThemeFeatureRowId { Value = JsonSerializer.Deserialize<string>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, ThemeFeatureRowId value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<string>(writer, value.Value, options);
        }
    }
}
