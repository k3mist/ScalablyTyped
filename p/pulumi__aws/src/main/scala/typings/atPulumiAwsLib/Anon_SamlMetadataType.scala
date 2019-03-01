package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SamlMetadataType extends js.Object {
  var samlMetadata: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_SamlMetadataType {
  @scala.inline
  def apply(
    samlMetadata: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_SamlMetadataType = {
    val __obj = js.Dynamic.literal(samlMetadata = samlMetadata.asInstanceOf[js.Any], `type` = `type`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SamlMetadataType]
  }
}

