// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Datasworn
{
    [JsonConverter(typeof(DelveCardTypeJsonConverter))]
    public enum DelveCardType
    {
        /// <summary>
        /// A delve site domain card.
        /// </summary>
        Domain,

        /// <summary>
        /// A delve site theme card.
        /// </summary>
        Theme,
    }
    public class DelveCardTypeJsonConverter : JsonConverter<DelveCardType>
    {
        public override DelveCardType Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            string value = JsonSerializer.Deserialize<string>(ref reader, options);
            switch (value)
            {
                case "domain":
                    return DelveCardType.Domain;
                case "theme":
                    return DelveCardType.Theme;
                default:
                    throw new ArgumentException(String.Format("Bad DelveCardType value: {0}", value));
            }
        }

        public override void Write(Utf8JsonWriter writer, DelveCardType value, JsonSerializerOptions options)
        {
            switch (value)
            {
                case DelveCardType.Domain:
                    JsonSerializer.Serialize<string>(writer, "domain", options);
                    return;
                case DelveCardType.Theme:
                    JsonSerializer.Serialize<string>(writer, "theme", options);
                    return;
            }
        }
    }
}