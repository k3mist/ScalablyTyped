package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the setAssociation mixin of the hasOne association.
  * @see HasOneSetAssociationMixin
  */
trait HasOneSetAssociationMixinOptions extends js.Object {
  /**
    * Skip saving this after setting the foreign key if false.
    */
  var save: js.UndefOr[scala.Boolean] = js.undefined
}

object HasOneSetAssociationMixinOptions {
  @scala.inline
  def apply(save: js.UndefOr[scala.Boolean] = js.undefined): HasOneSetAssociationMixinOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(save)) __obj.updateDynamic("save")(save)
    __obj.asInstanceOf[HasOneSetAssociationMixinOptions]
  }
}

