/* 
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// AdditionalPropertiesClass
    /// </summary>
    [DataContract]
    public partial class AdditionalPropertiesClass :  IEquatable<AdditionalPropertiesClass>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AdditionalPropertiesClass" /> class.
        /// </summary>
        /// <param name="MapProperty">MapProperty.</param>
        /// <param name="MapOfMapProperty">MapOfMapProperty.</param>
        public AdditionalPropertiesClass(Dictionary<string, string> MapProperty = default(Dictionary<string, string>), Dictionary<string, Dictionary<string, string>> MapOfMapProperty = default(Dictionary<string, Dictionary<string, string>>))
        {
            this.MapProperty = MapProperty;
            this.MapOfMapProperty = MapOfMapProperty;
        }
        
        /// <summary>
        /// Gets or Sets MapProperty
        /// </summary>
        [DataMember(Name="map_property", EmitDefaultValue=false)]
        public Dictionary<string, string> MapProperty { get; set; }

        /// <summary>
        /// Gets or Sets MapOfMapProperty
        /// </summary>
        [DataMember(Name="map_of_map_property", EmitDefaultValue=false)]
        public Dictionary<string, Dictionary<string, string>> MapOfMapProperty { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AdditionalPropertiesClass {\n");
            sb.Append("  MapProperty: ").Append(MapProperty).Append("\n");
            sb.Append("  MapOfMapProperty: ").Append(MapOfMapProperty).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as AdditionalPropertiesClass);
        }

        /// <summary>
        /// Returns true if AdditionalPropertiesClass instances are equal
        /// </summary>
        /// <param name="input">Instance of AdditionalPropertiesClass to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AdditionalPropertiesClass input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.MapProperty == input.MapProperty ||
                    this.MapProperty != null &&
                    this.MapProperty.SequenceEqual(input.MapProperty)
                ) && 
                (
                    this.MapOfMapProperty == input.MapOfMapProperty ||
                    this.MapOfMapProperty != null &&
                    this.MapOfMapProperty.SequenceEqual(input.MapOfMapProperty)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.MapProperty != null)
                    hashCode = hashCode * 59 + this.MapProperty.GetHashCode();
                if (this.MapOfMapProperty != null)
                    hashCode = hashCode * 59 + this.MapOfMapProperty.GetHashCode();
                return hashCode;
            }
        }
    }

}
