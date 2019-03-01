package typings
package webgmeLib.GmeClassesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaSetParameters extends js.Object {
  /**
    * if true, 
    * the query tries to filter out even 
    * more nodes according to the multiplicity rules 
    * (the default value is false, 
    * the check is only meaningful if all the children were passed)
    */
  var multiplicity: js.UndefOr[scala.Boolean] = js.undefined
  /** the input parameters of the query. */
  var `object`: webgmeLib.Anon_Members
  /** 
    * if true, the query filters out the 
    * abstract and connection-like nodes 
    * (the default value is false) 
    */
  var sensitive: js.UndefOr[scala.Boolean] = js.undefined
}

object MetaSetParameters {
  @scala.inline
  def apply(
    `object`: webgmeLib.Anon_Members,
    multiplicity: js.UndefOr[scala.Boolean] = js.undefined,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): MetaSetParameters = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    if (!js.isUndefined(multiplicity)) __obj.updateDynamic("multiplicity")(multiplicity)
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    __obj.asInstanceOf[MetaSetParameters]
  }
}

