package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessesGrantee extends js.Object {
  var accesses: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  var grantee: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var granteeType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_AccessesGrantee {
  @scala.inline
  def apply(
    accesses: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    grantee: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    granteeType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_AccessesGrantee = {
    val __obj = js.Dynamic.literal()
    if (accesses != null) __obj.updateDynamic("accesses")(accesses.asInstanceOf[js.Any])
    if (grantee != null) __obj.updateDynamic("grantee")(grantee.asInstanceOf[js.Any])
    if (granteeType != null) __obj.updateDynamic("granteeType")(granteeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccessesGrantee]
  }
}

