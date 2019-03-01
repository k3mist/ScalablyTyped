package typings
package jsDashDataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllOf extends js.Object {
  def allOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]
  def anyOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]
  def dependencies(value: js.Any, schema: js.Any, opts: js.Any): scala.Unit
  def enum(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def items(value: js.Any, schema: js.Any, opts: js.Any): js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]
  def maxItems(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def maxLength(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def maxProperties(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def maximum(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def minItems(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def minLength(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def minProperties(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def minimum(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def multipleOf(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def not(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def oneOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]
  def pattern(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def properties(value: js.Any, schema: js.Any, opts: js.Any): js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]
  def required(value: js.Any, schema: js.Any, opts: js.Any): js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]
  def `type`(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def uniqueItems(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
}

object Anon_AllOf {
  @scala.inline
  def apply(
    allOf: js.Function3[js.Any, js.Any, js.Any, js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]],
    anyOf: js.Function3[js.Any, js.Any, js.Any, js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]],
    dependencies: js.Function3[js.Any, js.Any, js.Any, scala.Unit],
    enum: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    items: js.Function3[js.Any, js.Any, js.Any, js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]],
    maxItems: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    maxLength: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    maxProperties: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    maximum: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    minItems: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    minLength: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    minProperties: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    minimum: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    multipleOf: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    not: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    oneOf: js.Function3[js.Any, js.Any, js.Any, js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]],
    pattern: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    properties: js.Function3[js.Any, js.Any, js.Any, js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]],
    required: js.Function3[js.Any, js.Any, js.Any, js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]],
    `type`: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    uniqueItems: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError]
  ): Anon_AllOf = {
    val __obj = js.Dynamic.literal(allOf = allOf, anyOf = anyOf, dependencies = dependencies, enum = enum, items = items, maxItems = maxItems, maxLength = maxLength, maxProperties = maxProperties, maximum = maximum, minItems = minItems, minLength = minLength, minProperties = minProperties, minimum = minimum, multipleOf = multipleOf, not = not, oneOf = oneOf, pattern = pattern, properties = properties, required = required, `type` = `type`, uniqueItems = uniqueItems)
  
    __obj.asInstanceOf[Anon_AllOf]
  }
}

