package typings
package asn1jsLib.asn1jsMod.Asn1jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalIdentificationBlockParams extends js.Object {
  var idBlock: js.UndefOr[LocalHexBlockParams with asn1jsLib.Anon_IsConstructed] = js.undefined
}

object LocalIdentificationBlockParams {
  @scala.inline
  def apply(idBlock: LocalHexBlockParams with asn1jsLib.Anon_IsConstructed = null): LocalIdentificationBlockParams = {
    val __obj = js.Dynamic.literal()
    if (idBlock != null) __obj.updateDynamic("idBlock")(idBlock)
    __obj.asInstanceOf[LocalIdentificationBlockParams]
  }
}

