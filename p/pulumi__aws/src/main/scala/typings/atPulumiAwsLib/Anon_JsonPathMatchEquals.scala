package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JsonPathMatchEquals extends js.Object {
  var jsonPath: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var matchEquals: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_JsonPathMatchEquals {
  @scala.inline
  def apply(
    jsonPath: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    matchEquals: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_JsonPathMatchEquals = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any], matchEquals = matchEquals.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_JsonPathMatchEquals]
  }
}

