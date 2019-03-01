package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValueDimensionNameValueSource extends js.Object {
  var defaultValue: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var dimensionName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var valueSource: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_DefaultValueDimensionNameValueSource {
  @scala.inline
  def apply(
    defaultValue: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    dimensionName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    valueSource: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_DefaultValueDimensionNameValueSource = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], dimensionName = dimensionName.asInstanceOf[js.Any], valueSource = valueSource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DefaultValueDimensionNameValueSource]
  }
}

