package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExclusionsPath extends js.Object {
  var exclusions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  var path: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_ExclusionsPath {
  @scala.inline
  def apply(
    path: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    exclusions: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null
  ): Anon_ExclusionsPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExclusionsPath]
  }
}

