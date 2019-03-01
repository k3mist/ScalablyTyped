package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the setAssociation mixin of the belongsTo association.
  * @see BelongsToSetAssociationMixin
  */
trait BelongsToSetAssociationMixinOptions extends js.Object {
  /**
    * Skip saving this after setting the foreign key if false.
    */
  var save: js.UndefOr[scala.Boolean] = js.undefined
}

object BelongsToSetAssociationMixinOptions {
  @scala.inline
  def apply(save: js.UndefOr[scala.Boolean] = js.undefined): BelongsToSetAssociationMixinOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(save)) __obj.updateDynamic("save")(save)
    __obj.asInstanceOf[BelongsToSetAssociationMixinOptions]
  }
}

