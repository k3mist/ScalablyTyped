package typings
package jsonschemaLib.jsonschemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonschema", "Validator")
@js.native
class Validator () extends js.Object {
  var attributes: org.scalablytyped.runtime.StringDictionary[CustomProperty] = js.native
  var customFormats: org.scalablytyped.runtime.StringDictionary[CustomFormat] = js.native
  var schemas: org.scalablytyped.runtime.StringDictionary[Schema] = js.native
  var unresolvedRefs: js.Array[java.lang.String] = js.native
  def addSchema(): Schema | scala.Unit = js.native
  def addSchema(schema: Schema): Schema | scala.Unit = js.native
  def addSchema(schema: Schema, uri: java.lang.String): Schema | scala.Unit = js.native
  def validate(instance: js.Any, schema: Schema): ValidatorResult = js.native
  def validate(instance: js.Any, schema: Schema, options: Options): ValidatorResult = js.native
  def validate(instance: js.Any, schema: Schema, options: Options, ctx: SchemaContext): ValidatorResult = js.native
}

