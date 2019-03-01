package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the addAssociation mixin of the hasMany association.
  * @see HasManyAddAssociationMixin
  */
trait HasManyAddAssociationMixinOptions extends js.Object {
  /**
    * Run validation for the join model.
    */
  var validate: js.UndefOr[scala.Boolean] = js.undefined
}

object HasManyAddAssociationMixinOptions {
  @scala.inline
  def apply(validate: js.UndefOr[scala.Boolean] = js.undefined): HasManyAddAssociationMixinOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[HasManyAddAssociationMixinOptions]
  }
}

